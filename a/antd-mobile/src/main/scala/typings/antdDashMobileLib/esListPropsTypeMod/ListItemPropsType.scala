package typings
package antdDashMobileLib.esListPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemPropsType extends js.Object {
  var activeStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var align: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.middle | antdDashMobileLib.antdDashMobileLibStrings.bottom
  ] = js.undefined
  var arrow: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.horizontal | antdDashMobileLib.antdDashMobileLibStrings.down | antdDashMobileLib.antdDashMobileLibStrings.up | antdDashMobileLib.antdDashMobileLibStrings.empty | antdDashMobileLib.antdDashMobileLibStrings.Empty
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var multipleLine: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.android | antdDashMobileLib.antdDashMobileLibStrings.ios
  ] = js.undefined
  var thumb: js.UndefOr[reactLib.reactMod.ReactNode | scala.Null] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object ListItemPropsType {
  @scala.inline
  def apply(
    activeStyle: reactLib.reactMod.CSSProperties = null,
    align: antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.middle | antdDashMobileLib.antdDashMobileLibStrings.bottom = null,
    arrow: antdDashMobileLib.antdDashMobileLibStrings.horizontal | antdDashMobileLib.antdDashMobileLibStrings.down | antdDashMobileLib.antdDashMobileLibStrings.up | antdDashMobileLib.antdDashMobileLibStrings.empty | antdDashMobileLib.antdDashMobileLibStrings.Empty = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    multipleLine: js.UndefOr[scala.Boolean] = js.undefined,
    platform: antdDashMobileLib.antdDashMobileLibStrings.android | antdDashMobileLib.antdDashMobileLibStrings.ios = null,
    thumb: reactLib.reactMod.ReactNode = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ListItemPropsType]
  }
}

