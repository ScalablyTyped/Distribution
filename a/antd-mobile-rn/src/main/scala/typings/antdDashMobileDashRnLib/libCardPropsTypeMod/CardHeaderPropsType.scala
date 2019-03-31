package typings
package antdDashMobileDashRnLib.libCardPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderPropsType extends js.Object {
  var extra: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** need url of img, if this is string. */
  var thumb: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object CardHeaderPropsType {
  @scala.inline
  def apply(
    extra: reactLib.reactMod.ReactNs.ReactNode = null,
    thumb: reactLib.reactMod.ReactNs.ReactNode = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null
  ): CardHeaderPropsType = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderPropsType]
  }
}

