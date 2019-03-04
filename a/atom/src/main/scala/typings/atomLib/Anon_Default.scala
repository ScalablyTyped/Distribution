package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var newValue: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb
  var oldValue: js.UndefOr[atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    newValue: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb,
    oldValue: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

