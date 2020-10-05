package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tableInterfaceMod {
  type ColumnTitle[RecordType] = typings.react.mod.ReactNode | (js.Function1[
    /* props */ typings.antd.tableInterfaceMod.ColumnTitleProps[RecordType], 
    typings.react.mod.ReactNode
  ])
  type ColumnsType[RecordType] = js.Array[
    typings.antd.tableInterfaceMod.ColumnGroupType[RecordType] | typings.rcTable.interfaceMod.ColumnType[RecordType]
  ]
  type CompareFn[T] = js.Function3[
    /* a */ T, 
    /* b */ T, 
    /* sortOrder */ js.UndefOr[typings.antd.tableInterfaceMod.SortOrder], 
    scala.Double
  ]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.antd.antdStrings.row
    - typings.antd.antdStrings.nest
  */
  type ExpandType = typings.antd.tableInterfaceMod._ExpandType | scala.Null
  type GetPopupContainer = js.Function1[/* triggerNode */ typings.std.HTMLElement, typings.std.HTMLElement]
  type Key = typings.react.mod.Key
  type SelectionItemSelectFn = js.Function1[/* currentRowKeys */ js.Array[typings.antd.tableInterfaceMod.Key], scala.Unit]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ typings.std.Event, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.descend
    - typings.antd.antdStrings.ascend
    - scala.Null
  */
  type SortOrder = typings.antd.tableInterfaceMod._SortOrder | scala.Null
  type TransformColumns[RecordType] = js.Function1[
    /* columns */ typings.antd.tableInterfaceMod.ColumnsType[RecordType], 
    typings.antd.tableInterfaceMod.ColumnsType[RecordType]
  ]
}
