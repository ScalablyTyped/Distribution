package typings.agDashGrid.distLibFilterFloatingFilterMod

import typings.agDashGrid.distLibWidgetsComponentMod.Component
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "InputTextFloatingFilterComp")
@js.native
abstract class InputTextFloatingFilterComp[M, P /* <: IFloatingFilterParams[M, BaseFloatingFilterChange[M]] */] ()
  extends Component
     with IFloatingFilter[M, BaseFloatingFilterChange[M], P] {
  var eColumnFloatingFilter: HTMLInputElement = js.native
  var lastKnownModel: M = js.native
  def asFloatingFilterText(parentModel: M): String = js.native
  def asParentModel(): M = js.native
  def currentParentModel(): M = js.native
  def equalModels(left: js.Any, right: js.Any): Boolean = js.native
  @JSName("init")
  def init_MInputTextFloatingFilterComp(params: P): Unit = js.native
  def onFloatingFilterChanged(change: BaseFloatingFilterChange[M]): Boolean = js.native
  def parseAsText(model: M): String = js.native
  def syncUpWithParentFilter(e: KeyboardEvent): Unit = js.native
}

