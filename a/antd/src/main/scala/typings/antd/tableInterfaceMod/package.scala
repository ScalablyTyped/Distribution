package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableInterfaceMod {
  type CheckboxPropsCache = org.scalablytyped.runtime.StringDictionary[js.Any]
  type CompareFn[T] = js.Function3[
    /* a */ T, 
    /* b */ T, 
    /* sortOrder */ js.UndefOr[typings.antd.tableInterfaceMod.SortOrder], 
    scala.Double
  ]
  type GetPopupContainer = js.Function1[/* triggerNode */ js.UndefOr[typings.std.HTMLElement], typings.std.HTMLElement]
  type PrepareParamsArgumentsReturn[T] = js.Tuple4[js.Any, js.Array[java.lang.String], js.Object, typings.antd.AnonCurrentDataSource[T]]
  type SelectionItemSelectFn = js.Function1[/* key */ js.Array[java.lang.String], scala.Unit]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ typings.std.Event_, 
    scala.Unit
  ]
  type TableStateFilters = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}
