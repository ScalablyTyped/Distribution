package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetExpression extends js.Object {
  def createBinding(): LetBinding = js.native
}

object LetExpression {
  @scala.inline
  def apply(createBinding: () => LetBinding): LetExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction0(createBinding))
    __obj.asInstanceOf[LetExpression]
  }
  @scala.inline
  implicit class LetExpressionOps[Self <: LetExpression] (val x: Self) extends AnyVal {
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
    def setCreateBinding(value: () => LetBinding): Self = this.set("createBinding", js.Any.fromFunction0(value))
  }
  
}

