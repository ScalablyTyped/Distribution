package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.Statement
import typings.angularCompiler.mod.Type
import typings.angularCompilerCli.srcNgtscImportsSrcReexportMod.Reexport
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcNgtscIndexerMod.IndexingContext
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscTranslatorMod.ImportManager
import typings.angularCompilerCli.srcNgtscTypecheckApiContextMod.TypeCheckContext
import typings.angularCompilerCli.srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod.ExtendedTemplateChecker
import typings.angularCompilerCli.srcNgtscXi18nSrcContextMod.Xi18nContext
import typings.typescript.mod.ClassElement
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcApiMod {
  
  @js.native
  sealed trait CompilationMode extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/api", "CompilationMode")
  @js.native
  object CompilationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompilationMode & Double] = js.native
    
    /**
      * Generates fully AOT compiled code using Ivy instructions.
      */
    @js.native
    sealed trait FULL
      extends StObject
         with CompilationMode
    /* 0 */ val FULL: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode.FULL & Double = js.native
    
    /**
      * Generates code using a stable, but intermediate format suitable to be published to NPM.
      */
    @js.native
    sealed trait PARTIAL
      extends StObject
         with CompilationMode
    /* 1 */ val PARTIAL: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode.PARTIAL & Double = js.native
  }
  
  @js.native
  sealed trait HandlerFlags extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/api", "HandlerFlags")
  @js.native
  object HandlerFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandlerFlags & Double] = js.native
    
    /**
      * Indicates that this decorator is fully inherited from its parent at runtime. In addition to
      * normally inherited aspects such as inputs and queries, full inheritance applies to every aspect
      * of the component or directive, such as the template function itself.
      *
      * Its primary effect is to cause the `CopyDefinitionFeature` to be applied to the definition
      * being compiled. See that class for more information.
      */
    @js.native
    sealed trait FULL_INHERITANCE
      extends StObject
         with HandlerFlags
    /* 1 */ val FULL_INHERITANCE: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags.FULL_INHERITANCE & Double = js.native
    
    /**
      * No flags set.
      */
    @js.native
    sealed trait NONE
      extends StObject
         with HandlerFlags
    /* 0 */ val NONE: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags.NONE & Double = js.native
  }
  
  @js.native
  sealed trait HandlerPrecedence extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/api", "HandlerPrecedence")
  @js.native
  object HandlerPrecedence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandlerPrecedence & Double] = js.native
    
    /**
      * Handler with PRIMARY precedence cannot overlap - there can only be one on a given class.
      *
      * If more than one PRIMARY handler matches a class, an error is produced.
      */
    @js.native
    sealed trait PRIMARY
      extends StObject
         with HandlerPrecedence
    /* 0 */ val PRIMARY: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence.PRIMARY & Double = js.native
    
    /**
      * Handlers with SHARED precedence can match any class, possibly in addition to a single PRIMARY
      * handler.
      *
      * It is not an error for a class to have any number of SHARED handlers.
      */
    @js.native
    sealed trait SHARED
      extends StObject
         with HandlerPrecedence
    /* 1 */ val SHARED: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence.SHARED & Double = js.native
    
    /**
      * Handlers with WEAK precedence that match a class are ignored if any handlers with stronger
      * precedence match a class.
      */
    @js.native
    sealed trait WEAK
      extends StObject
         with HandlerPrecedence
    /* 2 */ val WEAK: typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence.WEAK & Double = js.native
  }
  
  trait AnalysisOutput[A] extends StObject {
    
    var analysis: js.UndefOr[A] = js.undefined
    
    var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  }
  object AnalysisOutput {
    
    inline def apply[A](): AnalysisOutput[A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalysisOutput[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalysisOutput[?], A] (val x: Self & AnalysisOutput[A]) extends AnyVal {
      
      inline def setAnalysis(value: A): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
      
      inline def setAnalysisUndefined: Self = StObject.set(x, "analysis", js.undefined)
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    }
  }
  
  trait CompileResult extends StObject {
    
    var initializer: Expression
    
    var name: String
    
    var statements: js.Array[Statement]
    
    var `type`: Type
  }
  object CompileResult {
    
    inline def apply(initializer: Expression, name: String, statements: js.Array[Statement], `type`: Type): CompileResult = {
      val __obj = js.Dynamic.literal(initializer = initializer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileResult] (val x: Self) extends AnyVal {
      
      inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value*))
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DecoratorHandler[D, A, S /* <: SemanticSymbol | Null */, R] extends StObject {
    
    /**
      * Perform analysis on the decorator/class combination, extracting information from the class
      * required for compilation.
      *
      * Returns analyzed metadata if successful, or an array of diagnostic messages if the analysis
      * fails or the decorator isn't valid.
      *
      * Analysis should always be a "pure" operation, with no side effects. This is because the
      * detect/analysis steps might be skipped for files which have not changed during incremental
      * builds. Any side effects required for compilation (e.g. registration of metadata) should happen
      * in the `register` phase, which is guaranteed to run even for incremental builds.
      */
    def analyze(node: ClassDeclaration[DeclarationNode], metadata: D): AnalysisOutput[A] = js.native
    def analyze(node: ClassDeclaration[DeclarationNode], metadata: D, handlerFlags: HandlerFlags): AnalysisOutput[A] = js.native
    
    /**
      * Generate a description of the field which should be added to the class, including any
      * initialization code to be generated.
      *
      * If the compilation mode is configured as partial, and an implementation of `compilePartial` is
      * provided, then this method is not called.
      */
    def compileFull(node: ClassDeclaration[DeclarationNode], analysis: A, resolution: R, constantPool: ConstantPool): CompileResult | js.Array[CompileResult] = js.native
    
    /**
      * Generates code for the decorator using a stable, but intermediate format suitable to be
      * published to NPM. This code is meant to be processed by the linker to achieve the final AOT
      * compiled code.
      *
      * If present, this method is used if the compilation mode is configured as partial, otherwise
      * `compileFull` is.
      */
    var compilePartial: js.UndefOr[
        js.Function3[
          /* node */ ClassDeclaration[DeclarationNode], 
          /* analysis */ A, 
          /* resolution */ R, 
          CompileResult | js.Array[CompileResult]
        ]
      ] = js.native
    
    /**
      * Scan a set of reflected decorators and determine if this handler is responsible for compilation
      * of one of them.
      */
    def detect(node: ClassDeclaration[DeclarationNode]): js.UndefOr[DetectResult[D]] = js.native
    def detect(node: ClassDeclaration[DeclarationNode], decorators: js.Array[Decorator]): js.UndefOr[DetectResult[D]] = js.native
    
    var extendedTemplateCheck: js.UndefOr[
        js.Function2[
          /* component */ typings.typescript.mod.ClassDeclaration, 
          /* extendedTemplateChecker */ ExtendedTemplateChecker, 
          js.Array[Diagnostic]
        ]
      ] = js.native
    
    /**
      * Registers information about the decorator for the indexing phase in a
      * `IndexingContext`, which stores information about components discovered in the
      * program.
      */
    var index: js.UndefOr[
        js.Function4[
          /* context */ IndexingContext, 
          /* node */ ClassDeclaration[DeclarationNode], 
          /* analysis */ A, 
          /* resolution */ R, 
          Unit
        ]
      ] = js.native
    
    val name: String = js.native
    
    /**
      * Asynchronously perform pre-analysis on the decorator/class combination.
      *
      * `preanalyze` is optional and is not guaranteed to be called through all compilation flows. It
      * will only be called if asynchronicity is supported in the CompilerHost.
      */
    var preanalyze: js.UndefOr[
        js.Function2[
          /* node */ ClassDeclaration[DeclarationNode], 
          /* metadata */ D, 
          js.UndefOr[js.Promise[Unit]]
        ]
      ] = js.native
    
    /**
      * The precedence of a handler controls how it interacts with other handlers that match the same
      * class.
      *
      * See the descriptions on `HandlerPrecedence` for an explanation of the behaviors involved.
      */
    val precedence: HandlerPrecedence = js.native
    
    /**
      * Post-process the analysis of a decorator/class combination and record any necessary information
      * in the larger compilation.
      *
      * Registration always occurs for a given decorator/class, regardless of whether analysis was
      * performed directly or whether the analysis results were reused from the previous program.
      */
    var register: js.UndefOr[
        js.Function2[/* node */ ClassDeclaration[DeclarationNode], /* analysis */ A, Unit]
      ] = js.native
    
    /**
      * Perform resolution on the given decorator along with the result of analysis.
      *
      * The resolution phase happens after the entire `ts.Program` has been analyzed, and gives the
      * `DecoratorHandler` a chance to leverage information from the whole compilation unit to enhance
      * the `analysis` before the emit phase.
      */
    var resolve: js.UndefOr[
        js.Function3[
          /* node */ ClassDeclaration[DeclarationNode], 
          /* analysis */ A, 
          /* symbol */ S, 
          ResolveResult[R]
        ]
      ] = js.native
    
    /**
      * Produces a `SemanticSymbol` that represents the class, which is registered into the semantic
      * dependency graph. The symbol is used in incremental compilations to let the compiler determine
      * how a change to the class affects prior emit results. See the `incremental` target's README for
      * details on how this works.
      *
      * The symbol is passed in to `resolve`, where it can be extended with references into other parts
      * of the compilation as needed.
      *
      * Only primary handlers are allowed to have symbols; handlers with `precedence` other than
      * `HandlerPrecedence.PRIMARY` must return a `null` symbol.
      */
    def symbol(node: ClassDeclaration[DeclarationNode], analysis: A): S = js.native
    
    var typeCheck: js.UndefOr[
        js.Function4[
          /* ctx */ TypeCheckContext, 
          /* node */ ClassDeclaration[DeclarationNode], 
          /* analysis */ A, 
          /* resolution */ R, 
          Unit
        ]
      ] = js.native
    
    /**
      * React to a change in a resource file by updating the `analysis` or `resolution`, under the
      * assumption that nothing in the TypeScript code has changed.
      */
    var updateResources: js.UndefOr[
        js.Function3[
          /* node */ ClassDeclaration[DeclarationNode], 
          /* analysis */ A, 
          /* resolution */ R, 
          Unit
        ]
      ] = js.native
    
    /**
      * Extract i18n messages into the `Xi18nContext`, which is useful for generating various formats
      * of message file outputs.
      */
    var xi18n: js.UndefOr[
        js.Function3[
          /* bundle */ Xi18nContext, 
          /* node */ ClassDeclaration[DeclarationNode], 
          /* analysis */ A, 
          Unit
        ]
      ] = js.native
  }
  
  trait DetectResult[M] extends StObject {
    
    /**
      * Refers to the decorator that was recognized for this detection, if any. This can be a concrete
      * decorator that is actually present in a file, or a synthetic decorator as inserted
      * programmatically.
      */
    var decorator: Decorator | Null
    
    /**
      * An arbitrary object to carry over from the detection phase into the analysis phase.
      */
    var metadata: M
    
    /**
      * The node that triggered the match, which is typically a decorator.
      */
    var trigger: Node | Null
  }
  object DetectResult {
    
    inline def apply[M](metadata: M): DetectResult[M] = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], decorator = null, trigger = null)
      __obj.asInstanceOf[DetectResult[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectResult[?], M] (val x: Self & DetectResult[M]) extends AnyVal {
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setMetadata(value: M): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: Node): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
    }
  }
  
  trait DtsTransform extends StObject {
    
    var transformClass: js.UndefOr[
        js.Function3[
          /* clazz */ typings.typescript.mod.ClassDeclaration, 
          /* elements */ js.Array[ClassElement], 
          /* imports */ ImportManager, 
          typings.typescript.mod.ClassDeclaration
        ]
      ] = js.undefined
    
    var transformClassElement: js.UndefOr[
        js.Function2[/* element */ ClassElement, /* imports */ ImportManager, ClassElement]
      ] = js.undefined
    
    var transformFunctionDeclaration: js.UndefOr[
        js.Function2[/* element */ FunctionDeclaration, /* imports */ ImportManager, FunctionDeclaration]
      ] = js.undefined
  }
  object DtsTransform {
    
    inline def apply(): DtsTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DtsTransform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DtsTransform] (val x: Self) extends AnyVal {
      
      inline def setTransformClass(
        value: (/* clazz */ typings.typescript.mod.ClassDeclaration, /* elements */ js.Array[ClassElement], /* imports */ ImportManager) => typings.typescript.mod.ClassDeclaration
      ): Self = StObject.set(x, "transformClass", js.Any.fromFunction3(value))
      
      inline def setTransformClassElement(value: (/* element */ ClassElement, /* imports */ ImportManager) => ClassElement): Self = StObject.set(x, "transformClassElement", js.Any.fromFunction2(value))
      
      inline def setTransformClassElementUndefined: Self = StObject.set(x, "transformClassElement", js.undefined)
      
      inline def setTransformClassUndefined: Self = StObject.set(x, "transformClass", js.undefined)
      
      inline def setTransformFunctionDeclaration(value: (/* element */ FunctionDeclaration, /* imports */ ImportManager) => FunctionDeclaration): Self = StObject.set(x, "transformFunctionDeclaration", js.Any.fromFunction2(value))
      
      inline def setTransformFunctionDeclarationUndefined: Self = StObject.set(x, "transformFunctionDeclaration", js.undefined)
    }
  }
  
  trait ResolveResult[R] extends StObject {
    
    var data: js.UndefOr[R] = js.undefined
    
    var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
    
    var reexports: js.UndefOr[js.Array[Reexport]] = js.undefined
  }
  object ResolveResult {
    
    inline def apply[R](): ResolveResult[R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveResult[R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveResult[?], R] (val x: Self & ResolveResult[R]) extends AnyVal {
      
      inline def setData(value: R): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
      
      inline def setReexports(value: js.Array[Reexport]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      inline def setReexportsUndefined: Self = StObject.set(x, "reexports", js.undefined)
      
      inline def setReexportsVarargs(value: Reexport*): Self = StObject.set(x, "reexports", js.Array(value*))
    }
  }
}
