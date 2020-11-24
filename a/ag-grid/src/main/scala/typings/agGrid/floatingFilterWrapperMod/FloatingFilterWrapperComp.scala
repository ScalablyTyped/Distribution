package typings.agGrid.floatingFilterWrapperMod

import typings.agGrid.baseFilterMod.CombinedFilter
import typings.agGrid.floatingFilterMod.FloatingFilterChange
import typings.agGrid.floatingFilterMod.IFloatingFilterComp
import typings.agGrid.floatingFilterMod.IFloatingFilterParams
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "FloatingFilterWrapperComp")
@js.native
class FloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */] () extends BaseFilterWrapperComp[M, F, PC, P] {
  
  /* private */ def addEventListeners(): js.Any = js.native
  
  var eButtonShowMainFilter: HTMLInputElement = js.native
  
  var floatingFilterCompPromise: Promise[IFloatingFilterComp[M, F, PC]] = js.native
  
  var gridOptionsWrapper: js.Any = js.native
  
  @JSName("init")
  def init_MFloatingFilterWrapperComp(params: P): Unit = js.native
  
  var menuFactory: js.Any = js.native
  
  def onParentModelChanged(parentModel: CombinedFilter[M]): Unit = js.native
  
  /* private */ def showParentFilter(): js.Any = js.native
  
  var suppressFilterButton: Boolean = js.native
}
