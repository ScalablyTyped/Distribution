package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  def text(): js.Promise[String]
}

object Anon_Text {
  @scala.inline
  def apply(text: () => js.Promise[String]): Anon_Text = {
    val __obj = js.Dynamic.literal(text = js.Any.fromFunction0(text))
  
    __obj.asInstanceOf[Anon_Text]
  }
}

