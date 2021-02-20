package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XDragSourceContext extends XInterface {
  
  /**
    * Get the identifier of the currently used cursor.
    * @returns The currently selected drag cursor.
    */
  val CurrentCursor: Double = js.native
  
  /**
    * Get the identifier of the currently used cursor.
    * @returns The currently selected drag cursor.
    */
  def getCurrentCursor(): Double = js.native
  
  /**
    * This method sets the current drag cursor.
    *
    * This method should only be called to set another cursor than the default one for drag action currently selected by the user.
    *
    * Invalid cursor identifiers will be ignored.
    * @param cursorId The identifier the drag source returned when registering the cursor.
    */
  def setCursor(cursorId: Double): Unit = js.native
  
  /**
    * This method sets the current drag image.
    * @param imageId The identifier the drag source returned when registering the image (0 = none). Invalid identifier will be ignored.
    */
  def setImage(imageId: Double): Unit = js.native
  
  /**
    * This method notifies the context that the {@link com.sun.star.datatransfer.DataFlavor} types of the transferable object have changed.
    * @see com.sun.star.datatransfer.XTransferable
    */
  def transferablesFlavorsChanged(): Unit = js.native
}
object XDragSourceContext {
  
  @scala.inline
  def apply(
    CurrentCursor: Double,
    acquire: () => Unit,
    getCurrentCursor: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCursor: Double => Unit,
    setImage: Double => Unit,
    transferablesFlavorsChanged: () => Unit
  ): XDragSourceContext = {
    val __obj = js.Dynamic.literal(CurrentCursor = CurrentCursor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentCursor = js.Any.fromFunction0(getCurrentCursor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCursor = js.Any.fromFunction1(setCursor), setImage = js.Any.fromFunction1(setImage), transferablesFlavorsChanged = js.Any.fromFunction0(transferablesFlavorsChanged))
    __obj.asInstanceOf[XDragSourceContext]
  }
  
  @scala.inline
  implicit class XDragSourceContextMutableBuilder[Self <: XDragSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentCursor(value: Double): Self = StObject.set(x, "CurrentCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentCursor(value: () => Double): Self = StObject.set(x, "getCurrentCursor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCursor(value: Double => Unit): Self = StObject.set(x, "setCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImage(value: Double => Unit): Self = StObject.set(x, "setImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransferablesFlavorsChanged(value: () => Unit): Self = StObject.set(x, "transferablesFlavorsChanged", js.Any.fromFunction0(value))
  }
}
