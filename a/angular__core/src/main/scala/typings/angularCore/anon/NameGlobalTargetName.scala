package typings.angularCore.anon

import typings.angularCore.mod.GlobalTargetName
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameGlobalTargetName extends js.Object {
  var name: GlobalTargetName
  var target: EventTarget
}

object NameGlobalTargetName {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): NameGlobalTargetName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameGlobalTargetName]
  }
}

