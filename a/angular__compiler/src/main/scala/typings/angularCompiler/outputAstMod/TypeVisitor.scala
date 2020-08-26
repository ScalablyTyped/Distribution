package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeVisitor extends js.Object {
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any = js.native
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any = js.native
  def visitExpressionType(`type`: ExpressionType_, context: js.Any): js.Any = js.native
  def visitMapType(`type`: MapType, context: js.Any): js.Any = js.native
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
  @scala.inline
  implicit class TypeVisitorOps[Self <: TypeVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVisitArrayType(value: (ArrayType, js.Any) => js.Any): Self = this.set("visitArrayType", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitBuiltinType(value: (BuiltinType, js.Any) => js.Any): Self = this.set("visitBuiltinType", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitExpressionType(value: (ExpressionType_, js.Any) => js.Any): Self = this.set("visitExpressionType", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitMapType(value: (MapType, js.Any) => js.Any): Self = this.set("visitMapType", js.Any.fromFunction2(value))
  }
  
}

