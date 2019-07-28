package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains all information about the requested context menu. */
trait ContextMenuExecuteEvent extends js.Object {
  /** enables the access to the menu content. The implementing object has to support the service {@link com.sun.star.ui.ActionTriggerContainer} ; */
  var ActionTriggerContainer: XIndexContainer
  /** contains the position the context menu will be executed at. */
  var ExecutePosition: Point
  /** provides the current selection inside the source window. */
  var Selection: XSelectionSupplier
  /** contains the window where the context menu has been requested */
  var SourceWindow: XWindow
}

object ContextMenuExecuteEvent {
  @scala.inline
  def apply(
    ActionTriggerContainer: XIndexContainer,
    ExecutePosition: Point,
    Selection: XSelectionSupplier,
    SourceWindow: XWindow
  ): ContextMenuExecuteEvent = {
    val __obj = js.Dynamic.literal(ActionTriggerContainer = ActionTriggerContainer, ExecutePosition = ExecutePosition, Selection = Selection, SourceWindow = SourceWindow)
  
    __obj.asInstanceOf[ContextMenuExecuteEvent]
  }
}

