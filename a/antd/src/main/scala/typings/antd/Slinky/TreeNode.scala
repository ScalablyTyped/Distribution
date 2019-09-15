package typings.antd.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esTreeTreeMod.AntTreeNodeProps
import typings.antd.esTreeTreeMod.AntdTreeNodeAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: checked, selected, className, disabled */
object TreeNode
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTreeMod.default.TreeNode.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* customProp */ StringDictionary[js.Any] = null,
    checkable: js.UndefOr[Boolean] = js.undefined,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    eventKey: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    icon: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, TagMod[Any]]) | TagMod[Any] = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    title: String | TagMod[Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable)
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AntTreeNodeProps
}

