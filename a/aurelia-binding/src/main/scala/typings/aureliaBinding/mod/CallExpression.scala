package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallExpression extends js.Object {
  def createBinding(target: js.Any): Binding = js.native
}

object CallExpression {
  @scala.inline
  def apply(createBinding: js.Any => Binding): CallExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[CallExpression]
  }
  @scala.inline
  implicit class CallExpressionOps[Self <: CallExpression] (val x: Self) extends AnyVal {
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
    def setCreateBinding(value: js.Any => Binding): Self = this.set("createBinding", js.Any.fromFunction1(value))
  }
  
}

