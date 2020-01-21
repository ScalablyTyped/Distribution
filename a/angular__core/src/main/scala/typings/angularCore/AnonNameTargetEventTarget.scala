package typings.angularCore

import typings.angularCore.mod.GlobalTargetName
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTargetEventTarget extends js.Object {
  var name: GlobalTargetName
  var target: EventTarget
}

object AnonNameTargetEventTarget {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): AnonNameTargetEventTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTargetEventTarget]
  }
}

