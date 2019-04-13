package typings
package antdLib.libAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixState extends js.Object {
  var affixStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var lastAffix: scala.Boolean
  var placeholderStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var status: AffixStatus
}

object AffixState {
  @scala.inline
  def apply(
    lastAffix: scala.Boolean,
    status: AffixStatus,
    affixStyle: reactLib.reactMod.CSSProperties = null,
    placeholderStyle: reactLib.reactMod.CSSProperties = null
  ): AffixState = {
    val __obj = js.Dynamic.literal(lastAffix = lastAffix, status = status)
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle)
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle)
    __obj.asInstanceOf[AffixState]
  }
}

