package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "DateFloatingFilterComp")
@js.native
class DateFloatingFilterComp ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component
     with IFloatingFilter[
      agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter, 
      BaseFloatingFilterChange[agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter], 
      IFloatingFilterParams[
        agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter, 
        BaseFloatingFilterChange[agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter]
      ]
    ] {
  var componentRecipes: js.Any = js.native
  var dateComponentPromise: js.Any = js.native
  var lastKnownModel: agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter = js.native
  def asParentModel(): agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter = js.native
  def currentParentModel(): agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter = js.native
  /* private */ def enrichDateInput(`type`: js.Any, dateFrom: js.Any, dateTo: js.Any, dateComponent: js.Any): js.Any = js.native
  def equalModels(
    left: agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter,
    right: agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter
  ): scala.Boolean = js.native
  @JSName("init")
  def init_MDateFloatingFilterComp(
    params: IFloatingFilterParams[
      agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter, 
      BaseFloatingFilterChange[agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter]
    ]
  ): scala.Unit = js.native
  /* private */ def onDateChanged(): js.Any = js.native
  def onFloatingFilterChanged(change: BaseFloatingFilterChange[agDashGridLib.distLibFilterDateFilterMod.SerializedDateFilter]): scala.Unit = js.native
}

