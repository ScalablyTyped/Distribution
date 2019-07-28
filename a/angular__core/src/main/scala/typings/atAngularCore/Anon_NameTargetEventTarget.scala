package typings.atAngularCore

import typings.atAngularCore.atAngularCoreMod.GlobalTargetName
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTargetEventTarget extends js.Object {
  var name: GlobalTargetName
  var target: EventTarget
}

object Anon_NameTargetEventTarget {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): Anon_NameTargetEventTarget = {
    val __obj = js.Dynamic.literal(name = name, target = target)
  
    __obj.asInstanceOf[Anon_NameTargetEventTarget]
  }
}

