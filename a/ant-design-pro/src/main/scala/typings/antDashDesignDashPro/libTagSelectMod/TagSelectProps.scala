package typings.antDashDesignDashPro.libTagSelectMod

import typings.antDashDesignDashPro.Anon_CollapseText
import typings.antDashDesignDashPro.libTagSelectTagSelectOptionMod.TagSelectOptionProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSelectProps extends js.Object {
  var Option: TagSelectOptionProps
  var actionsText: js.UndefOr[Anon_CollapseText] = js.undefined
  var children: ReactElement | js.Array[ReactElement]
  var className: String
  var expandable: js.UndefOr[Boolean] = js.undefined
  var hideCheckAll: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object TagSelectProps {
  @scala.inline
  def apply(
    Option: TagSelectOptionProps,
    children: ReactElement | js.Array[ReactElement],
    className: String,
    actionsText: Anon_CollapseText = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    hideCheckAll: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ js.Array[String] => Unit = null,
    style: CSSProperties = null,
    value: js.Array[Double | String] = null
  ): TagSelectProps = {
    val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    if (actionsText != null) __obj.updateDynamic("actionsText")(actionsText.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCheckAll)) __obj.updateDynamic("hideCheckAll")(hideCheckAll.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSelectProps]
  }
}

