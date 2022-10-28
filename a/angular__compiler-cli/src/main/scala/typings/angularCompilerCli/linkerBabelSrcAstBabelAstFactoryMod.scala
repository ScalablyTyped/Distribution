package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.Exclamationmark
import typings.angularCompilerCli.angularCompilerCliStrings.Plussign
import typings.angularCompilerCli.angularCompilerCliStrings.Tilde
import typings.angularCompilerCli.angularCompilerCliStrings.`-_`
import typings.angularCompilerCli.angularCompilerCliStrings.`throw`
import typings.angularCompilerCli.angularCompilerCliStrings.delete
import typings.angularCompilerCli.angularCompilerCliStrings.typeof
import typings.angularCompilerCli.angularCompilerCliStrings.void
import typings.angularCompilerCli.anon.FnCall
import typings.angularCompilerCli.anon.FnCallArgument
import typings.angularCompilerCli.anon.FnCallBodyDirectives
import typings.angularCompilerCli.anon.FnCallCalleeArguments
import typings.angularCompilerCli.anon.FnCallOperatorArgumentPrefix
import typings.angularCompilerCli.anon.FnCallTestConsequentAlternate
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.SourceMapRange
import typings.babelTypes.mod.ArgumentPlaceholder_
import typings.babelTypes.mod.ArrayExpression_
import typings.babelTypes.mod.ArrowFunctionExpression_
import typings.babelTypes.mod.AssignmentExpression_
import typings.babelTypes.mod.AwaitExpression_
import typings.babelTypes.mod.BigIntLiteral_
import typings.babelTypes.mod.BinaryExpression_
import typings.babelTypes.mod.BindExpression_
import typings.babelTypes.mod.BlockStatement_
import typings.babelTypes.mod.BooleanLiteral_
import typings.babelTypes.mod.BreakStatement_
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.ClassDeclaration_
import typings.babelTypes.mod.ClassExpression_
import typings.babelTypes.mod.ConditionalExpression_
import typings.babelTypes.mod.ContinueStatement_
import typings.babelTypes.mod.DebuggerStatement_
import typings.babelTypes.mod.DecimalLiteral_
import typings.babelTypes.mod.DeclareClass_
import typings.babelTypes.mod.DeclareExportAllDeclaration_
import typings.babelTypes.mod.DeclareExportDeclaration_
import typings.babelTypes.mod.DeclareFunction_
import typings.babelTypes.mod.DeclareInterface_
import typings.babelTypes.mod.DeclareModuleExports_
import typings.babelTypes.mod.DeclareModule_
import typings.babelTypes.mod.DeclareOpaqueType_
import typings.babelTypes.mod.DeclareTypeAlias_
import typings.babelTypes.mod.DeclareVariable_
import typings.babelTypes.mod.Directive_
import typings.babelTypes.mod.DoExpression_
import typings.babelTypes.mod.DoWhileStatement_
import typings.babelTypes.mod.EmptyStatement_
import typings.babelTypes.mod.EnumDeclaration_
import typings.babelTypes.mod.ExportAllDeclaration_
import typings.babelTypes.mod.ExportDefaultDeclaration_
import typings.babelTypes.mod.ExportNamedDeclaration_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.ExpressionStatement_
import typings.babelTypes.mod.ForInStatement_
import typings.babelTypes.mod.ForOfStatement_
import typings.babelTypes.mod.ForStatement_
import typings.babelTypes.mod.FunctionDeclaration_
import typings.babelTypes.mod.FunctionExpression_
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.IfStatement_
import typings.babelTypes.mod.ImportDeclaration_
import typings.babelTypes.mod.Import_
import typings.babelTypes.mod.InterfaceDeclaration_
import typings.babelTypes.mod.JSXElement_
import typings.babelTypes.mod.JSXFragment_
import typings.babelTypes.mod.JSXNamespacedName_
import typings.babelTypes.mod.LabeledStatement_
import typings.babelTypes.mod.LogicalExpression_
import typings.babelTypes.mod.MemberExpression_
import typings.babelTypes.mod.MetaProperty_
import typings.babelTypes.mod.ModuleExpression_
import typings.babelTypes.mod.NewExpression_
import typings.babelTypes.mod.NullLiteral_
import typings.babelTypes.mod.NumericLiteral_
import typings.babelTypes.mod.ObjectExpression_
import typings.babelTypes.mod.OpaqueType_
import typings.babelTypes.mod.OptionalCallExpression_
import typings.babelTypes.mod.OptionalMemberExpression_
import typings.babelTypes.mod.ParenthesizedExpression_
import typings.babelTypes.mod.PipelineBareFunction_
import typings.babelTypes.mod.PipelinePrimaryTopicReference_
import typings.babelTypes.mod.PipelineTopicExpression_
import typings.babelTypes.mod.RecordExpression_
import typings.babelTypes.mod.RegExpLiteral_
import typings.babelTypes.mod.ReturnStatement_
import typings.babelTypes.mod.SequenceExpression_
import typings.babelTypes.mod.SpreadElement_
import typings.babelTypes.mod.Statement
import typings.babelTypes.mod.StringLiteral_
import typings.babelTypes.mod.Super_
import typings.babelTypes.mod.SwitchStatement_
import typings.babelTypes.mod.TSAsExpression_
import typings.babelTypes.mod.TSDeclareFunction_
import typings.babelTypes.mod.TSEnumDeclaration_
import typings.babelTypes.mod.TSExportAssignment_
import typings.babelTypes.mod.TSImportEqualsDeclaration_
import typings.babelTypes.mod.TSInstantiationExpression_
import typings.babelTypes.mod.TSInterfaceDeclaration_
import typings.babelTypes.mod.TSModuleDeclaration_
import typings.babelTypes.mod.TSNamespaceExportDeclaration_
import typings.babelTypes.mod.TSNonNullExpression_
import typings.babelTypes.mod.TSSatisfiesExpression_
import typings.babelTypes.mod.TSTypeAliasDeclaration_
import typings.babelTypes.mod.TSTypeAssertion_
import typings.babelTypes.mod.TaggedTemplateExpression_
import typings.babelTypes.mod.TemplateElement_
import typings.babelTypes.mod.TemplateLiteral_
import typings.babelTypes.mod.ThisExpression_
import typings.babelTypes.mod.ThrowStatement_
import typings.babelTypes.mod.TopicReference_
import typings.babelTypes.mod.TryStatement_
import typings.babelTypes.mod.TupleExpression_
import typings.babelTypes.mod.TypeAlias_
import typings.babelTypes.mod.TypeCastExpression_
import typings.babelTypes.mod.UnaryExpression_
import typings.babelTypes.mod.UpdateExpression_
import typings.babelTypes.mod.V8IntrinsicIdentifier_
import typings.babelTypes.mod.VariableDeclaration_
import typings.babelTypes.mod.WhileStatement_
import typings.babelTypes.mod.WithStatement_
import typings.babelTypes.mod.YieldExpression_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerBabelSrcAstBabelAstFactoryMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/ast/babel_ast_factory", "BabelAstFactory")
  @js.native
  open class BabelAstFactory protected ()
    extends StObject
       with AstFactory[Statement, Expression] {
    def this(/** The absolute path to the source file being compiled. */
    sourceUrl: String) = this()
    
    def createArrayLiteral(): ArrayExpression_ = js.native
    @JSName("createArrayLiteral")
    var createArrayLiteral_Original: FnCall = js.native
    
    def createBlock(body: js.Array[Statement], directives: js.Array[Directive_]): BlockStatement_ = js.native
    @JSName("createBlock")
    var createBlock_Original: FnCallBodyDirectives = js.native
    
    @JSName("createConditional")
    var createConditional_Original: js.Function3[
        /* test */ Expression, 
        /* consequent */ Expression, 
        /* alternate */ Expression, 
        ConditionalExpression_
      ] = js.native
    
    @JSName("createExpressionStatement")
    var createExpressionStatement_Original: js.Function1[/* expression */ Expression, ExpressionStatement_] = js.native
    
    @JSName("createIdentifier")
    var createIdentifier_Original: js.Function1[/* name */ String, Identifier_] = js.native
    
    @JSName("createIfStatement")
    var createIfStatement_Original: FnCallTestConsequentAlternate = js.native
    
    def createNewExpression(
      callee: Super_,
      _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
    ): NewExpression_ = js.native
    def createNewExpression(
      callee: V8IntrinsicIdentifier_,
      _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
    ): NewExpression_ = js.native
    @JSName("createNewExpression")
    var createNewExpression_Original: FnCallCalleeArguments = js.native
    
    @JSName("createParenthesizedExpression")
    var createParenthesizedExpression_Original: js.Function1[/* expression */ Expression, ParenthesizedExpression_] = js.native
    
    @JSName("createReturnStatement")
    var createReturnStatement_Original: FnCallArgument = js.native
    
    @JSName("createThrowStatement")
    var createThrowStatement_Original: js.Function1[/* argument */ Expression, ThrowStatement_] = js.native
    
    def createUnaryExpression(
      operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
      argument: Expression
    ): UnaryExpression_ = js.native
    def createUnaryExpression(
      operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
      argument: Expression,
      prefix: Boolean
    ): UnaryExpression_ = js.native
    @JSName("createUnaryExpression")
    var createUnaryExpression_Original: FnCallOperatorArgumentPrefix = js.native
    
    def setSourceMapRange(node: ArrayExpression_): ArrayExpression_ = js.native
    def setSourceMapRange(node: ArrayExpression_, sourceMapRange: SourceMapRange): ArrayExpression_ = js.native
    def setSourceMapRange(node: ArrowFunctionExpression_): ArrowFunctionExpression_ = js.native
    def setSourceMapRange(node: ArrowFunctionExpression_, sourceMapRange: SourceMapRange): ArrowFunctionExpression_ = js.native
    def setSourceMapRange(node: AssignmentExpression_): AssignmentExpression_ = js.native
    def setSourceMapRange(node: AssignmentExpression_, sourceMapRange: SourceMapRange): AssignmentExpression_ = js.native
    def setSourceMapRange(node: AwaitExpression_): AwaitExpression_ = js.native
    def setSourceMapRange(node: AwaitExpression_, sourceMapRange: SourceMapRange): AwaitExpression_ = js.native
    def setSourceMapRange(node: BigIntLiteral_): BigIntLiteral_ = js.native
    def setSourceMapRange(node: BigIntLiteral_, sourceMapRange: SourceMapRange): BigIntLiteral_ = js.native
    def setSourceMapRange(node: BinaryExpression_): BinaryExpression_ = js.native
    def setSourceMapRange(node: BinaryExpression_, sourceMapRange: SourceMapRange): BinaryExpression_ = js.native
    def setSourceMapRange(node: BindExpression_): BindExpression_ = js.native
    def setSourceMapRange(node: BindExpression_, sourceMapRange: SourceMapRange): BindExpression_ = js.native
    def setSourceMapRange(node: BlockStatement_): BlockStatement_ = js.native
    def setSourceMapRange(node: BlockStatement_, sourceMapRange: SourceMapRange): BlockStatement_ = js.native
    def setSourceMapRange(node: BooleanLiteral_): BooleanLiteral_ = js.native
    def setSourceMapRange(node: BooleanLiteral_, sourceMapRange: SourceMapRange): BooleanLiteral_ = js.native
    def setSourceMapRange(node: BreakStatement_): BreakStatement_ = js.native
    def setSourceMapRange(node: BreakStatement_, sourceMapRange: SourceMapRange): BreakStatement_ = js.native
    def setSourceMapRange(node: CallExpression_): CallExpression_ = js.native
    def setSourceMapRange(node: CallExpression_, sourceMapRange: SourceMapRange): CallExpression_ = js.native
    def setSourceMapRange(node: ClassDeclaration_): ClassDeclaration_ = js.native
    def setSourceMapRange(node: ClassDeclaration_, sourceMapRange: SourceMapRange): ClassDeclaration_ = js.native
    def setSourceMapRange(node: ClassExpression_): ClassExpression_ = js.native
    def setSourceMapRange(node: ClassExpression_, sourceMapRange: SourceMapRange): ClassExpression_ = js.native
    def setSourceMapRange(node: ConditionalExpression_): ConditionalExpression_ = js.native
    def setSourceMapRange(node: ConditionalExpression_, sourceMapRange: SourceMapRange): ConditionalExpression_ = js.native
    def setSourceMapRange(node: ContinueStatement_): ContinueStatement_ = js.native
    def setSourceMapRange(node: ContinueStatement_, sourceMapRange: SourceMapRange): ContinueStatement_ = js.native
    def setSourceMapRange(node: DebuggerStatement_): DebuggerStatement_ = js.native
    def setSourceMapRange(node: DebuggerStatement_, sourceMapRange: SourceMapRange): DebuggerStatement_ = js.native
    def setSourceMapRange(node: DecimalLiteral_): DecimalLiteral_ = js.native
    def setSourceMapRange(node: DecimalLiteral_, sourceMapRange: SourceMapRange): DecimalLiteral_ = js.native
    def setSourceMapRange(node: DeclareClass_): DeclareClass_ = js.native
    def setSourceMapRange(node: DeclareClass_, sourceMapRange: SourceMapRange): DeclareClass_ = js.native
    def setSourceMapRange(node: DeclareExportAllDeclaration_): DeclareExportAllDeclaration_ = js.native
    def setSourceMapRange(node: DeclareExportAllDeclaration_, sourceMapRange: SourceMapRange): DeclareExportAllDeclaration_ = js.native
    def setSourceMapRange(node: DeclareExportDeclaration_): DeclareExportDeclaration_ = js.native
    def setSourceMapRange(node: DeclareExportDeclaration_, sourceMapRange: SourceMapRange): DeclareExportDeclaration_ = js.native
    def setSourceMapRange(node: DeclareFunction_): DeclareFunction_ = js.native
    def setSourceMapRange(node: DeclareFunction_, sourceMapRange: SourceMapRange): DeclareFunction_ = js.native
    def setSourceMapRange(node: DeclareInterface_): DeclareInterface_ = js.native
    def setSourceMapRange(node: DeclareInterface_, sourceMapRange: SourceMapRange): DeclareInterface_ = js.native
    def setSourceMapRange(node: DeclareModuleExports_): DeclareModuleExports_ = js.native
    def setSourceMapRange(node: DeclareModuleExports_, sourceMapRange: SourceMapRange): DeclareModuleExports_ = js.native
    def setSourceMapRange(node: DeclareModule_): DeclareModule_ = js.native
    def setSourceMapRange(node: DeclareModule_, sourceMapRange: SourceMapRange): DeclareModule_ = js.native
    def setSourceMapRange(node: DeclareOpaqueType_): DeclareOpaqueType_ = js.native
    def setSourceMapRange(node: DeclareOpaqueType_, sourceMapRange: SourceMapRange): DeclareOpaqueType_ = js.native
    def setSourceMapRange(node: DeclareTypeAlias_): DeclareTypeAlias_ = js.native
    def setSourceMapRange(node: DeclareTypeAlias_, sourceMapRange: SourceMapRange): DeclareTypeAlias_ = js.native
    def setSourceMapRange(node: DeclareVariable_): DeclareVariable_ = js.native
    def setSourceMapRange(node: DeclareVariable_, sourceMapRange: SourceMapRange): DeclareVariable_ = js.native
    def setSourceMapRange(node: DoExpression_): DoExpression_ = js.native
    def setSourceMapRange(node: DoExpression_, sourceMapRange: SourceMapRange): DoExpression_ = js.native
    def setSourceMapRange(node: DoWhileStatement_): DoWhileStatement_ = js.native
    def setSourceMapRange(node: DoWhileStatement_, sourceMapRange: SourceMapRange): DoWhileStatement_ = js.native
    def setSourceMapRange(node: EmptyStatement_): EmptyStatement_ = js.native
    def setSourceMapRange(node: EmptyStatement_, sourceMapRange: SourceMapRange): EmptyStatement_ = js.native
    def setSourceMapRange(node: EnumDeclaration_): EnumDeclaration_ = js.native
    def setSourceMapRange(node: EnumDeclaration_, sourceMapRange: SourceMapRange): EnumDeclaration_ = js.native
    def setSourceMapRange(node: ExportAllDeclaration_): ExportAllDeclaration_ = js.native
    def setSourceMapRange(node: ExportAllDeclaration_, sourceMapRange: SourceMapRange): ExportAllDeclaration_ = js.native
    def setSourceMapRange(node: ExportDefaultDeclaration_): ExportDefaultDeclaration_ = js.native
    def setSourceMapRange(node: ExportDefaultDeclaration_, sourceMapRange: SourceMapRange): ExportDefaultDeclaration_ = js.native
    def setSourceMapRange(node: ExportNamedDeclaration_): ExportNamedDeclaration_ = js.native
    def setSourceMapRange(node: ExportNamedDeclaration_, sourceMapRange: SourceMapRange): ExportNamedDeclaration_ = js.native
    def setSourceMapRange(node: ExpressionStatement_): ExpressionStatement_ = js.native
    def setSourceMapRange(node: ExpressionStatement_, sourceMapRange: SourceMapRange): ExpressionStatement_ = js.native
    def setSourceMapRange(node: ForInStatement_): ForInStatement_ = js.native
    def setSourceMapRange(node: ForInStatement_, sourceMapRange: SourceMapRange): ForInStatement_ = js.native
    def setSourceMapRange(node: ForOfStatement_): ForOfStatement_ = js.native
    def setSourceMapRange(node: ForOfStatement_, sourceMapRange: SourceMapRange): ForOfStatement_ = js.native
    def setSourceMapRange(node: ForStatement_): ForStatement_ = js.native
    def setSourceMapRange(node: ForStatement_, sourceMapRange: SourceMapRange): ForStatement_ = js.native
    def setSourceMapRange(node: FunctionDeclaration_): FunctionDeclaration_ = js.native
    def setSourceMapRange(node: FunctionDeclaration_, sourceMapRange: SourceMapRange): FunctionDeclaration_ = js.native
    def setSourceMapRange(node: FunctionExpression_): FunctionExpression_ = js.native
    def setSourceMapRange(node: FunctionExpression_, sourceMapRange: SourceMapRange): FunctionExpression_ = js.native
    def setSourceMapRange(node: Identifier_): Identifier_ = js.native
    def setSourceMapRange(node: Identifier_, sourceMapRange: SourceMapRange): Identifier_ = js.native
    def setSourceMapRange(node: IfStatement_): IfStatement_ = js.native
    def setSourceMapRange(node: IfStatement_, sourceMapRange: SourceMapRange): IfStatement_ = js.native
    def setSourceMapRange(node: ImportDeclaration_): ImportDeclaration_ = js.native
    def setSourceMapRange(node: ImportDeclaration_, sourceMapRange: SourceMapRange): ImportDeclaration_ = js.native
    def setSourceMapRange(node: Import_): Import_ = js.native
    def setSourceMapRange(node: Import_, sourceMapRange: SourceMapRange): Import_ = js.native
    def setSourceMapRange(node: InterfaceDeclaration_): InterfaceDeclaration_ = js.native
    def setSourceMapRange(node: InterfaceDeclaration_, sourceMapRange: SourceMapRange): InterfaceDeclaration_ = js.native
    def setSourceMapRange(node: JSXElement_): JSXElement_ = js.native
    def setSourceMapRange(node: JSXElement_, sourceMapRange: SourceMapRange): JSXElement_ = js.native
    def setSourceMapRange(node: JSXFragment_): JSXFragment_ = js.native
    def setSourceMapRange(node: JSXFragment_, sourceMapRange: SourceMapRange): JSXFragment_ = js.native
    def setSourceMapRange(node: LabeledStatement_): LabeledStatement_ = js.native
    def setSourceMapRange(node: LabeledStatement_, sourceMapRange: SourceMapRange): LabeledStatement_ = js.native
    def setSourceMapRange(node: LogicalExpression_): LogicalExpression_ = js.native
    def setSourceMapRange(node: LogicalExpression_, sourceMapRange: SourceMapRange): LogicalExpression_ = js.native
    def setSourceMapRange(node: MemberExpression_): MemberExpression_ = js.native
    def setSourceMapRange(node: MemberExpression_, sourceMapRange: SourceMapRange): MemberExpression_ = js.native
    def setSourceMapRange(node: MetaProperty_): MetaProperty_ = js.native
    def setSourceMapRange(node: MetaProperty_, sourceMapRange: SourceMapRange): MetaProperty_ = js.native
    def setSourceMapRange(node: ModuleExpression_): ModuleExpression_ = js.native
    def setSourceMapRange(node: ModuleExpression_, sourceMapRange: SourceMapRange): ModuleExpression_ = js.native
    def setSourceMapRange(node: NewExpression_): NewExpression_ = js.native
    def setSourceMapRange(node: NewExpression_, sourceMapRange: SourceMapRange): NewExpression_ = js.native
    def setSourceMapRange(node: NullLiteral_): NullLiteral_ = js.native
    def setSourceMapRange(node: NullLiteral_, sourceMapRange: SourceMapRange): NullLiteral_ = js.native
    def setSourceMapRange(node: NumericLiteral_): NumericLiteral_ = js.native
    def setSourceMapRange(node: NumericLiteral_, sourceMapRange: SourceMapRange): NumericLiteral_ = js.native
    def setSourceMapRange(node: ObjectExpression_): ObjectExpression_ = js.native
    def setSourceMapRange(node: ObjectExpression_, sourceMapRange: SourceMapRange): ObjectExpression_ = js.native
    def setSourceMapRange(node: OpaqueType_): OpaqueType_ = js.native
    def setSourceMapRange(node: OpaqueType_, sourceMapRange: SourceMapRange): OpaqueType_ = js.native
    def setSourceMapRange(node: OptionalCallExpression_): OptionalCallExpression_ = js.native
    def setSourceMapRange(node: OptionalCallExpression_, sourceMapRange: SourceMapRange): OptionalCallExpression_ = js.native
    def setSourceMapRange(node: OptionalMemberExpression_): OptionalMemberExpression_ = js.native
    def setSourceMapRange(node: OptionalMemberExpression_, sourceMapRange: SourceMapRange): OptionalMemberExpression_ = js.native
    def setSourceMapRange(node: ParenthesizedExpression_): ParenthesizedExpression_ = js.native
    def setSourceMapRange(node: ParenthesizedExpression_, sourceMapRange: SourceMapRange): ParenthesizedExpression_ = js.native
    def setSourceMapRange(node: PipelineBareFunction_): PipelineBareFunction_ = js.native
    def setSourceMapRange(node: PipelineBareFunction_, sourceMapRange: SourceMapRange): PipelineBareFunction_ = js.native
    def setSourceMapRange(node: PipelinePrimaryTopicReference_): PipelinePrimaryTopicReference_ = js.native
    def setSourceMapRange(node: PipelinePrimaryTopicReference_, sourceMapRange: SourceMapRange): PipelinePrimaryTopicReference_ = js.native
    def setSourceMapRange(node: PipelineTopicExpression_): PipelineTopicExpression_ = js.native
    def setSourceMapRange(node: PipelineTopicExpression_, sourceMapRange: SourceMapRange): PipelineTopicExpression_ = js.native
    def setSourceMapRange(node: RecordExpression_): RecordExpression_ = js.native
    def setSourceMapRange(node: RecordExpression_, sourceMapRange: SourceMapRange): RecordExpression_ = js.native
    def setSourceMapRange(node: RegExpLiteral_): RegExpLiteral_ = js.native
    def setSourceMapRange(node: RegExpLiteral_, sourceMapRange: SourceMapRange): RegExpLiteral_ = js.native
    def setSourceMapRange(node: ReturnStatement_): ReturnStatement_ = js.native
    def setSourceMapRange(node: ReturnStatement_, sourceMapRange: SourceMapRange): ReturnStatement_ = js.native
    def setSourceMapRange(node: SequenceExpression_): SequenceExpression_ = js.native
    def setSourceMapRange(node: SequenceExpression_, sourceMapRange: SourceMapRange): SequenceExpression_ = js.native
    def setSourceMapRange(node: StringLiteral_): StringLiteral_ = js.native
    def setSourceMapRange(node: StringLiteral_, sourceMapRange: SourceMapRange): StringLiteral_ = js.native
    def setSourceMapRange(node: Super_): Super_ = js.native
    def setSourceMapRange(node: Super_, sourceMapRange: SourceMapRange): Super_ = js.native
    def setSourceMapRange(node: SwitchStatement_): SwitchStatement_ = js.native
    def setSourceMapRange(node: SwitchStatement_, sourceMapRange: SourceMapRange): SwitchStatement_ = js.native
    def setSourceMapRange(node: TSAsExpression_): TSAsExpression_ = js.native
    def setSourceMapRange(node: TSAsExpression_, sourceMapRange: SourceMapRange): TSAsExpression_ = js.native
    def setSourceMapRange(node: TSDeclareFunction_): TSDeclareFunction_ = js.native
    def setSourceMapRange(node: TSDeclareFunction_, sourceMapRange: SourceMapRange): TSDeclareFunction_ = js.native
    def setSourceMapRange(node: TSEnumDeclaration_): TSEnumDeclaration_ = js.native
    def setSourceMapRange(node: TSEnumDeclaration_, sourceMapRange: SourceMapRange): TSEnumDeclaration_ = js.native
    def setSourceMapRange(node: TSExportAssignment_): TSExportAssignment_ = js.native
    def setSourceMapRange(node: TSExportAssignment_, sourceMapRange: SourceMapRange): TSExportAssignment_ = js.native
    def setSourceMapRange(node: TSImportEqualsDeclaration_): TSImportEqualsDeclaration_ = js.native
    def setSourceMapRange(node: TSImportEqualsDeclaration_, sourceMapRange: SourceMapRange): TSImportEqualsDeclaration_ = js.native
    def setSourceMapRange(node: TSInstantiationExpression_): TSInstantiationExpression_ = js.native
    def setSourceMapRange(node: TSInstantiationExpression_, sourceMapRange: SourceMapRange): TSInstantiationExpression_ = js.native
    def setSourceMapRange(node: TSInterfaceDeclaration_): TSInterfaceDeclaration_ = js.native
    def setSourceMapRange(node: TSInterfaceDeclaration_, sourceMapRange: SourceMapRange): TSInterfaceDeclaration_ = js.native
    def setSourceMapRange(node: TSModuleDeclaration_): TSModuleDeclaration_ = js.native
    def setSourceMapRange(node: TSModuleDeclaration_, sourceMapRange: SourceMapRange): TSModuleDeclaration_ = js.native
    def setSourceMapRange(node: TSNamespaceExportDeclaration_): TSNamespaceExportDeclaration_ = js.native
    def setSourceMapRange(node: TSNamespaceExportDeclaration_, sourceMapRange: SourceMapRange): TSNamespaceExportDeclaration_ = js.native
    def setSourceMapRange(node: TSNonNullExpression_): TSNonNullExpression_ = js.native
    def setSourceMapRange(node: TSNonNullExpression_, sourceMapRange: SourceMapRange): TSNonNullExpression_ = js.native
    def setSourceMapRange(node: TSSatisfiesExpression_): TSSatisfiesExpression_ = js.native
    def setSourceMapRange(node: TSSatisfiesExpression_, sourceMapRange: SourceMapRange): TSSatisfiesExpression_ = js.native
    def setSourceMapRange(node: TSTypeAliasDeclaration_): TSTypeAliasDeclaration_ = js.native
    def setSourceMapRange(node: TSTypeAliasDeclaration_, sourceMapRange: SourceMapRange): TSTypeAliasDeclaration_ = js.native
    def setSourceMapRange(node: TSTypeAssertion_): TSTypeAssertion_ = js.native
    def setSourceMapRange(node: TSTypeAssertion_, sourceMapRange: SourceMapRange): TSTypeAssertion_ = js.native
    def setSourceMapRange(node: TaggedTemplateExpression_): TaggedTemplateExpression_ = js.native
    def setSourceMapRange(node: TaggedTemplateExpression_, sourceMapRange: SourceMapRange): TaggedTemplateExpression_ = js.native
    def setSourceMapRange(node: TemplateElement_): TemplateElement_ = js.native
    def setSourceMapRange(node: TemplateElement_, sourceMapRange: SourceMapRange): TemplateElement_ = js.native
    def setSourceMapRange(node: TemplateLiteral_): TemplateLiteral_ = js.native
    def setSourceMapRange(node: TemplateLiteral_, sourceMapRange: SourceMapRange): TemplateLiteral_ = js.native
    def setSourceMapRange(node: ThisExpression_): ThisExpression_ = js.native
    def setSourceMapRange(node: ThisExpression_, sourceMapRange: SourceMapRange): ThisExpression_ = js.native
    def setSourceMapRange(node: ThrowStatement_): ThrowStatement_ = js.native
    def setSourceMapRange(node: ThrowStatement_, sourceMapRange: SourceMapRange): ThrowStatement_ = js.native
    def setSourceMapRange(node: TopicReference_): TopicReference_ = js.native
    def setSourceMapRange(node: TopicReference_, sourceMapRange: SourceMapRange): TopicReference_ = js.native
    def setSourceMapRange(node: TryStatement_): TryStatement_ = js.native
    def setSourceMapRange(node: TryStatement_, sourceMapRange: SourceMapRange): TryStatement_ = js.native
    def setSourceMapRange(node: TupleExpression_): TupleExpression_ = js.native
    def setSourceMapRange(node: TupleExpression_, sourceMapRange: SourceMapRange): TupleExpression_ = js.native
    def setSourceMapRange(node: TypeAlias_): TypeAlias_ = js.native
    def setSourceMapRange(node: TypeAlias_, sourceMapRange: SourceMapRange): TypeAlias_ = js.native
    def setSourceMapRange(node: TypeCastExpression_): TypeCastExpression_ = js.native
    def setSourceMapRange(node: TypeCastExpression_, sourceMapRange: SourceMapRange): TypeCastExpression_ = js.native
    def setSourceMapRange(node: UnaryExpression_): UnaryExpression_ = js.native
    def setSourceMapRange(node: UnaryExpression_, sourceMapRange: SourceMapRange): UnaryExpression_ = js.native
    def setSourceMapRange(node: UpdateExpression_): UpdateExpression_ = js.native
    def setSourceMapRange(node: UpdateExpression_, sourceMapRange: SourceMapRange): UpdateExpression_ = js.native
    def setSourceMapRange(node: VariableDeclaration_): VariableDeclaration_ = js.native
    def setSourceMapRange(node: VariableDeclaration_, sourceMapRange: SourceMapRange): VariableDeclaration_ = js.native
    def setSourceMapRange(node: WhileStatement_): WhileStatement_ = js.native
    def setSourceMapRange(node: WhileStatement_, sourceMapRange: SourceMapRange): WhileStatement_ = js.native
    def setSourceMapRange(node: WithStatement_): WithStatement_ = js.native
    def setSourceMapRange(node: WithStatement_, sourceMapRange: SourceMapRange): WithStatement_ = js.native
    def setSourceMapRange(node: YieldExpression_): YieldExpression_ = js.native
    def setSourceMapRange(node: YieldExpression_, sourceMapRange: SourceMapRange): YieldExpression_ = js.native
    
    /** The absolute path to the source file being compiled. */
    /* private */ var sourceUrl: Any = js.native
  }
}
