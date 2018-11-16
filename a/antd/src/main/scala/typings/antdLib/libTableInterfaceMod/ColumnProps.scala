package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnProps[T] extends js.Object {
  var align: js.UndefOr[
    antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.center
  ] = js.undefined
  var children: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var dataIndex: js.UndefOr[java.lang.String] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var filterDropdown: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* props */ js.Object, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var filterDropdownVisible: js.UndefOr[scala.Boolean] = js.undefined
  var filterIcon: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* filtered */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var filterMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[_]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var fixed: js.UndefOr[scala.Boolean | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.ReactNs.Key] = js.undefined
  var onCell: js.UndefOr[js.Function1[/* record */ T, _]] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* record */ T, /* event */ js.Any, scala.Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function2[/* value */ js.Any, /* record */ T, scala.Boolean]] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var onHeaderCell: js.UndefOr[js.Function1[/* props */ ColumnProps[T], _]] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* text */ js.Any, 
      /* record */ T, 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var sorter: js.UndefOr[scala.Boolean | CompareFn[T]] = js.undefined
  var title: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* options */ antdLib.Anon_Filters, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

