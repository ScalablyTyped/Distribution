package typings.antd

import typings.antd.esResultMod.ResultStatusType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/es/result.ResultProps> */
trait PartialResultProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[ResultStatusType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object PartialResultProps {
  @scala.inline
  def apply(
    className: String = null,
    extra: ReactNode = null,
    icon: ReactNode = null,
    prefixCls: String = null,
    status: ResultStatusType = null,
    style: CSSProperties = null,
    subTitle: ReactNode = null,
    title: ReactNode = null
  ): PartialResultProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResultProps]
  }
}

