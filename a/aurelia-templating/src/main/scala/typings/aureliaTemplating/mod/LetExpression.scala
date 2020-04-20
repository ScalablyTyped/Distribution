package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetExpression extends js.Object {
  def createBinding(): LetBinding
}

object LetExpression {
  @scala.inline
  def apply(createBinding: () => LetBinding): LetExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction0(createBinding))
    __obj.asInstanceOf[LetExpression]
  }
}

