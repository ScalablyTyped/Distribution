package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service connects the Java-like UNO drag and drop protocol to the protocol used on window platforms. It realized the drag source.
  * @see XDragSource
  */
trait OleDragSource
  extends StObject
     with XDragSource
     with XInitialization
     with XComponent
object OleDragSource {
  
  inline def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getDefaultCursor: Double => Double,
    initialize: SeqEquiv[Any] => Unit,
    isDragImageSupported: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Unit
  ): OleDragSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), initialize = js.Any.fromFunction1(initialize), isDragImageSupported = js.Any.fromFunction0(isDragImageSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), startDrag = js.Any.fromFunction6(startDrag))
    __obj.asInstanceOf[OleDragSource]
  }
}
