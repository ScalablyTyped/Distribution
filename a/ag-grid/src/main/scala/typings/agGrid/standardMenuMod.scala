package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.iMenuFactoryMod.IMenuFactory
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/standardMenu", JSImport.Namespace)
@js.native
object standardMenuMod extends js.Object {
  @js.native
  class StandardMenuFactory () extends IMenuFactory {
    var eventService: js.Any = js.native
    var filterManager: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var hidePopup: js.Any = js.native
    var popupService: js.Any = js.native
    def showPopup(column: Column, positionCallback: js.Function1[/* eMenu */ HTMLElement, Unit]): Unit = js.native
  }
  
}

