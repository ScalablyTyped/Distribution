package typings.antd.libTypographyTitleMod

import typings.antd.antdNumbers.`1`
import typings.antd.antdNumbers.`2`
import typings.antd.antdNumbers.`3`
import typings.antd.antdNumbers.`4`
import typings.antd.libTypographyBaseMod.BaseType
import typings.antd.libTypographyBaseMod.CopyConfig
import typings.antd.libTypographyBaseMod.EditConfig
import typings.antd.libTypographyBaseMod.EllipsisConfig
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/typography/Base.BlockProps & {  level ? :[1, 2, 3, 4][number]}, 'strong'> */
trait TitleProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[Boolean] = js.undefined
  var copyable: js.UndefOr[Boolean | CopyConfig] = js.undefined
  var delete: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean | EditConfig] = js.undefined
  var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[`1` | `2` | `3` | `4`] = js.undefined
  var mark: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[BaseType] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object TitleProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    children: ReactNode = null,
    className: String = null,
    code: js.UndefOr[Boolean] = js.undefined,
    copyable: Boolean | CopyConfig = null,
    delete: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: Boolean | EditConfig = null,
    ellipsis: Boolean | EllipsisConfig = null,
    id: String = null,
    level: `1` | `2` | `3` | `4` = null,
    mark: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    `type`: BaseType = null,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TitleProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (copyable != null) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleProps]
  }
}

