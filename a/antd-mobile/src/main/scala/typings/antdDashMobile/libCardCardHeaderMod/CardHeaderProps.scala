package typings.antdDashMobile.libCardCardHeaderMod

import typings.antdDashMobile.libCardPropsTypeMod.CardHeaderPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends CardHeaderPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    className: String = null,
    extra: ReactNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    thumb: ReactNode = null,
    thumbStyle: CSSProperties = null,
    title: ReactNode = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

