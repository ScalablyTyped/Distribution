package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esMentionsMod.MentionProps
import typings.antd.esMentionsMod.default
import typings.rcDashMentions.libMentionsMod.Placement
import typings.rcDashMentions.libOptionMod.OptionProps
import typings.rcDashMentions.rcDashMentionsNumbers.`false`
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, style, autoFocus, className, onFocus */
object Mentions
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMentionsMod.default].asInstanceOf[String | js.Object]
  def apply(
    defaultValue: String = null,
    filterOption: `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]) = null,
    getPopupContainer: () => HTMLElement = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: ReactNode = null,
    onChange: /* text */ String => Unit = null,
    onSearch: (/* text */ String, /* prefix */ String) => Unit = null,
    onSelect: (/* option */ OptionProps, /* prefix */ String) => Unit = null,
    placement: Placement = null,
    prefix: String | js.Array[String] = null,
    prefixCls: String = null,
    split: String = null,
    transitionName: String = null,
    validateSearch: (/* text */ String, MentionProps) => Boolean = null,
    value: String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction0(getPopupContainer))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (split != null) __obj.updateDynamic("split")(split)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (validateSearch != null) __obj.updateDynamic("validateSearch")(js.Any.fromFunction2(validateSearch))
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MentionProps
}

