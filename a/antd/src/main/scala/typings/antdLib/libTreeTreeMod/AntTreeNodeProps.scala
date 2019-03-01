package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeProps
  extends /* customProp */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[java.lang.String] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[
    (js.Function1[/* treeNode */ AntdTreeNodeAttribute, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var isLeaf: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object AntTreeNodeProps {
  @scala.inline
  def apply(
    StringDictionary: /* customProp */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: java.lang.String = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    icon: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode = null,
    isLeaf: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null
  ): AntTreeNodeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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

