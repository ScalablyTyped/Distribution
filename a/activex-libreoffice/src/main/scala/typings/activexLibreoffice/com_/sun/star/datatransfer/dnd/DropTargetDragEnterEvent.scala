package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link DropTargetDragEnterEvent} is delivered from the drop target to the currently registered drop target listeners whenever the logical cursor
  * associated with a Drag and Drop operation enters the visible geometry of a window associated with a drop target.
  *
  * It contains the {@link com.sun.star.datatransfer.DataFlavor} types supported by the transferable object of the current Drag and Drop operation.
  * @see com.sun.star.datatransfer.XTransferable
  */
@js.native
trait DropTargetDragEnterEvent extends DropTargetDragEvent {
  
  /** A sequence of supported {@link com.sun.star.datatransfer.DataFlavor} types. */
  var SupportedDataFlavors: SafeArray[DataFlavor] = js.native
}
object DropTargetDragEnterEvent {
  
  @scala.inline
  def apply(
    Context: XDropTargetDragContext,
    DropAction: Double,
    Dummy: Double,
    LocationX: Double,
    LocationY: Double,
    Source: XInterface,
    SourceActions: Double,
    SupportedDataFlavors: SafeArray[DataFlavor]
  ): DropTargetDragEnterEvent = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], Dummy = Dummy.asInstanceOf[js.Any], LocationX = LocationX.asInstanceOf[js.Any], LocationY = LocationY.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceActions = SourceActions.asInstanceOf[js.Any], SupportedDataFlavors = SupportedDataFlavors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetDragEnterEvent]
  }
  
  @scala.inline
  implicit class DropTargetDragEnterEventOps[Self <: DropTargetDragEnterEvent] (val x: Self) extends AnyVal {
    
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
    def setSupportedDataFlavors(value: SafeArray[DataFlavor]): Self = this.set("SupportedDataFlavors", value.asInstanceOf[js.Any])
  }
}
