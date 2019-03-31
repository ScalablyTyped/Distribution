package typings
package antdDashMobileDashRnLib.libCardPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterPropsType extends js.Object {
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object CardFooterPropsType {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactNode = null,
    extra: reactLib.reactMod.ReactNs.ReactNode = null
  ): CardFooterPropsType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterPropsType]
  }
}

