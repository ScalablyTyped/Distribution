package typings
package antdLib.libInputPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps
  extends antdLib.libInputInputMod.InputProps {
  val action: js.UndefOr[java.lang.String] = js.undefined
  val inputPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var visibilityToggle: js.UndefOr[scala.Boolean] = js.undefined
}

object PasswordProps {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    addonAfter: reactLib.reactMod.ReactNode = null,
    addonBefore: reactLib.reactMod.ReactNode = null,
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    inputPrefixCls: java.lang.String = null,
    onPressEnter: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLInputElement] = null,
    prefix: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    size: /* import warning: ImportType.apply Failed type conversion: ['small', 'default', 'large'][number] */ js.Any = null,
    suffix: reactLib.reactMod.ReactNode = null,
    visibilityToggle: js.UndefOr[scala.Boolean] = js.undefined
  ): PasswordProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(onPressEnter)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(visibilityToggle)) __obj.updateDynamic("visibilityToggle")(visibilityToggle)
    __obj.asInstanceOf[PasswordProps]
  }
}

