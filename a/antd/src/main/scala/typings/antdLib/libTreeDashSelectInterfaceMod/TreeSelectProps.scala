package typings
package antdLib.libTreeDashSelectInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSelectProps
  extends antdLib.libSelectMod.AbstractSelectProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
  var filterTreeNode: js.UndefOr[
    js.Function2[/* inputValue */ java.lang.String, /* treeNode */ js.Any, scala.Boolean]
  ] = js.undefined
  var labelInValue: js.UndefOr[scala.Boolean] = js.undefined
  var loadData: js.UndefOr[js.Function1[/* node */ js.Any, scala.Unit]] = js.undefined
  var maxTagCount: js.UndefOr[scala.Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* omittedValues */ js.Array[_], reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("notFoundContent")
  var notFoundContent_TreeSelectProps: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[/* value */ js.Any, /* label */ js.Any, /* extra */ js.Any, scala.Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLInputElement]] = js.undefined
  @JSName("onSearch")
  var onSearch_TreeSelectProps: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onTreeExpand: js.UndefOr[js.Function1[/* keys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var searchPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var searchValue: js.UndefOr[java.lang.String] = js.undefined
  var showCheckedStrategy: js.UndefOr[
    antdLib.antdLibStrings.SHOW_ALL | antdLib.antdLibStrings.SHOW_PARENT | antdLib.antdLibStrings.SHOW_CHILD
  ] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var treeCheckStrictly: js.UndefOr[scala.Boolean] = js.undefined
  var treeCheckable: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var treeData: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var treeDataSimpleMode: js.UndefOr[scala.Boolean | TreeDataSimpleMode] = js.undefined
  var treeDefaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined
  var treeDefaultExpandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var treeExpandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var treeIcon: js.UndefOr[scala.Boolean] = js.undefined
  var treeNodeFilterProp: js.UndefOr[java.lang.String] = js.undefined
  var treeNodeLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    choiceTransitionName: java.lang.String = null,
    className: java.lang.String = null,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String | scala.Double | js.Array[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], /* props */ js.UndefOr[antdLib.libSelectMod.SelectProps[antdLib.libSelectMod.SelectValue]]) => reactLib.reactMod.ReactNs.ReactNode = null,
    dropdownStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    filterOption: scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps], 
      _
    ]) = null,
    filterTreeNode: (/* inputValue */ java.lang.String, /* treeNode */ js.Any) => scala.Boolean = null,
    getPopupContainer: /* triggerNode */ js.UndefOr[stdLib.Element] => stdLib.HTMLElement = null,
    id: java.lang.String = null,
    labelInValue: js.UndefOr[scala.Boolean] = js.undefined,
    loadData: /* node */ js.Any => scala.Unit = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    maxTagCount: scala.Int | scala.Double = null,
    maxTagPlaceholder: reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* omittedValues */ js.Array[_], reactLib.reactMod.ReactNs.ReactNode]) = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLInputElement] = null,
    onChange: (/* value */ js.Any, /* label */ js.Any, /* extra */ js.Any) => scala.Unit = null,
    onDropdownVisibleChange: /* open */ scala.Boolean => scala.Unit = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLInputElement] = null,
    onSearch: /* value */ js.Any => scala.Unit = null,
    onSelect: /* value */ js.Any => scala.Unit = null,
    onTreeExpand: /* keys */ js.Array[java.lang.String] => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    searchPlaceholder: java.lang.String = null,
    searchValue: java.lang.String = null,
    showAction: java.lang.String | js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showCheckedStrategy: antdLib.antdLibStrings.SHOW_ALL | antdLib.antdLibStrings.SHOW_PARENT | antdLib.antdLibStrings.SHOW_CHILD = null,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    size: /* import warning: ImportType.apply Failed type conversion: ['default', 'large', 'small'][number] */ js.Any = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    tabIndex: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    treeCheckStrictly: js.UndefOr[scala.Boolean] = js.undefined,
    treeCheckable: scala.Boolean | reactLib.reactMod.ReactNs.ReactNode = null,
    treeData: js.Array[TreeNode] = null,
    treeDataSimpleMode: scala.Boolean | TreeDataSimpleMode = null,
    treeDefaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined,
    treeDefaultExpandedKeys: js.Array[java.lang.String] = null,
    treeExpandedKeys: js.Array[java.lang.String] = null,
    treeIcon: js.UndefOr[scala.Boolean] = js.undefined,
    treeNodeFilterProp: java.lang.String = null,
    treeNodeLabelProp: java.lang.String = null,
    value: java.lang.String | scala.Double | js.Array[_] = null
  ): TreeSelectProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction2(filterTreeNode))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue)
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onTreeExpand != null) __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1(onTreeExpand))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (showCheckedStrategy != null) __obj.updateDynamic("showCheckedStrategy")(showCheckedStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[TreeSelectProps]
  }
}

