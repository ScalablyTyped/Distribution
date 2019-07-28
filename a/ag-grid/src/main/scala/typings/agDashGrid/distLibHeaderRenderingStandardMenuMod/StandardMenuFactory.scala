package typings.agDashGrid.distLibHeaderRenderingStandardMenuMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibInterfacesIMenuFactoryMod.IMenuFactory
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/standardMenu", "StandardMenuFactory")
@js.native
class StandardMenuFactory () extends IMenuFactory {
  var eventService: js.Any = js.native
  var filterManager: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var hidePopup: js.Any = js.native
  var popupService: js.Any = js.native
  def showPopup(column: Column, positionCallback: js.Function1[/* eMenu */ HTMLElement, Unit]): Unit = js.native
}

