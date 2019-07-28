package typings.atAngularCore

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTargetNull extends js.Object {
  var name: String
  var target: Window | Null
}

object Anon_NameTargetNull {
  @scala.inline
  def apply(name: String, target: Window = null): Anon_NameTargetNull = {
    val __obj = js.Dynamic.literal(name = name)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_NameTargetNull]
  }
}

