package typings
package antdLib.esMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps
  extends rcDashMentionsLib.libMentionsMod.MentionsProps {
  var loading: js.UndefOr[scala.Boolean] = js.undefined
}

object MentionProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultValue: java.lang.String = null,
    filterOption: rcDashMentionsLib.rcDashMentionsLibNumbers.`false` | (js.Function2[
      /* input */ java.lang.String, 
      /* hasValue */ rcDashMentionsLib.libOptionMod.OptionProps, 
      scala.Boolean
    ]) = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: reactLib.reactMod.ReactNode = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = null,
    onChange: /* text */ java.lang.String => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = null,
    onSearch: (/* text */ java.lang.String, /* prefix */ java.lang.String) => scala.Unit = null,
    onSelect: (/* option */ rcDashMentionsLib.libOptionMod.OptionProps, /* prefix */ java.lang.String) => scala.Unit = null,
    placement: rcDashMentionsLib.libMentionsMod.Placement = null,
    prefix: java.lang.String | js.Array[java.lang.String] = null,
    prefixCls: java.lang.String = null,
    split: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionName: java.lang.String = null,
    validateSearch: (/* text */ java.lang.String, MentionProps) => scala.Boolean = null,
    value: java.lang.String = null
  ): MentionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (split != null) __obj.updateDynamic("split")(split)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (validateSearch != null) __obj.updateDynamic("validateSearch")(js.Any.fromFunction2(validateSearch))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MentionProps]
  }
}

