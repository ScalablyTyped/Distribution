package typings.angularCompilerCli

import typings.angularCompiler.mod.AST
import typings.angularCompiler.mod.LiteralPrimitive
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.PropertyRead
import typings.angularCompiler.mod.SafePropertyRead
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstTextAttribute
import typings.angularCompilerCli.anon.Attribute
import typings.angularCompilerCli.anon.End
import typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.FullTemplateMapping
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.NgTemplateDiagnostic
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckableDirectiveMeta
import typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.GlobalCompletion
import typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.DirectiveInScope
import typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PipeInScope
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.Symbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TcbLocation
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol
import typings.std.Map
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Decorator
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticCategory
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckApiCheckerMod {
  
  @js.native
  sealed trait OptimizeFor extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api/checker", "OptimizeFor")
  @js.native
  object OptimizeFor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptimizeFor & Double] = js.native
    
    /**
      * Indicates that a consumer of a `TemplateTypeChecker` is only interested in results for a
      * given file, and wants them as fast as possible.
      *
      * Calling `TemplateTypeChecker` methods successively for multiple files while specifying
      * `OptimizeFor.SingleFile` can result in significant unnecessary overhead overall.
      */
    @js.native
    sealed trait SingleFile
      extends StObject
         with OptimizeFor
    /* 0 */ val SingleFile: typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor.SingleFile & Double = js.native
    
    /**
      * Indicates that a consumer of a `TemplateTypeChecker` intends to query for results pertaining
      * to the entire user program, and so the type-checker should internally optimize for this case.
      *
      * Initial calls to retrieve type-checking information may take longer, but repeated calls to
      * gather information for the whole user program will be significantly faster with this mode of
      * optimization.
      */
    @js.native
    sealed trait WholeProgram
      extends StObject
         with OptimizeFor
    /* 1 */ val WholeProgram: typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor.WholeProgram & Double = js.native
  }
  
  @js.native
  trait TemplateTypeChecker extends StObject {
    
    /**
      * Ensures shims for the whole program are generated. This type of operation would be required by
      * operations like "find references" and "refactor/rename" because references may appear in type
      * check blocks generated from templates anywhere in the program.
      */
    def generateAllTypeCheckBlocks(): Unit = js.native
    
    /**
      * Get all `ts.Diagnostic`s currently available that pertain to the given component.
      *
      * This method always runs in `OptimizeFor.SingleFile` mode.
      */
    def getDiagnosticsForComponent(component: ClassDeclaration): js.Array[Diagnostic] = js.native
    
    /**
      * Get all `ts.Diagnostic`s currently available for the given `ts.SourceFile`.
      *
      * This method will fail (throw) if there are components within the `ts.SourceFile` that do not
      * have TCBs available.
      *
      * Generating a template type-checking program is expensive, and in some workflows (e.g. checking
      * an entire program before emit), it should ideally only be done once. The `optimizeFor` flag
      * allows the caller to hint to `getDiagnosticsForFile` (which internally will create a template
      * type-checking program if needed) whether the caller is interested in just the results of the
      * single file, or whether they plan to query about other files in the program. Based on this
      * flag, `getDiagnosticsForFile` will determine how much of the user's program to prepare for
      * checking as part of the template type-checking program it creates.
      */
    def getDiagnosticsForFile(sf: SourceFile, optimizeFor: OptimizeFor): js.Array[Diagnostic] = js.native
    
    /**
      * Retrieve the type checking engine's metadata for the given directive class, if available.
      */
    def getDirectiveMetadata(dir: ClassDeclaration): TypeCheckableDirectiveMeta | Null = js.native
    
    /**
      * Get basic metadata on the directives which are in scope for the given component.
      */
    def getDirectivesInScope(component: ClassDeclaration): js.Array[DirectiveInScope] | Null = js.native
    
    /**
      * For the given expression node, retrieve a `TcbLocation` that can be used to perform
      * autocompletion at that point in the expression, if such a location exists.
      */
    def getExpressionCompletionLocation(expr: PropertyRead, component: ClassDeclaration): TcbLocation | Null = js.native
    def getExpressionCompletionLocation(expr: SafePropertyRead, component: ClassDeclaration): TcbLocation | Null = js.native
    
    def getGlobalCompletions(context: Null, component: ClassDeclaration, node: AST): GlobalCompletion | Null = js.native
    def getGlobalCompletions(context: Null, component: ClassDeclaration, node: TmplAstNode): GlobalCompletion | Null = js.native
    /**
      * Get "global" `Completion`s in the given context.
      *
      * Global completions are completions in the global context, as opposed to completions within an
      * existing expression. For example, completing inside a new interpolation expression (`{{|}}`) or
      * inside a new property binding `[input]="|" should retrieve global completions, which will
      * include completions from the template's context component, as well as any local references or
      * template variables which are in scope for that expression.
      */
    def getGlobalCompletions(context: TmplAstTemplate, component: ClassDeclaration, node: AST): GlobalCompletion | Null = js.native
    def getGlobalCompletions(context: TmplAstTemplate, component: ClassDeclaration, node: TmplAstNode): GlobalCompletion | Null = js.native
    
    /**
      * For the given node represents a `LiteralPrimitive`(the `TextAttribute` represents a string
      * literal), retrieve a `TcbLocation` that can be used to perform autocompletion at that point in
      * the node, if such a location exists.
      */
    def getLiteralCompletionLocation(strNode: LiteralPrimitive, component: ClassDeclaration): TcbLocation | Null = js.native
    def getLiteralCompletionLocation(strNode: TmplAstTextAttribute, component: ClassDeclaration): TcbLocation | Null = js.native
    
    /**
      * Get the class of the NgModule that owns this Angular trait. If the result is `null`, that
      * probably means the provided component is standalone.
      */
    def getOwningNgModule(component: ClassDeclaration): ClassDeclaration | Null = js.native
    
    /**
      * Get basic metadata on the pipes which are in scope for the given component.
      */
    def getPipesInScope(component: ClassDeclaration): js.Array[PipeInScope] | Null = js.native
    
    /**
      * Retrieve any potential DOM bindings for the given element.
      *
      * This returns an array of objects which list both the attribute and property names of each
      * binding, which are usually identical but can vary if the HTML attribute name is for example a
      * reserved keyword in JS, like the `for` attribute which corresponds to the `htmlFor` property.
      */
    def getPotentialDomBindings(tagName: String): js.Array[Attribute] = js.native
    
    /**
      * Retrieve any potential DOM events.
      */
    def getPotentialDomEvents(tagName: String): js.Array[String] = js.native
    
    /**
      * Retrieve a `Map` of potential template element tags, to either the `DirectiveInScope` that
      * declares them (if the tag is from a directive/component), or `null` if the tag originates from
      * the DOM schema.
      */
    def getPotentialElementTags(component: ClassDeclaration): Map[String, DirectiveInScope | Null] = js.native
    
    /**
      * Get the primary decorator for an Angular class (such as @Component). This does not work for
      * `@Injectable`.
      */
    def getPrimaryAngularDecorator(target: ClassDeclaration): Decorator | Null = js.native
    
    def getSymbolOfNode(node: AST, component: ClassDeclaration): Symbol | Null = js.native
    /**
      * Retrieves a `Symbol` for the node in a component's template.
      *
      * This method can return `null` if a valid `Symbol` cannot be determined for the node.
      *
      * @see Symbol
      */
    def getSymbolOfNode(node: TmplAstElement, component: ClassDeclaration): ElementSymbol | Null = js.native
    def getSymbolOfNode(node: TmplAstNode, component: ClassDeclaration): Symbol | Null = js.native
    def getSymbolOfNode(node: TmplAstTemplate, component: ClassDeclaration): TemplateSymbol | Null = js.native
    
    /**
      * Retrieve the template in use for the given component.
      */
    def getTemplate(component: ClassDeclaration): js.Array[TmplAstNode] | Null = js.native
    
    /**
      * Given a `shim` and position within the file, returns information for mapping back to a template
      * location.
      */
    def getTemplateMappingAtTcbLocation(tcbLocation: TcbLocation): FullTemplateMapping | Null = js.native
    
    /**
      * Retrieve the top-level node representing the TCB for the given component.
      *
      * This can return `null` if there is no TCB available for the component.
      *
      * This method always runs in `OptimizeFor.SingleFile` mode.
      */
    def getTypeCheckBlock(component: ClassDeclaration): Node | Null = js.native
    
    /**
      * Reset the `TemplateTypeChecker`'s state for the given class, so that it will be recomputed on
      * the next request.
      */
    def invalidateClass(clazz: ClassDeclaration): Unit = js.native
    
    /**
      * Returns `true` if the given file is in the record of known shims generated by the compiler,
      * `false` if we cannot find the file in the shim records.
      */
    def isTrackedTypeCheckFile(filePath: AbsoluteFsPath): Boolean = js.native
    
    /**
      * Constructs a `ts.Diagnostic` for a given `ParseSourceSpan` within a template.
      */
    def makeTemplateDiagnostic[T /* <: ErrorCode */](
      clazz: ClassDeclaration,
      sourceSpan: ParseSourceSpan,
      category: DiagnosticCategory,
      errorCode: T,
      message: String
    ): NgTemplateDiagnostic[T] = js.native
    def makeTemplateDiagnostic[T /* <: ErrorCode */](
      clazz: ClassDeclaration,
      sourceSpan: ParseSourceSpan,
      category: DiagnosticCategory,
      errorCode: T,
      message: String,
      relatedInformation: js.Array[End]
    ): NgTemplateDiagnostic[T] = js.native
  }
}
