package typings.angularCompilerCli

import typings.angularCompiler.mod.ArrayType
import typings.angularCompiler.mod.BinaryOperatorExpr
import typings.angularCompiler.mod.BuiltinType
import typings.angularCompiler.mod.CommaExpr
import typings.angularCompiler.mod.ConditionalExpr
import typings.angularCompiler.mod.ExpressionType
import typings.angularCompiler.mod.ExpressionVisitor
import typings.angularCompiler.mod.ExternalExpr
import typings.angularCompiler.mod.FunctionExpr
import typings.angularCompiler.mod.InstantiateExpr
import typings.angularCompiler.mod.InvokeFunctionExpr
import typings.angularCompiler.mod.LiteralArrayExpr
import typings.angularCompiler.mod.LiteralExpr
import typings.angularCompiler.mod.LiteralMapExpr
import typings.angularCompiler.mod.LocalizedString
import typings.angularCompiler.mod.MapType
import typings.angularCompiler.mod.NotExpr
import typings.angularCompiler.mod.ReadKeyExpr
import typings.angularCompiler.mod.ReadPropExpr
import typings.angularCompiler.mod.ReadVarExpr
import typings.angularCompiler.mod.TaggedTemplateExpr
import typings.angularCompiler.mod.Type
import typings.angularCompiler.mod.TypeVisitor
import typings.angularCompiler.mod.TypeofExpr
import typings.angularCompiler.mod.UnaryOperatorExpr
import typings.angularCompiler.mod.WrappedNodeExpr
import typings.angularCompiler.mod.WriteKeyExpr
import typings.angularCompiler.mod.WritePropExpr
import typings.angularCompiler.mod.WriteVarExpr
import typings.angularCompilerCli.importManagerMod.ImportManager
import typings.angularCompilerCli.srcContextMod.Context
import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.EntityName
import typings.typescript.mod.KeywordTypeNode
import typings.typescript.mod.KeywordTypeSyntaxKind
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.TypeLiteralNode
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeQueryNode
import typings.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/type_translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/type_translator", "TypeTranslatorVisitor")
  @js.native
  open class TypeTranslatorVisitor protected ()
    extends StObject
       with ExpressionVisitor
       with TypeVisitor {
    def this(imports: ImportManager) = this()
    
    /* private */ var imports: Any = js.native
    
    /* private */ var translateExpression: Any = js.native
    
    /* private */ var translateType: Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(`type`: ArrayType, context: Any): Any = js.native
    def visitArrayType(`type`: ArrayType, context: Context): ArrayTypeNode = js.native
    
    /* CompleteClass */
    override def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Any): Any = js.native
    def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitBuiltinType(`type`: BuiltinType, context: Any): Any = js.native
    def visitBuiltinType(`type`: BuiltinType, context: Context): KeywordTypeNode[KeywordTypeSyntaxKind] = js.native
    
    /* CompleteClass */
    override def visitCommaExpr(ast: CommaExpr, context: Any): Any = js.native
    def visitCommaExpr(ast: CommaExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitConditionalExpr(ast: ConditionalExpr, context: Any): Any = js.native
    def visitConditionalExpr(ast: ConditionalExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitExpressionType(`type`: ExpressionType, context: Any): Any = js.native
    def visitExpressionType(`type`: ExpressionType, context: Context): TypeNode = js.native
    
    /* CompleteClass */
    override def visitExternalExpr(ast: ExternalExpr, context: Any): Any = js.native
    def visitExternalExpr(ast: ExternalExpr, context: Context): EntityName | TypeReferenceNode = js.native
    
    /* CompleteClass */
    override def visitFunctionExpr(ast: FunctionExpr, context: Any): Any = js.native
    def visitFunctionExpr(ast: FunctionExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitInstantiateExpr(ast: InstantiateExpr, context: Any): Any = js.native
    def visitInstantiateExpr(ast: InstantiateExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Any): Any = js.native
    def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Any): Any = js.native
    def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Context): TupleTypeNode = js.native
    
    /* CompleteClass */
    override def visitLiteralExpr(ast: LiteralExpr, context: Any): Any = js.native
    def visitLiteralExpr(ast: LiteralExpr, context: Context): TypeNode = js.native
    
    /* CompleteClass */
    override def visitLiteralMapExpr(ast: LiteralMapExpr, context: Any): Any = js.native
    def visitLiteralMapExpr(ast: LiteralMapExpr, context: Context): TypeLiteralNode = js.native
    
    /* CompleteClass */
    override def visitLocalizedString(ast: LocalizedString, context: Any): Any = js.native
    def visitLocalizedString(ast: LocalizedString, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitMapType(`type`: MapType, context: Any): Any = js.native
    def visitMapType(`type`: MapType, context: Context): TypeLiteralNode = js.native
    
    /* CompleteClass */
    override def visitNotExpr(ast: NotExpr, context: Any): Any = js.native
    def visitNotExpr(ast: NotExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitReadKeyExpr(ast: ReadKeyExpr, context: Any): Any = js.native
    def visitReadKeyExpr(ast: ReadKeyExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitReadPropExpr(ast: ReadPropExpr, context: Any): Any = js.native
    def visitReadPropExpr(ast: ReadPropExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitReadVarExpr(ast: ReadVarExpr, context: Any): Any = js.native
    def visitReadVarExpr(ast: ReadVarExpr, context: Context): TypeQueryNode = js.native
    
    /* CompleteClass */
    override def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Any): Any = js.native
    def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitTypeofExpr(ast: TypeofExpr, context: Any): Any = js.native
    def visitTypeofExpr(ast: TypeofExpr, context: Context): TypeQueryNode = js.native
    
    /* CompleteClass */
    override def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Any): Any = js.native
    def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], context: Any): Any = js.native
    def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], context: Context): TypeNode = js.native
    
    /* CompleteClass */
    override def visitWriteKeyExpr(expr: WriteKeyExpr, context: Any): Any = js.native
    def visitWriteKeyExpr(expr: WriteKeyExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitWritePropExpr(expr: WritePropExpr, context: Any): Any = js.native
    def visitWritePropExpr(expr: WritePropExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitWriteVarExpr(expr: WriteVarExpr, context: Any): Any = js.native
    def visitWriteVarExpr(expr: WriteVarExpr, context: Context): scala.Nothing = js.native
  }
  
  inline def translateType(`type`: Type, imports: ImportManager): TypeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("translateType")(`type`.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[TypeNode]
}
