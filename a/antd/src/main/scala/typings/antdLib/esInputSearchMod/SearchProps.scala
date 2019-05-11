package typings
package antdLib.esInputSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProps
  extends antdLib.esInputInputMod.InputProps {
  var enterButton: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNode] = js.undefined
  var inputPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var onSearch: js.UndefOr[
    js.Function2[
      /* value */ java.lang.String, 
      /* event */ js.UndefOr[
        (reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement]
      ], 
      _
    ]
  ] = js.undefined
}

object SearchProps {
  @scala.inline
  def apply(
    addonAfter: reactLib.reactMod.ReactNode = null,
    addonBefore: reactLib.reactMod.ReactNode = null,
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    enterButton: scala.Boolean | reactLib.reactMod.ReactNode = null,
    inputPrefixCls: java.lang.String = null,
    onPressEnter: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLInputElement] = null,
    onSearch: (/* value */ java.lang.String, /* event */ js.UndefOr[
      (reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement]
    ]) => _ = null,
    prefix: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    size: /* import warning: ImportType.apply Failed type conversion: ['small', 'default', 'large'][number] */ js.Any = null,
    suffix: reactLib.reactMod.ReactNode = null
  ): SearchProps = {
    val __obj = js.Dynamic.literal()
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (enterButton != null) __obj.updateDynamic("enterButton")(enterButton.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(onPressEnter)
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProps]
  }
}

