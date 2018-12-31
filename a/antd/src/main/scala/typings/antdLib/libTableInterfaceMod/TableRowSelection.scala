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

