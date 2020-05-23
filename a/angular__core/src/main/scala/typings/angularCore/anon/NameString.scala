package typings.angularCore.anon

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameString extends js.Object {
  var name: String
  var target: Window | Null
}

object NameString {
  @scala.inline
  def apply(name: String, target: Window = null): NameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameString]
  }
}

