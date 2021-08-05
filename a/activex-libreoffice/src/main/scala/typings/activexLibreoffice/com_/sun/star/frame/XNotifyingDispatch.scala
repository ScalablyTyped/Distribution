package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * dispatch with guaranteed notify (instead of {@link XDispatch} )
  * @see XDispatch
  * @see XStatusListener
  */
trait XNotifyingDispatch
  extends StObject
     with XDispatch {
  
  /**
    * Do the same like {@link XDispatch.dispatch()} but notifies listener in every case. Should be used if result must be known.
    * @param URL full parsed URL describes the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} )
    * @param Listener optional listener for guaranteed notifications of this request
    */
  def dispatchWithNotification(URL: URL, Arguments: SeqEquiv[PropertyValue], Listener: XDispatchResultListener): Unit
}
object XNotifyingDispatch {
  
  inline def apply(
    acquire: () => Unit,
    addStatusListener: (XStatusListener, URL) => Unit,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Unit,
    dispatchWithNotification: (URL, SeqEquiv[PropertyValue], XDispatchResultListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStatusListener: (XStatusListener, URL) => Unit
  ): XNotifyingDispatch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStatusListener = js.Any.fromFunction2(addStatusListener), dispatch = js.Any.fromFunction2(dispatch), dispatchWithNotification = js.Any.fromFunction3(dispatchWithNotification), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStatusListener = js.Any.fromFunction2(removeStatusListener))
    __obj.asInstanceOf[XNotifyingDispatch]
  }
  
  extension [Self <: XNotifyingDispatch](x: Self) {
    
    inline def setDispatchWithNotification(value: (URL, SeqEquiv[PropertyValue], XDispatchResultListener) => Unit): Self = StObject.set(x, "dispatchWithNotification", js.Any.fromFunction3(value))
  }
}
