package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeVisitor extends js.Object {
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any
  def visitExpressionType(`type`: ExpressionType_, context: js.Any): js.Any
  def visitMapType(`type`: MapType, context: js.Any): js.Any
}

object TypeVisitor {
  @scala.inline
  def apply(
    visitArrayType: (ArrayType, js.Any) => js.Any,
    visitBuiltinType: (BuiltinType, js.Any) => js.Any,
    visitExpressionType: (ExpressionType_, js.Any) => js.Any,
    visitMapType: (MapType, js.Any) => js.Any
  ): TypeVisitor = {
    val __obj = js.Dynamic.literal(visitArrayType = js.Any.fromFunction2(visitArrayType), visitBuiltinType = js.Any.fromFunction2(visitBuiltinType), visitExpressionType = js.Any.fromFunction2(visitExpressionType), visitMapType = js.Any.fromFunction2(visitMapType))
  
    __obj.asInstanceOf[TypeVisitor]
  }
}

