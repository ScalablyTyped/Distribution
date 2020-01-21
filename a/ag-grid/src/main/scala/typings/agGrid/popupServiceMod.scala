package typings.agGrid

import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/widgets/popupService", JSImport.Namespace)
@js.native
object popupServiceMod extends js.Object {
  @js.native
  class PopupService () extends js.Object {
    var activePopupElements: js.Any = js.native
    var environment: js.Any = js.native
    var gridCore: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.Function0[Unit]): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.Function0[Unit], click: MouseEvent): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.Function0[Unit], click: Touch): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
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
    def positionPopupForMenu(params: AnonEPopup): Unit = js.native
    def positionPopupOverComponent(params: AnonColumnEPopupEventSource): Unit = js.native
    def positionPopupUnderComponent(params: AnonColumnEPopup): Unit = js.native
    def positionPopupUnderMouseEvent(params: AnonColumn): Unit = js.native
  }
  
}

