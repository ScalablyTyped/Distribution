package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.antd.esMentionMod.MentionPlacement
import typings.antd.esMentionMod.MentionProps
import typings.antd.esMentionMod.SuggestionItme
import typings.antd.esMentionMod.default
import typings.react.reactMod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, readOnly, style, placeholder, className, onFocus, disabled */
object Mention
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMentionMod.default].asInstanceOf[String | js.Object]
  def apply(
    defaultSuggestions: js.Array[SuggestionItme] = null,
    defaultValue: js.Any = null,
    getSuggestionContainer: /* triggerNode */ typings.std.Element => HTMLElement = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    multiLines: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: js.Any = null,
    onChange: /* contentState */ js.Any => Unit = null,
    onSearchChange: (/* value */ String, /* trigger */ String) => _ = null,
    onSelect: (/* suggestion */ String, /* data */ js.UndefOr[js.Any]) => Unit = null,
    placement: MentionPlacement = null,
    prefix: String | js.Array[String] = null,
    prefixCls: String = null,
    suggestionStyle: CSSProperties = null,
    suggestions: js.Array[ReactElement] = null,
    value: js.Any = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultSuggestions != null) __obj.updateDynamic("defaultSuggestions")(defaultSuggestions)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (getSuggestionContainer != null) __obj.updateDynamic("getSuggestionContainer")(js.Any.fromFunction1(getSuggestionContainer))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(multiLines)) __obj.updateDynamic("multiLines")(multiLines)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (suggestionStyle != null) __obj.updateDynamic("suggestionStyle")(suggestionStyle)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MentionProps
}

