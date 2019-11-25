package typings.antd.esTreeDashSelectInterfaceMod

import typings.antd.antdStrings.SHOW_ALL
import typings.antd.antdStrings.SHOW_CHILD
import typings.antd.antdStrings.SHOW_PARENT
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esSelectMod.AbstractSelectProps
import typings.antd.esSelectMod.SelectProps
import typings.antd.esSelectMod.SelectValue
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSelectProps[T /* <: TreeNodeValue */] extends AbstractSelectProps {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var defaultValue: js.UndefOr[T] = js.undefined
  var filterTreeNode: js.UndefOr[js.Function2[/* inputValue */ String, /* treeNode */ js.Any, Boolean]] = js.undefined
  var labelInValue: js.UndefOr[Boolean] = js.undefined
  var loadData: js.UndefOr[js.Function1[/* node */ js.Any, Unit]] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[ReactNode | (js.Function1[/* omittedValues */ js.Array[_], ReactNode])] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  @JSName("notFoundContent")
  var notFoundContent_TreeSelectProps: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[js.Function3[/* value */ T, /* label */ js.Any, /* extra */ js.Any, Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  @JSName("onSearch")
  var onSearch_TreeSelectProps: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function3[/* value */ js.Any, /* node */ js.Any, /* extra */ js.Any, Unit]] = js.undefined
  var onTreeExpand: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.undefined
  var removeIcon: js.UndefOr[ReactNode] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var searchValue: js.UndefOr[String] = js.undefined
  var showCheckedStrategy: js.UndefOr[SHOW_ALL | SHOW_PARENT | SHOW_CHILD] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
  var treeCheckStrictly: js.UndefOr[Boolean] = js.undefined
  var treeCheckable: js.UndefOr[Boolean | ReactNode] = js.undefined
  var treeData: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var treeDataSimpleMode: js.UndefOr[Boolean | TreeDataSimpleMode] = js.undefined
  var treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined
  var treeDefaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var treeExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var treeIcon: js.UndefOr[Boolean] = js.undefined
  var treeNodeFilterProp: js.UndefOr[String] = js.undefined
  var treeNodeLabelProp: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply[T /* <: TreeNodeValue */](
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    className: String = null,
    clearIcon: ReactNode = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: T = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => ReactNode = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    filterTreeNode: (/* inputValue */ String, /* treeNode */ js.Any) => Boolean = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    loadData: /* node */ js.Any => Unit = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: ReactNode | (js.Function1[/* omittedValues */ js.Array[_], ReactNode]) = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: ReactNode = null,
    onBlur: FocusEvent[HTMLInputElement] => Unit = null,
    onChange: (/* value */ T, /* label */ js.Any, /* extra */ js.Any) => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: FocusEvent[HTMLInputElement] => Unit = null,
    onSearch: /* value */ js.Any => Unit = null,
    onSelect: (/* value */ js.Any, /* node */ js.Any, /* extra */ js.Any) => Unit = null,
    onTreeExpand: /* keys */ js.Array[String] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String | ReactNode = null,
    prefixCls: String = null,
    removeIcon: ReactNode = null,
    searchPlaceholder: String = null,
    searchValue: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showCheckedStrategy: SHOW_ALL | SHOW_PARENT | SHOW_CHILD = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: default | large | small = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    tabIndex: Int | Double = null,
    transitionName: String = null,
    treeCheckStrictly: js.UndefOr[Boolean] = js.undefined,
    treeCheckable: Boolean | ReactNode = null,
    treeData: js.Array[TreeNode] = null,
    treeDataSimpleMode: Boolean | TreeDataSimpleMode = null,
    treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    treeDefaultExpandedKeys: js.Array[String] = null,
    treeExpandedKeys: js.Array[String] = null,
    treeIcon: js.UndefOr[Boolean] = js.undefined,
    treeNodeFilterProp: String = null,
    treeNodeLabelProp: String = null,
    value: T = null
  ): TreeSelectProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction2(filterTreeNode))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (onTreeExpand != null) __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1(onTreeExpand))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (showCheckedStrategy != null) __obj.updateDynamic("showCheckedStrategy")(showCheckedStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(treeCheckStrictly)) __obj.updateDynamic("treeCheckStrictly")(treeCheckStrictly.asInstanceOf[js.Any])
    if (treeCheckable != null) __obj.updateDynamic("treeCheckable")(treeCheckable.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    if (treeDataSimpleMode != null) __obj.updateDynamic("treeDataSimpleMode")(treeDataSimpleMode.asInstanceOf[js.Any])
    if (!js.isUndefined(treeDefaultExpandAll)) __obj.updateDynamic("treeDefaultExpandAll")(treeDefaultExpandAll.asInstanceOf[js.Any])
    if (treeDefaultExpandedKeys != null) __obj.updateDynamic("treeDefaultExpandedKeys")(treeDefaultExpandedKeys.asInstanceOf[js.Any])
    if (treeExpandedKeys != null) __obj.updateDynamic("treeExpandedKeys")(treeExpandedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(treeIcon)) __obj.updateDynamic("treeIcon")(treeIcon.asInstanceOf[js.Any])
    if (treeNodeFilterProp != null) __obj.updateDynamic("treeNodeFilterProp")(treeNodeFilterProp.asInstanceOf[js.Any])
    if (treeNodeLabelProp != null) __obj.updateDynamic("treeNodeLabelProp")(treeNodeLabelProp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSelectProps[T]]
  }
}

