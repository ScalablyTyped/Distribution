package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "InputTextFloatingFilterComp")
@js.native
abstract class InputTextFloatingFilterComp[M, P /* <: IFloatingFilterParams[M, BaseFloatingFilterChange[M]] */] ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component
     with IFloatingFilter[M, BaseFloatingFilterChange[M], P] {
  var eColumnFloatingFilter: stdLib.HTMLInputElement = js.native
  var lastKnownModel: M = js.native
  def asFloatingFilterText(parentModel: M): java.lang.String = js.native
  def asParentModel(): M = js.native
  def currentParentModel(): M = js.native
  def equalModels(left: js.Any, right: js.Any): scala.Boolean = js.native
  @JSName("init")
  def init_MInputTextFloatingFilterComp(params: P): scala.Unit = js.native
  def onFloatingFilterChanged(change: BaseFloatingFilterChange[M]): scala.Boolean = js.native
  def parseAsText(model: M): java.lang.String = js.native
  def syncUpWithParentFilter(e: stdLib.KeyboardEvent): scala.Unit = js.native
}

