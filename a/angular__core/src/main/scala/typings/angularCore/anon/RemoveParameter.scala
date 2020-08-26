package typings.angularCore.anon

import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveParameter extends js.Object {
  var removeParameter: js.Array[CallExpression] = js.native
  var removeProperty: js.Array[ObjectLiteralExpression] = js.native
}

object RemoveParameter {
  @scala.inline
  def apply(removeParameter: js.Array[CallExpression], removeProperty: js.Array[ObjectLiteralExpression]): RemoveParameter = {
    val __obj = js.Dynamic.literal(removeParameter = removeParameter.asInstanceOf[js.Any], removeProperty = removeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveParameter]
  }
  @scala.inline
  implicit class RemoveParameterOps[Self <: RemoveParameter] (val x: Self) extends AnyVal {
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
    def setRemoveParameterVarargs(value: CallExpression*): Self = this.set("removeParameter", js.Array(value :_*))
    @scala.inline
    def setRemoveParameter(value: js.Array[CallExpression]): Self = this.set("removeParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovePropertyVarargs(value: ObjectLiteralExpression*): Self = this.set("removeProperty", js.Array(value :_*))
    @scala.inline
    def setRemoveProperty(value: js.Array[ObjectLiteralExpression]): Self = this.set("removeProperty", value.asInstanceOf[js.Any])
  }
  
}

