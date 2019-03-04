package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenter extends js.Object {
  var placement: js.UndefOr[
    antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topCenter | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomCenter
  ]
  var `type`: antdLib.libDropdownDropdownDashButtonMod.DropdownButtonType
}

object Anon_BottomCenter {
  @scala.inline
  def apply(
    `type`: antdLib.libDropdownDropdownDashButtonMod.DropdownButtonType,
    placement: antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topCenter | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomCenter = null
  ): Anon_BottomCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenter]
  }
}

