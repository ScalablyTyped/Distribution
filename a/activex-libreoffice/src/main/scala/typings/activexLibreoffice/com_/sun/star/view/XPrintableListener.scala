package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events about print job progress.
  *
  * {@link XPrintableListener} can be registered to {@link XPrintableBroadcaster} . Then, the client object will receive events about print progress.
  * @see XPrintableBroadcaster
  */
trait XPrintableListener
  extends StObject
     with XEventListener {
  
  /**
    * informs the user of the new state in print progress.
    * @param Event contains the {@link XPrintable} having changed state and the new state.
    */
  def stateChanged(Event: PrintableStateEvent): Unit
}
object XPrintableListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    stateChanged: PrintableStateEvent => Unit
  ): XPrintableListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stateChanged = js.Any.fromFunction1(stateChanged))
    __obj.asInstanceOf[XPrintableListener]
  }
  
  extension [Self <: XPrintableListener](x: Self) {
    
    inline def setStateChanged(value: PrintableStateEvent => Unit): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1(value))
  }
}
