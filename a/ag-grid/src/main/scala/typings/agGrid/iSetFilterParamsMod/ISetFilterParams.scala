package typings.agGrid.iSetFilterParamsMod

import typings.agGrid.AnonICellRendererComp
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iFilterMod.IFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetFilterParams
  extends IFilterParams
     with ComponentHolder {
  @JSName("apply")
  var apply: Boolean = js.native
  var cellHeight: Double = js.native
  var cellRenderer: AnonICellRendererComp | ICellRendererFunc | String = js.native
  var comparator: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  var debounceMs: js.UndefOr[Double] = js.native
  var miniFilterSearchByRefDataKey: js.UndefOr[Boolean] = js.native
  @JSName("newRowsAction")
  var newRowsAction_ISetFilterParams: String = js.native
  var selectAllOnMiniFilter: Boolean = js.native
  var suppressMiniFilter: Boolean = js.native
  var suppressRemoveEntries: js.UndefOr[Boolean] = js.native
  var suppressSorting: Boolean = js.native
  var values: js.UndefOr[SetFilterValues] = js.native
}

