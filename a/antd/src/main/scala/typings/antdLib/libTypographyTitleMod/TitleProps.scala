package typings
package antdLib.libTypographyTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/typography/Base.BlockProps & {  level ? :[1, 2, 3, 4][number]}, 'strong'> */
trait TitleProps extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[scala.Boolean] = js.undefined
  var copyable: js.UndefOr[scala.Boolean | antdLib.libTypographyBaseMod.CopyConfig] = js.undefined
  var delete: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editable: js.UndefOr[scala.Boolean | antdLib.libTypographyBaseMod.EditConfig] = js.undefined
  var ellipsis: js.UndefOr[scala.Boolean | antdLib.libTypographyBaseMod.EllipsisConfig] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[
    antdLib.antdLibNumbers.`1` | antdLib.antdLibNumbers.`2` | antdLib.antdLibNumbers.`3` | antdLib.antdLibNumbers.`4`
  ] = js.undefined
  var mark: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var `type`: js.UndefOr[antdLib.libTypographyBaseMod.BaseType] = js.undefined
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object TitleProps {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    code: js.UndefOr[scala.Boolean] = js.undefined,
    copyable: scala.Boolean | antdLib.libTypographyBaseMod.CopyConfig = null,
    delete: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: scala.Boolean | antdLib.libTypographyBaseMod.EditConfig = null,
    ellipsis: scala.Boolean | antdLib.libTypographyBaseMod.EllipsisConfig = null,
    id: java.lang.String = null,
    level: antdLib.antdLibNumbers.`1` | antdLib.antdLibNumbers.`2` | antdLib.antdLibNumbers.`3` | antdLib.antdLibNumbers.`4` = null,
    mark: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    `type`: antdLib.libTypographyBaseMod.BaseType = null,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): TitleProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (copyable != null) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[TitleProps]
  }
}

