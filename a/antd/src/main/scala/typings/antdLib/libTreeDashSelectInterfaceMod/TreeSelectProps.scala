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
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[/* value */ js.Any, /* label */ js.Any, /* extra */ js.Any, scala.Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLInputElement]] = js.undefined
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
  var treeNodeFilterProp: js.UndefOr[java.lang.String] = js.undefined
  var treeNodeLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
}

