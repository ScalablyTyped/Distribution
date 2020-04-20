package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object CallExpression {
  @scala.inline
  def apply(createBinding: js.Any => Binding): CallExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[CallExpression]
  }
}

