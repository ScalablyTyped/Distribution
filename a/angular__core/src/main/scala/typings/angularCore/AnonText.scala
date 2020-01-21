package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  def text(): js.Promise[String]
}

object AnonText {
  @scala.inline
  def apply(text: () => js.Promise[String]): AnonText = {
    val __obj = js.Dynamic.literal(text = js.Any.fromFunction0(text))
  
    __obj.asInstanceOf[AnonText]
  }
}

