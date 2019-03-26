package typings
package agDashGridLib.distLibHeaderRenderingStandardMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/standardMenu", "StandardMenuFactory")
@js.native
class StandardMenuFactory ()
  extends agDashGridLib.distLibInterfacesIMenuFactoryMod.IMenuFactory {
  var eventService: js.Any = js.native
  var filterManager: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var hidePopup: js.Any = js.native
  var popupService: js.Any = js.native
  def showPopup(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    positionCallback: js.Function1[/* eMenu */ stdLib.HTMLElement, scala.Unit]
  ): scala.Unit = js.native
}

