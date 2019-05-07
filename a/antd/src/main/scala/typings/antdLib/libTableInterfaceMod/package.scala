package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTableInterfaceMod {
  type CompareFn[T] = js.Function3[/* a */ T, /* b */ T, /* sortOrder */ js.UndefOr[SortOrder], scala.Double]
  type GetPopupContainer = js.Function1[/* triggerNode */ js.UndefOr[stdLib.HTMLElement], stdLib.HTMLElement]
  type PrepareParamsArgumentsReturn[T] = js.Tuple4[js.Any, js.Array[java.lang.String], js.Object, antdLib.Anon_CurrentDataSource[T]]
  type SelectionItemSelectFn = js.Function1[/* key */ js.Array[java.lang.String], js.Any]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ stdLib.Event, 
    js.Any
  ]
  type TableStateFilters = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}
