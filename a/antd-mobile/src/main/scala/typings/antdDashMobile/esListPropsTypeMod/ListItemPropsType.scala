package typings.antdDashMobile.esListPropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.Empty
import typings.antdDashMobile.antdDashMobileStrings.android
import typings.antdDashMobile.antdDashMobileStrings.bottom
import typings.antdDashMobile.antdDashMobileStrings.down
import typings.antdDashMobile.antdDashMobileStrings.empty
import typings.antdDashMobile.antdDashMobileStrings.horizontal
import typings.antdDashMobile.antdDashMobileStrings.ios
import typings.antdDashMobile.antdDashMobileStrings.middle
import typings.antdDashMobile.antdDashMobileStrings.top
import typings.antdDashMobile.antdDashMobileStrings.up
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemPropsType extends js.Object {
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  var arrow: js.UndefOr[horizontal | down | up | empty | Empty] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[android | ios] = js.undefined
  var thumb: js.UndefOr[ReactNode | Null] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object ListItemPropsType {
  @scala.inline
  def apply(
    activeStyle: CSSProperties = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | Empty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    platform: android | ios = null,
    thumb: ReactNode = null,
    wrap: js.UndefOr[Boolean] = js.undefined
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

