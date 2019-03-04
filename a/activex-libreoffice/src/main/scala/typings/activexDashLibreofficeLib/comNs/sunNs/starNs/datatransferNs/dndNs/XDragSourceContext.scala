package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The drag source context class is responsible for managing the initiator side of the Drag and Drop protocol.
  *
  * In particular, it is responsible for managing event notifications to the DragSourceListener and providing the Transferable state to enable the data
  * transfer.
  *
  * An instance of this class is created as a result of the method {@link XDragSource.startDrag()} being successfully invoked. This instance is
  * responsible for tracking the state of the operation on behalf of the drag source and dispatching state changes to the drag source listener.
  * @see com.sun.star.datatransfer.dnd.XDragSourceContext
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
trait XDragSourceContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get the identifier of the currently used cursor.
    * @returns The currently selected drag cursor.
    */
  val CurrentCursor: scala.Double
  /**
    * Get the identifier of the currently used cursor.
    * @returns The currently selected drag cursor.
    */
  def getCurrentCursor(): scala.Double
  /**
    * This method sets the current drag cursor.
    *
    * This method should only be called to set another cursor than the default one for drag action currently selected by the user.
    *
    * Invalid cursor identifiers will be ignored.
    * @param cursorId The identifier the drag source returned when registering the cursor.
    */
  def setCursor(cursorId: scala.Double): scala.Unit
  /**
    * This method sets the current drag image.
    * @param imageId The identifier the drag source returned when registering the image (0 = none). Invalid identifier will be ignored.
    */
  def setImage(imageId: scala.Double): scala.Unit
  /**
    * This method notifies the context that the {@link com.sun.star.datatransfer.DataFlavor} types of the transferable object have changed.
    * @see com.sun.star.datatransfer.XTransferable
    */
  def transferablesFlavorsChanged(): scala.Unit
}

object XDragSourceContext {
  @scala.inline
  def apply(
    CurrentCursor: scala.Double,
    acquire: js.Function0[scala.Unit],
    getCurrentCursor: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCursor: js.Function1[scala.Double, scala.Unit],
    setImage: js.Function1[scala.Double, scala.Unit],
    transferablesFlavorsChanged: js.Function0[scala.Unit]
  ): XDragSourceContext = {
    val __obj = js.Dynamic.literal(CurrentCursor = CurrentCursor, acquire = acquire, getCurrentCursor = getCurrentCursor, queryInterface = queryInterface, release = release, setCursor = setCursor, setImage = setImage, transferablesFlavorsChanged = transferablesFlavorsChanged)
  
    __obj.asInstanceOf[XDragSourceContext]
  }
}

