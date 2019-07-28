package typings.antd.esTreeTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeProps
  extends /* customProp */ StringDictionary[js.Any] {
  var checkable: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disableCheckbox: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[String] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[(js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactNode]) | ReactNode] = js.undefined
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String | ReactNode] = js.undefined
}

object AntTreeNodeProps {
  @scala.inline
  def apply(
    StringDictionary: /* customProp */ StringDictionary[js.Any] = null,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    icon: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactNode]) | ReactNode = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    title: String | ReactNode = null
  ): AntTreeNodeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeProps]
  }
}

