package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEventAttacher2
  extends StObject
     with XEventAttacher {
  
  /**
    * Register a multiple set of listeners listening for the same target. Besides passing multiple listeners, the behavior of this method is identical to
    * that of {@link attachSingleEventListener()} .
    * @see com.sun.star.script.XEventAttacher.attachSingleEventListener
    */
  def attachMultipleEventListeners(xTarget: XInterface, aListeners: SeqEquiv[EventListener]): SafeArray[XEventListener]
}
object XEventAttacher2 {
  
  inline def apply(
    acquire: () => Unit,
    attachListener: (XInterface, XAllListener, Any, String, String) => XEventListener,
    attachMultipleEventListeners: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener],
    attachSingleEventListener: (XInterface, XAllListener, Any, String, String, String) => XEventListener,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeListener: (XInterface, String, String, XEventListener) => Unit
  ): XEventAttacher2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachListener = js.Any.fromFunction5(attachListener), attachMultipleEventListeners = js.Any.fromFunction2(attachMultipleEventListeners), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction4(removeListener))
    __obj.asInstanceOf[XEventAttacher2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XEventAttacher2] (val x: Self) extends AnyVal {
    
    inline def setAttachMultipleEventListeners(value: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener]): Self = StObject.set(x, "attachMultipleEventListeners", js.Any.fromFunction2(value))
  }
}
