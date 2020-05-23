package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  def text(): js.Promise[String]
}

object Text {
  @scala.inline
  def apply(text: () => js.Promise[String]): Text = {
    val __obj = js.Dynamic.literal(text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Text]
  }
}

