package typings
package antdLib.esMentionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultSuggestions: js.UndefOr[js.Array[SuggestionItme]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var getSuggestionContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.Element, stdLib.HTMLElement]] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var multiLines: js.UndefOr[scala.Boolean] = js.undefined
  var notFoundContent: js.UndefOr[js.Any] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* contentState */ js.Any, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSearchChange: js.UndefOr[js.Function2[/* value */ java.lang.String, /* trigger */ java.lang.String, _]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* suggestion */ java.lang.String, /* data */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[MentionPlacement] = js.undefined
  var prefix: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var suggestionStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var suggestions: js.UndefOr[js.Array[reactLib.reactMod.ReactElement]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object MentionProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultSuggestions: js.Array[SuggestionItme] = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    getSuggestionContainer: /* triggerNode */ stdLib.Element => stdLib.HTMLElement = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    multiLines: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: js.Any = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] = null,
    onChange: /* contentState */ js.Any => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] = null,
    onSearchChange: (/* value */ java.lang.String, /* trigger */ java.lang.String) => _ = null,
    onSelect: (/* suggestion */ java.lang.String, /* data */ js.UndefOr[js.Any]) => scala.Unit = null,
    placeholder: java.lang.String = null,
    placement: MentionPlacement = null,
    prefix: java.lang.String | js.Array[java.lang.String] = null,
    prefixCls: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    suggestionStyle: reactLib.reactMod.CSSProperties = null,
    suggestions: js.Array[reactLib.reactMod.ReactElement] = null,
    value: js.Any = null
  ): MentionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSuggestions != null) __obj.updateDynamic("defaultSuggestions")(defaultSuggestions)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (getSuggestionContainer != null) __obj.updateDynamic("getSuggestionContainer")(js.Any.fromFunction1(getSuggestionContainer))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(multiLines)) __obj.updateDynamic("multiLines")(multiLines)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggestionStyle != null) __obj.updateDynamic("suggestionStyle")(suggestionStyle)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MentionProps]
  }
}

