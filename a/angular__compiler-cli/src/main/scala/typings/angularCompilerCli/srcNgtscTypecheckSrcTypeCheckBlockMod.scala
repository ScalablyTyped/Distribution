package typings.angularCompilerCli

import typings.angularCompiler.mod.BoundTarget
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.anon.ClassDeclarationClassDeclDeclarationBrand
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckBlockMetadata
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckableDirectiveMeta
import typings.angularCompilerCli.srcNgtscTypecheckSrcDomMod.DomSchemaChecker
import typings.angularCompilerCli.srcNgtscTypecheckSrcEnvironmentMod.Environment
import typings.angularCompilerCli.srcNgtscTypecheckSrcOobMod.OutOfBandDiagnosticRecorder
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.NonNullExpression
import typings.typescript.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTypeCheckBlockMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_check_block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_check_block", "Context")
  @js.native
  open class Context protected () extends StObject {
    def this(
      env: Environment,
      domSchemaChecker: DomSchemaChecker,
      oobRecorder: OutOfBandDiagnosticRecorder,
      id: TemplateId,
      boundTarget: BoundTarget[TypeCheckableDirectiveMeta],
      pipes: Map[String, Reference[ClassDeclarationClassDeclDeclarationBrand]],
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ) = this()
    
    /**
      * Allocate a new variable name for use within the `Context`.
      *
      * Currently this uses a monotonically increasing counter, but in the future the variable name
      * might change depending on the type of data being stored.
      */
    def allocateId(): Identifier = js.native
    
    val boundTarget: BoundTarget[TypeCheckableDirectiveMeta] = js.native
    
    val domSchemaChecker: DomSchemaChecker = js.native
    
    val env: Environment = js.native
    
    def getPipeByName(name: String): Reference[ClassDeclarationClassDecl] | Null = js.native
    
    val hostIsStandalone: Boolean = js.native
    
    val id: TemplateId = js.native
    
    /* private */ var nextId: Any = js.native
    
    val oobRecorder: OutOfBandDiagnosticRecorder = js.native
    
    /* private */ var pipes: Any = js.native
    
    val schemas: js.Array[SchemaMetadata] = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_check_block", "TcbDirectiveOutputsOp")
  @js.native
  open class TcbDirectiveOutputsOp protected ()
    extends StObject
       with TcbOp {
    def this(tcb: Context, scope: Scope, node: TmplAstElement, dir: TypeCheckableDirectiveMeta) = this()
    def this(tcb: Context, scope: Scope, node: TmplAstTemplate, dir: TypeCheckableDirectiveMeta) = this()
    
    /**
      * Replacement value or operation used while this `TcbOp` is executing (i.e. to resolve circular
      * references during its execution).
      *
      * This is usually a `null!` expression (which asks TS to infer an appropriate type), but another
      * `TcbOp` can be returned in cases where additional code generation is necessary to deal with
      * circular references.
      */
    /* CompleteClass */
    override def circularFallback(): TcbOp | Expression = js.native
    
    /* private */ var dir: Any = js.native
    
    /* CompleteClass */
    override def execute(): Expression | Null = js.native
    
    /* private */ var node: Any = js.native
    
    /**
      * Set to true if this operation can be considered optional. Optional operations are only executed
      * when depended upon by other operations, otherwise they are disregarded. This allows for less
      * code to generate, parse and type-check, overall positively contributing to performance.
      */
    /* CompleteClass */
    override val optional: Boolean = js.native
    @JSName("optional")
    def optional_MTcbDirectiveOutputsOp: Boolean = js.native
    
    /* private */ var scope: Any = js.native
    
    /* private */ var tcb: Any = js.native
  }
  
  @js.native
  sealed trait TcbGenericContextBehavior extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_check_block", "TcbGenericContextBehavior")
  @js.native
  object TcbGenericContextBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TcbGenericContextBehavior & Double] = js.native
    
    /**
      * Generic parameter declarations will be copied directly from the `ts.ClassDeclaration` of the
      * component class.
      *
      * The caller must only use the generated TCB code in a context where such copies will still be
      * valid, such as an inline type check block.
      */
    @js.native
    sealed trait CopyClassNodes
      extends StObject
         with TcbGenericContextBehavior
    /* 1 */ val CopyClassNodes: typings.angularCompilerCli.srcNgtscTypecheckSrcTypeCheckBlockMod.TcbGenericContextBehavior.CopyClassNodes & Double = js.native
    
    /**
      * Any generic parameters for the component context class will be set to `any`.
      *
      * Produces a less useful type, but is always safe to use.
      */
    @js.native
    sealed trait FallbackToAny
      extends StObject
         with TcbGenericContextBehavior
    /* 2 */ val FallbackToAny: typings.angularCompilerCli.srcNgtscTypecheckSrcTypeCheckBlockMod.TcbGenericContextBehavior.FallbackToAny & Double = js.native
    
    /**
      * References to generic parameter bounds will be emitted via the `TypeParameterEmitter`.
      *
      * The caller must verify that all parameter bounds are emittable in order to use this mode.
      */
    @js.native
    sealed trait UseEmitter
      extends StObject
         with TcbGenericContextBehavior
    /* 0 */ val UseEmitter: typings.angularCompilerCli.srcNgtscTypecheckSrcTypeCheckBlockMod.TcbGenericContextBehavior.UseEmitter & Double = js.native
  }
  
  inline def generateTypeCheckBlock(
    env: Environment,
    ref: Reference[ClassDeclarationClassDecl],
    name: Identifier,
    meta: TypeCheckBlockMetadata,
    domSchemaChecker: DomSchemaChecker,
    oobRecorder: OutOfBandDiagnosticRecorder,
    genericContextBehavior: TcbGenericContextBehavior
  ): FunctionDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTypeCheckBlock")(env.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], name.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], domSchemaChecker.asInstanceOf[js.Any], oobRecorder.asInstanceOf[js.Any], genericContextBehavior.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration]
  
  /**
    * Local scope within the type check block for a particular template.
    *
    * The top-level template and each nested `<ng-template>` have their own `Scope`, which exist in a
    * hierarchy. The structure of this hierarchy mirrors the syntactic scopes in the generated type
    * check block, where each nested template is encased in an `if` structure.
    *
    * As a template's `TcbOp`s are executed in a given `Scope`, statements are added via
    * `addStatement()`. When this processing is complete, the `Scope` can be turned into a `ts.Block`
    * via `renderToBlock()`.
    *
    * If a `TcbOp` requires the output of another, it can call `resolve()`.
    */
  @js.native
  trait Scope extends StObject {
    
    /**
      * Add a statement to this scope.
      */
    def addStatement(stmt: Statement): Unit = js.native
    
    /* private */ var appendDeepSchemaChecks: Any = js.native
    
    /* private */ var appendDirectivesAndInputsOfNode: Any = js.native
    
    /* private */ var appendIcuExpressions: Any = js.native
    
    /* private */ var appendNode: Any = js.native
    
    /* private */ var appendOutputsOfNode: Any = js.native
    
    /* private */ var checkAndAppendReferencesOfNode: Any = js.native
    
    /**
      * A map of maps which tracks the index of `TcbDirectiveCtorOp`s in the `opQueue` for each
      * directive on a `TmplAstElement` or `TmplAstTemplate` node.
      */
    /* private */ var directiveOpMap: Any = js.native
    
    /**
      * A map of `TmplAstElement`s to the index of their `TcbElementOp` in the `opQueue`
      */
    /* private */ var elementOpMap: Any = js.native
    
    /**
      * Execute a particular `TcbOp` in the `opQueue`.
      *
      * This method replaces the operation in the `opQueue` with the result of execution (once done)
      * and also protects against a circular dependency from the operation to itself by temporarily
      * setting the operation's result to a special expression.
      */
    /* private */ var executeOp: Any = js.native
    
    /* private */ var guard: Any = js.native
    
    /**
      * Returns an expression of all template guards that apply to this scope, including those of
      * parent scopes. If no guards have been applied, null is returned.
      */
    def guards(): Expression | Null = js.native
    
    /**
      * A queue of operations which need to be performed to generate the TCB code for this scope.
      *
      * This array can contain either a `TcbOp` which has yet to be executed, or a `ts.Expression|null`
      * representing the memoized result of executing the operation. As operations are executed, their
      * results are written into the `opQueue`, overwriting the original operation.
      *
      * If an operation is in the process of being executed, it is temporarily overwritten here with
      * `INFER_TYPE_FOR_CIRCULAR_OP_EXPR`. This way, if a cycle is encountered where an operation
      * depends transitively on its own result, the inner operation will infer the least narrow type
      * that fits instead. This has the same semantics as TypeScript itself when types are referenced
      * circularly.
      */
    /* private */ var opQueue: Any = js.native
    
    /* private */ var parent: Any = js.native
    
    /**
      * A map of `TmplAstReference`s to the index of their `TcbReferenceOp` in the `opQueue`
      */
    /* private */ var referenceOpMap: Any = js.native
    
    /**
      * Get the statements.
      */
    def render(): js.Array[Statement] = js.native
    
    /**
      * Look up a `ts.Expression` representing the value of some operation in the current `Scope`,
      * including any parent scope(s). This method always returns a mutable clone of the
      * `ts.Expression` with the comments cleared.
      *
      * @param node a `TmplAstNode` of the operation in question. The lookup performed will depend on
      * the type of this node:
      *
      * Assuming `directive` is not present, then `resolve` will return:
      *
      * * `TmplAstElement` - retrieve the expression for the element DOM node
      * * `TmplAstTemplate` - retrieve the template context variable
      * * `TmplAstVariable` - retrieve a template let- variable
      * * `TmplAstReference` - retrieve variable created for the local ref
      *
      * @param directive if present, a directive type on a `TmplAstElement` or `TmplAstTemplate` to
      * look up instead of the default for an element or template node.
      */
    def resolve(node: TmplAstElement): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstElement, directive: TypeCheckableDirectiveMeta): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstReference): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstReference, directive: TypeCheckableDirectiveMeta): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstTemplate): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstTemplate, directive: TypeCheckableDirectiveMeta): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstVariable): Identifier | NonNullExpression = js.native
    def resolve(node: TmplAstVariable, directive: TypeCheckableDirectiveMeta): Identifier | NonNullExpression = js.native
    
    /* private */ var resolveLocal: Any = js.native
    
    /**
      * Like `executeOp`, but assert that the operation actually returned `ts.Expression`.
      */
    /* private */ var resolveOp: Any = js.native
    
    /**
      * Statements for this template.
      *
      * Executing the `TcbOp`s in the `opQueue` populates this array.
      */
    /* private */ var statements: Any = js.native
    
    /* private */ var tcb: Any = js.native
    
    /**
      * Map of immediately nested <ng-template>s (within this `Scope`) represented by `TmplAstTemplate`
      * nodes to the index of their `TcbTemplateContextOp`s in the `opQueue`.
      */
    /* private */ var templateCtxOpMap: Any = js.native
    
    /**
      * Map of variables declared on the template that created this `Scope` (represented by
      * `TmplAstVariable` nodes) to the index of their `TcbVariableOp`s in the `opQueue`.
      */
    /* private */ var varMap: Any = js.native
  }
  
  /**
    * A code generation operation that's involved in the construction of a Type Check Block.
    *
    * The generation of a TCB is non-linear. Bindings within a template may result in the need to
    * construct certain types earlier than they otherwise would be constructed. That is, if the
    * generation of a TCB for a template is broken down into specific operations (constructing a
    * directive, extracting a variable from a let- operation, etc), then it's possible for operations
    * earlier in the sequence to depend on operations which occur later in the sequence.
    *
    * `TcbOp` abstracts the different types of operations which are required to convert a template into
    * a TCB. This allows for two phases of processing for the template, where 1) a linear sequence of
    * `TcbOp`s is generated, and then 2) these operations are executed, not necessarily in linear
    * order.
    *
    * Each `TcbOp` may insert statements into the body of the TCB, and also optionally return a
    * `ts.Expression` which can be used to reference the operation's result.
    */
  trait TcbOp extends StObject {
    
    /**
      * Replacement value or operation used while this `TcbOp` is executing (i.e. to resolve circular
      * references during its execution).
      *
      * This is usually a `null!` expression (which asks TS to infer an appropriate type), but another
      * `TcbOp` can be returned in cases where additional code generation is necessary to deal with
      * circular references.
      */
    def circularFallback(): TcbOp | Expression
    
    def execute(): Expression | Null
    
    /**
      * Set to true if this operation can be considered optional. Optional operations are only executed
      * when depended upon by other operations, otherwise they are disregarded. This allows for less
      * code to generate, parse and type-check, overall positively contributing to performance.
      */
    val optional: Boolean
  }
  object TcbOp {
    
    inline def apply(circularFallback: () => TcbOp | Expression, execute: () => Expression | Null, optional: Boolean): TcbOp = {
      val __obj = js.Dynamic.literal(circularFallback = js.Any.fromFunction0(circularFallback), execute = js.Any.fromFunction0(execute), optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcbOp]
    }
    
    extension [Self <: TcbOp](x: Self) {
      
      inline def setCircularFallback(value: () => TcbOp | Expression): Self = StObject.set(x, "circularFallback", js.Any.fromFunction0(value))
      
      inline def setExecute(value: () => Expression | Null): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
}
