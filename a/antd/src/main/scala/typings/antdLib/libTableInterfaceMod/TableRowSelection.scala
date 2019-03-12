package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowSelection[T] extends js.Object {
  var columnTitle: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var columnWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, js.Object]] = js.undefined
  var hideDefaultSelections: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedRowKeys */ js.Array[java.lang.String] | js.Array[scala.Double], 
      /* selectedRows */ js.Array[T], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.undefined
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* selected */ scala.Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelectInvert: js.UndefOr[
    js.Function1[
      /* selectedRowKeys */ js.Array[java.lang.String] | js.Array[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelectMultiple: js.UndefOr[
    js.Function3[
      /* selected */ scala.Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      scala.Unit
    ]
  ] = js.undefined
  var selectWay: js.UndefOr[TableSelectWay] = js.undefined
  var selectedRowKeys: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  var selections: js.UndefOr[js.Array[SelectionItem] | scala.Boolean] = js.undefined
  var `type`: js.UndefOr[RowSelectionType] = js.undefined
}

object TableRowSelection {
  @scala.inline
  def apply[T](
    columnTitle: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    columnWidth: java.lang.String | scala.Double = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    getCheckboxProps: /* record */ T => js.Object = null,
    hideDefaultSelections: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* selectedRowKeys */ js.Array[java.lang.String] | js.Array[scala.Double], /* selectedRows */ js.Array[T]) => scala.Unit = null,
    onSelect: SelectionSelectFn[T] = null,
    onSelectAll: (/* selected */ scala.Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => scala.Unit = null,
    onSelectInvert: /* selectedRowKeys */ js.Array[java.lang.String] | js.Array[scala.Double] => scala.Unit = null,
    onSelectMultiple: (/* selected */ scala.Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => scala.Unit = null,
    selectWay: TableSelectWay = null,
    selectedRowKeys: js.Array[java.lang.String] | js.Array[scala.Double] = null,
    selections: js.Array[SelectionItem] | scala.Boolean = null,
    `type`: RowSelectionType = null
  ): TableRowSelection[T] = {
    val __obj = js.Dynamic.literal()
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (getCheckboxProps != null) __obj.updateDynamic("getCheckboxProps")(js.Any.fromFunction1(getCheckboxProps))
    if (!js.isUndefined(hideDefaultSelections)) __obj.updateDynamic("hideDefaultSelections")(hideDefaultSelections)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction3(onSelectAll))
    if (onSelectInvert != null) __obj.updateDynamic("onSelectInvert")(js.Any.fromFunction1(onSelectInvert))
    if (onSelectMultiple != null) __obj.updateDynamic("onSelectMultiple")(js.Any.fromFunction3(onSelectMultiple))
    if (selectWay != null) __obj.updateDynamic("selectWay")(selectWay)
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selections != null) __obj.updateDynamic("selections")(selections.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableRowSelection[T]]
  }
}

