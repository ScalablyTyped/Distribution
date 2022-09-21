package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notify about changes to a {@link XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeNotifier
  extends StObject
     with XInterface {
  
  /**
    * Add a listener.
    * @param Listener Some listener.
    */
  def addRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit
  
  /**
    * Remove a listener.
    * @param Listener Some listener previously added via {@link XRemoteContentProviderChangeNotifier.addRemoteContentProviderChangeListener()} .
    */
  def removeRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit
}
object XRemoteContentProviderChangeNotifier {
  
  inline def apply(
    acquire: () => Unit,
    addRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Unit
  ): XRemoteContentProviderChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRemoteContentProviderChangeListener = js.Any.fromFunction1(addRemoteContentProviderChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRemoteContentProviderChangeListener = js.Any.fromFunction1(removeRemoteContentProviderChangeListener))
    __obj.asInstanceOf[XRemoteContentProviderChangeNotifier]
  }
  
  extension [Self <: XRemoteContentProviderChangeNotifier](x: Self) {
    
    inline def setAddRemoteContentProviderChangeListener(value: XRemoteContentProviderChangeListener => Unit): Self = StObject.set(x, "addRemoteContentProviderChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveRemoteContentProviderChangeListener(value: XRemoteContentProviderChangeListener => Unit): Self = StObject.set(x, "removeRemoteContentProviderChangeListener", js.Any.fromFunction1(value))
  }
}
