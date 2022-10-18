package typings.angularCompilerCli

import typings.angularCompiler.mod.BinaryOperatorExpr
import typings.angularCompiler.mod.CommaExpr
import typings.angularCompiler.mod.ConditionalExpr
import typings.angularCompiler.mod.DeclareFunctionStmt
import typings.angularCompiler.mod.DeclareVarStmt
import typings.angularCompiler.mod.ExpressionStatement
import typings.angularCompiler.mod.ExpressionVisitor
import typings.angularCompiler.mod.ExternalExpr
import typings.angularCompiler.mod.FunctionExpr
import typings.angularCompiler.mod.IfStmt
import typings.angularCompiler.mod.InstantiateExpr
import typings.angularCompiler.mod.InvokeFunctionExpr
import typings.angularCompiler.mod.LiteralArrayExpr
import typings.angularCompiler.mod.LiteralExpr
import typings.angularCompiler.mod.LiteralMapExpr
import typings.angularCompiler.mod.LocalizedString
import typings.angularCompiler.mod.NotExpr
import typings.angularCompiler.mod.ReadKeyExpr
import typings.angularCompiler.mod.ReadPropExpr
import typings.angularCompiler.mod.ReadVarExpr
import typings.angularCompiler.mod.ReturnStatement
import typings.angularCompiler.mod.StatementVisitor
import typings.angularCompiler.mod.TaggedTemplateExpr
import typings.angularCompiler.mod.TypeofExpr
import typings.angularCompiler.mod.UnaryOperatorExpr
import typings.angularCompiler.mod.WrappedNodeExpr
import typings.angularCompiler.mod.WriteKeyExpr
import typings.angularCompiler.mod.WritePropExpr
import typings.angularCompiler.mod.WriteVarExpr
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typings.angularCompilerCli.srcNgtscTranslatorSrcContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/translator", "ExpressionTranslatorVisitor")
  @js.native
  open class ExpressionTranslatorVisitor[TStatement, TExpression] protected ()
    extends StObject
       with ExpressionVisitor
       with StatementVisitor {
    def this(
      factory: AstFactory[TStatement, TExpression],
      imports: ImportGenerator[TExpression],
      options: TranslatorOptions[TExpression]
    ) = this()
    
    /* private */ var attachComments: Any = js.native
    
    /**
      * Translate the tagged template literal into a call that is compatible with ES5, using the
      * imported `__makeTemplateObject` helper for ES5 formatted output.
      */
    /* private */ var createES5TaggedTemplateFunctionCall: Any = js.native
    
    /* private */ var createTaggedTemplateExpression: Any = js.native
    
    /* private */ var downlevelTaggedTemplates: Any = js.native
    
    /* private */ var downlevelVariableDeclarations: Any = js.native
    
    /* private */ var factory: Any = js.native
    
    /* private */ var imports: Any = js.native
    
    /* private */ var recordWrappedNode: Any = js.native
    
    /* private */ var setSourceMapRange: Any = js.native
    
    /* CompleteClass */
    override def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Any): Any = js.native
    def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitCommaExpr(ast: CommaExpr, context: Any): Any = js.native
    def visitCommaExpr(ast: CommaExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitConditionalExpr(ast: ConditionalExpr, context: Any): Any = js.native
    def visitConditionalExpr(ast: ConditionalExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: Any): Any = js.native
    def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: Context): TStatement = js.native
    
    /* CompleteClass */
    override def visitDeclareVarStmt(stmt: DeclareVarStmt, context: Any): Any = js.native
    def visitDeclareVarStmt(stmt: DeclareVarStmt, context: Context): TStatement = js.native
    
    /* CompleteClass */
    override def visitExpressionStmt(stmt: ExpressionStatement, context: Any): Any = js.native
    def visitExpressionStmt(stmt: ExpressionStatement, context: Context): TStatement = js.native
    
    def visitExternalExpr(ast: ExternalExpr, _context: Context): TExpression = js.native
    /* CompleteClass */
    override def visitExternalExpr(ast: ExternalExpr, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpr(ast: FunctionExpr, context: Any): Any = js.native
    def visitFunctionExpr(ast: FunctionExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitIfStmt(stmt: IfStmt, context: Any): Any = js.native
    def visitIfStmt(stmt: IfStmt, context: Context): TStatement = js.native
    
    /* CompleteClass */
    override def visitInstantiateExpr(ast: InstantiateExpr, context: Any): Any = js.native
    def visitInstantiateExpr(ast: InstantiateExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Any): Any = js.native
    def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Any): Any = js.native
    def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Context): TExpression = js.native
    
    def visitLiteralExpr(ast: LiteralExpr, _context: Context): TExpression = js.native
    /* CompleteClass */
    override def visitLiteralExpr(ast: LiteralExpr, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitLiteralMapExpr(ast: LiteralMapExpr, context: Any): Any = js.native
    def visitLiteralMapExpr(ast: LiteralMapExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitLocalizedString(ast: LocalizedString, context: Any): Any = js.native
    def visitLocalizedString(ast: LocalizedString, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitNotExpr(ast: NotExpr, context: Any): Any = js.native
    def visitNotExpr(ast: NotExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitReadKeyExpr(ast: ReadKeyExpr, context: Any): Any = js.native
    def visitReadKeyExpr(ast: ReadKeyExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitReadPropExpr(ast: ReadPropExpr, context: Any): Any = js.native
    def visitReadPropExpr(ast: ReadPropExpr, context: Context): TExpression = js.native
    
    def visitReadVarExpr(ast: ReadVarExpr, _context: Context): TExpression = js.native
    /* CompleteClass */
    override def visitReadVarExpr(ast: ReadVarExpr, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitReturnStmt(stmt: ReturnStatement, context: Any): Any = js.native
    def visitReturnStmt(stmt: ReturnStatement, context: Context): TStatement = js.native
    
    /* private */ var visitStatements: Any = js.native
    
    /* CompleteClass */
    override def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Any): Any = js.native
    def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitTypeofExpr(ast: TypeofExpr, context: Any): Any = js.native
    def visitTypeofExpr(ast: TypeofExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Any): Any = js.native
    def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Context): TExpression = js.native
    
    def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], _context: Context): Any = js.native
    /* CompleteClass */
    override def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitWriteKeyExpr(expr: WriteKeyExpr, context: Any): Any = js.native
    def visitWriteKeyExpr(expr: WriteKeyExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitWritePropExpr(expr: WritePropExpr, context: Any): Any = js.native
    def visitWritePropExpr(expr: WritePropExpr, context: Context): TExpression = js.native
    
    /* CompleteClass */
    override def visitWriteVarExpr(expr: WriteVarExpr, context: Any): Any = js.native
    def visitWriteVarExpr(expr: WriteVarExpr, context: Context): TExpression = js.native
  }
  
  type RecordWrappedNodeFn[TExpression] = js.Function1[/* node */ WrappedNodeExpr[TExpression], Unit]
  
  trait TranslatorOptions[TExpression] extends StObject {
    
    var annotateForClosureCompiler: js.UndefOr[Boolean] = js.undefined
    
    var downlevelTaggedTemplates: js.UndefOr[Boolean] = js.undefined
    
    var downlevelVariableDeclarations: js.UndefOr[Boolean] = js.undefined
    
    var recordWrappedNode: js.UndefOr[RecordWrappedNodeFn[TExpression]] = js.undefined
  }
  object TranslatorOptions {
    
    inline def apply[TExpression](): TranslatorOptions[TExpression] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslatorOptions[TExpression]]
    }
    
    extension [Self <: TranslatorOptions[?], TExpression](x: Self & TranslatorOptions[TExpression]) {
      
      inline def setAnnotateForClosureCompiler(value: Boolean): Self = StObject.set(x, "annotateForClosureCompiler", value.asInstanceOf[js.Any])
      
      inline def setAnnotateForClosureCompilerUndefined: Self = StObject.set(x, "annotateForClosureCompiler", js.undefined)
      
      inline def setDownlevelTaggedTemplates(value: Boolean): Self = StObject.set(x, "downlevelTaggedTemplates", value.asInstanceOf[js.Any])
      
      inline def setDownlevelTaggedTemplatesUndefined: Self = StObject.set(x, "downlevelTaggedTemplates", js.undefined)
      
      inline def setDownlevelVariableDeclarations(value: Boolean): Self = StObject.set(x, "downlevelVariableDeclarations", value.asInstanceOf[js.Any])
      
      inline def setDownlevelVariableDeclarationsUndefined: Self = StObject.set(x, "downlevelVariableDeclarations", js.undefined)
      
      inline def setRecordWrappedNode(value: /* node */ WrappedNodeExpr[TExpression] => Unit): Self = StObject.set(x, "recordWrappedNode", js.Any.fromFunction1(value))
      
      inline def setRecordWrappedNodeUndefined: Self = StObject.set(x, "recordWrappedNode", js.undefined)
    }
  }
}
