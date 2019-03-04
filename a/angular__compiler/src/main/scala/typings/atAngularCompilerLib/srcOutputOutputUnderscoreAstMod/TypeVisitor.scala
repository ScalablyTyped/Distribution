package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeVisitor extends js.Object {
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any
  def visitExpressionType(`type`: ExpressionType, context: js.Any): js.Any
  def visitMapType(`type`: MapType, context: js.Any): js.Any
}

object TypeVisitor {
  @scala.inline
  def apply(
    visitArrayType: js.Function2[ArrayType, js.Any, js.Any],
    visitBuiltinType: js.Function2[BuiltinType, js.Any, js.Any],
    visitExpressionType: js.Function2[ExpressionType, js.Any, js.Any],
    visitMapType: js.Function2[MapType, js.Any, js.Any]
  ): TypeVisitor = {
    val __obj = js.Dynamic.literal(visitArrayType = visitArrayType, visitBuiltinType = visitBuiltinType, visitExpressionType = visitExpressionType, visitMapType = visitMapType)
  
    __obj.asInstanceOf[TypeVisitor]
  }
}

