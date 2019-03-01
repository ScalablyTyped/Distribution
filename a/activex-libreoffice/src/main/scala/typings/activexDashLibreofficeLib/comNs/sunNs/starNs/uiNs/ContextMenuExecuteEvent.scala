package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains all information about the requested context menu. */
trait ContextMenuExecuteEvent extends js.Object {
  /** enables the access to the menu content. The implementing object has to support the service {@link com.sun.star.ui.ActionTriggerContainer} ; */
  var ActionTriggerContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** contains the position the context menu will be executed at. */
  var ExecutePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** provides the current selection inside the source window. */
  var Selection: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionSupplier
  /** contains the window where the context menu has been requested */
  var SourceWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
}

object ContextMenuExecuteEvent {
  @scala.inline
  def apply(
    ActionTriggerContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    ExecutePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Selection: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionSupplier,
    SourceWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  ): ContextMenuExecuteEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActionTriggerContainer")(ActionTriggerContainer)
    __obj.updateDynamic("ExecutePosition")(ExecutePosition)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("SourceWindow")(SourceWindow)
    __obj.asInstanceOf[ContextMenuExecuteEvent]
  }
}

