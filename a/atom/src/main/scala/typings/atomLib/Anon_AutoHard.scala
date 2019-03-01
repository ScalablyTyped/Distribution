package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHard extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard
}

object Anon_AutoHard {
  @scala.inline
  def apply(
    scopeDescriptor: atomLib.atomMod.ScopeDescriptor,
    value: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard
  ): Anon_AutoHard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopeDescriptor")(scopeDescriptor)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoHard]
  }
}

