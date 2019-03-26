package typings
package agDashGridLib.distLibWidgetsPopupServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/widgets/popupService", "PopupService")
@js.native
class PopupService () extends js.Object {
  var activePopupElements: js.Any = js.native
  var environment: js.Any = js.native
  var gridCore: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def addAsModalPopup(eChild: js.Any, closeOnEsc: scala.Boolean): js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit] = js.native
  def addAsModalPopup(eChild: js.Any, closeOnEsc: scala.Boolean, closedCallback: js.Function0[scala.Unit]): js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit] = js.native
  def addAsModalPopup(
    eChild: js.Any,
    closeOnEsc: scala.Boolean,
    closedCallback: js.Function0[scala.Unit],
    click: stdLib.MouseEvent
  ): js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit] = js.native
  def addAsModalPopup(
    eChild: js.Any,
    closeOnEsc: scala.Boolean,
    closedCallback: js.Function0[scala.Unit],
    click: stdLib.Touch
  ): js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit] = js.native
  /* private */ def callPostProcessPopup(
    ePopup: js.Any,
    eventSource: js.Any,
    mouseEvent: js.Any,
    `type`: js.Any,
    column: js.Any,
    rowNode: js.Any
  ): js.Any = js.native
  /* private */ def getPopupParent(): js.Any = js.native
  /* private */ def isEventFromCurrentPopup(mouseEvent: js.Any, touchEvent: js.Any, eChild: js.Any): js.Any = js.native
  /* private */ def isEventSameChainAsOriginalEvent(originalClick: js.Any, mouseEvent: js.Any, touchEvent: js.Any): js.Any = js.native
  /* private */ def keepXWithinBounds(params: js.Any, x: js.Any): js.Any = js.native
  /* private */ def keepYWithinBounds(params: js.Any, y: js.Any): js.Any = js.native
  /* private */ def positionPopup(params: js.Any): js.Any = js.native
  def positionPopupForMenu(params: agDashGridLib.Anon_EPopup): scala.Unit = js.native
  def positionPopupOverComponent(params: agDashGridLib.Anon_ColumnEPopupEventSource): scala.Unit = js.native
  def positionPopupUnderComponent(params: agDashGridLib.Anon_ColumnEPopup): scala.Unit = js.native
  def positionPopupUnderMouseEvent(params: agDashGridLib.Anon_Column): scala.Unit = js.native
}

