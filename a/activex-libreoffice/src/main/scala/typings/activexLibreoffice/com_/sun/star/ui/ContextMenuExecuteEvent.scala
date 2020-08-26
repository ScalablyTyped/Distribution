package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains all information about the requested context menu. */
@js.native
trait ContextMenuExecuteEvent extends js.Object {
  /** enables the access to the menu content. The implementing object has to support the service {@link com.sun.star.ui.ActionTriggerContainer} ; */
  var ActionTriggerContainer: XIndexContainer = js.native
  /** contains the position the context menu will be executed at. */
  var ExecutePosition: Point = js.native
  /** provides the current selection inside the source window. */
  var Selection: XSelectionSupplier = js.native
  /** contains the window where the context menu has been requested */
  var SourceWindow: XWindow = js.native
}

object ContextMenuExecuteEvent {
  @scala.inline
  def apply(
    ActionTriggerContainer: XIndexContainer,
    ExecutePosition: Point,
    Selection: XSelectionSupplier,
    SourceWindow: XWindow
  ): ContextMenuExecuteEvent = {
    val __obj = js.Dynamic.literal(ActionTriggerContainer = ActionTriggerContainer.asInstanceOf[js.Any], ExecutePosition = ExecutePosition.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SourceWindow = SourceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuExecuteEvent]
  }
  @scala.inline
  implicit class ContextMenuExecuteEventOps[Self <: ContextMenuExecuteEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionTriggerContainer(value: XIndexContainer): Self = this.set("ActionTriggerContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutePosition(value: Point): Self = this.set("ExecutePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: XSelectionSupplier): Self = this.set("Selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceWindow(value: XWindow): Self = this.set("SourceWindow", value.asInstanceOf[js.Any])
  }
  
}

