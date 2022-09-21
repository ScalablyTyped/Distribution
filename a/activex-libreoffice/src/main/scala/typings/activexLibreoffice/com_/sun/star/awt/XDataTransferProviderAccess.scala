package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard.XClipboard
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragGestureRecognizer
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragSource
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDropTarget
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface extends the {@link XToolkit} interface with clipboard and drag-and-drop support. */
trait XDataTransferProviderAccess
  extends StObject
     with XInterface {
  
  /**
    * returns the specified clipboard.
    * @param clipboardName the name of the clipboard to return. If an empty string is passed in, the default clipboard is returned.
    * @returns the specified clipboard (if available).
    */
  def getClipboard(clipboardName: String): XClipboard
  
  /**
    * returns the drag gesture recognizer of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drag gesture recognizer.
    */
  def getDragGestureRecognizer(window: XWindow): XDragGestureRecognizer
  
  /**
    * returns the drag source of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drag source.
    */
  def getDragSource(window: XWindow): XDragSource
  
  /**
    * returns the drop target of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drop target.
    */
  def getDropTarget(window: XWindow): XDropTarget
}
object XDataTransferProviderAccess {
  
  inline def apply(
    acquire: () => Unit,
    getClipboard: String => XClipboard,
    getDragGestureRecognizer: XWindow => XDragGestureRecognizer,
    getDragSource: XWindow => XDragSource,
    getDropTarget: XWindow => XDropTarget,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDataTransferProviderAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getClipboard = js.Any.fromFunction1(getClipboard), getDragGestureRecognizer = js.Any.fromFunction1(getDragGestureRecognizer), getDragSource = js.Any.fromFunction1(getDragSource), getDropTarget = js.Any.fromFunction1(getDropTarget), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataTransferProviderAccess]
  }
  
  extension [Self <: XDataTransferProviderAccess](x: Self) {
    
    inline def setGetClipboard(value: String => XClipboard): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
    
    inline def setGetDragGestureRecognizer(value: XWindow => XDragGestureRecognizer): Self = StObject.set(x, "getDragGestureRecognizer", js.Any.fromFunction1(value))
    
    inline def setGetDragSource(value: XWindow => XDragSource): Self = StObject.set(x, "getDragSource", js.Any.fromFunction1(value))
    
    inline def setGetDropTarget(value: XWindow => XDropTarget): Self = StObject.set(x, "getDropTarget", js.Any.fromFunction1(value))
  }
}
