package typings
package antdLib.libAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixState extends js.Object {
  var affixStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties]
  var placeholderStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties]
}

object AffixState {
  @scala.inline
  def apply(
    affixStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placeholderStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): AffixState = {
    val __obj = js.Dynamic.literal()
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle)
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle)
    __obj.asInstanceOf[AffixState]
  }
}

