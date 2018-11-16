package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTableInterfaceMod {
  type CompareFn[T] = js.Function3[/* a */ T, /* b */ T, /* sortOrder */ js.UndefOr[SortOrder], scala.Double]
  type PrepareParamsArgumentsReturn[T] = js.Tuple4[js.Any, js.Array[java.lang.String], js.Object, antdLib.Anon_CurrentDataSource[T]]
  type RowSelectionType = antdLib.antdLibStrings.checkbox | antdLib.antdLibStrings.radio
  type SelectionItemSelectFn = js.Function1[/* key */ js.Array[java.lang.String], js.Any]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ reactLib.Event, 
    js.Any
  ]
  type SortOrder = antdLib.antdLibStrings.descend | antdLib.antdLibStrings.ascend
  type TableSelectWay = antdLib.antdLibStrings.onSelect | antdLib.antdLibStrings.onSelectMultiple | antdLib.antdLibStrings.onSelectAll | antdLib.antdLibStrings.onSelectInvert
  type TableSize = antdLib.antdLibStrings.default | antdLib.antdLibStrings.middle | antdLib.antdLibStrings.small
}
