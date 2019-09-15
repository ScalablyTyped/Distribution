package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.SHOW_ALL
import typings.antd.antdStrings.SHOW_CHILD
import typings.antd.antdStrings.SHOW_PARENT
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esSelectMod.SelectProps
import typings.antd.esSelectMod.SelectValue
import typings.antd.esTreeDashSelectInterfaceMod.TreeDataSimpleMode
import typings.antd.esTreeDashSelectInterfaceMod.TreeNodeValue
import typings.antd.esTreeDashSelectInterfaceMod.TreeSelectProps
import typings.antd.esTreeDashSelectMod.default
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: tabIndex, style, open, id, className, disabled, onBlur, autoFocus, onFocus, multiple */
object TreeDashSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTreeDashSelectMod.default[js.Any]].asInstanceOf[String | js.Object]
  def apply[T /* <: TreeNodeValue */](
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: T = null,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => ReactNode = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    filterTreeNode: (/* inputValue */ String, /* treeNode */ js.Any) => Boolean = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    loadData: /* node */ js.Any => Unit = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: TagMod[Any] | (js.Function1[/* omittedValues */ js.Array[_], TagMod[Any]]) = null,
    notFoundContent: ReactNode = null,
    notFoundContent_TreeSelectProps: TagMod[Any] = null,
    onChange: (/* value */ T, /* label */ js.Any, /* extra */ js.Any) => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSearch_TreeSelectProps: /* value */ js.Any => Unit = null,
    onSelect: /* value */ js.Any => Unit = null,
    onTreeExpand: /* keys */ js.Array[String] => Unit = null,
    placeholder: String | ReactNode = null,
    prefixCls: String = null,
    searchPlaceholder: String = null,
    searchValue: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showCheckedStrategy: SHOW_ALL | SHOW_PARENT | SHOW_CHILD = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: typings.antd.antdStrings.default | large | small = null,
    suffixIcon: TagMod[Any] = null,
    transitionName: String = null,
    treeCheckStrictly: js.UndefOr[Boolean] = js.undefined,
    treeCheckable: Boolean | TagMod[Any] = null,
    treeData: js.Array[typings.antd.esTreeDashSelectInterfaceMod.TreeNode] = null,
    treeDataSimpleMode: Boolean | TreeDataSimpleMode = null,
    treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    treeDefaultExpandedKeys: js.Array[String] = null,
    treeExpandedKeys: js.Array[String] = null,
    treeIcon: js.UndefOr[Boolean] = js.undefined,
    treeNodeFilterProp: String = null,
    treeNodeLabelProp: String = null,
    value: T = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction2(filterTreeNode))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue)
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (notFoundContent_TreeSelectProps != null) __obj.updateDynamic("notFoundContent")(notFoundContent_TreeSelectProps)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSearch_TreeSelectProps != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch_TreeSelectProps))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onTreeExpand != null) __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1(onTreeExpand))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (showCheckedStrategy != null) __obj.updateDynamic("showCheckedStrategy")(showCheckedStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(treeCheckStrictly)) __obj.updateDynamic("treeCheckStrictly")(treeCheckStrictly)
    if (treeCheckable != null) __obj.updateDynamic("treeCheckable")(treeCheckable.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData)
    if (treeDataSimpleMode != null) __obj.updateDynamic("treeDataSimpleMode")(treeDataSimpleMode.asInstanceOf[js.Any])
    if (!js.isUndefined(treeDefaultExpandAll)) __obj.updateDynamic("treeDefaultExpandAll")(treeDefaultExpandAll)
    if (treeDefaultExpandedKeys != null) __obj.updateDynamic("treeDefaultExpandedKeys")(treeDefaultExpandedKeys)
    if (treeExpandedKeys != null) __obj.updateDynamic("treeExpandedKeys")(treeExpandedKeys)
    if (!js.isUndefined(treeIcon)) __obj.updateDynamic("treeIcon")(treeIcon)
    if (treeNodeFilterProp != null) __obj.updateDynamic("treeNodeFilterProp")(treeNodeFilterProp)
    if (treeNodeLabelProp != null) __obj.updateDynamic("treeNodeLabelProp")(treeNodeLabelProp)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.antd.esTreeDashSelectMod.default[js.Any]]]
  }
  type Props = TreeSelectProps[js.Any]
}

