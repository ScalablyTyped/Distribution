package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A listener interested in changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called whenever changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} occur.
    * @param Event describes the change that has occurred.
    */
  def remoteContentProviderChange(Event: RemoteContentProviderChangeEvent): Unit
}
object XRemoteContentProviderChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remoteContentProviderChange: RemoteContentProviderChangeEvent => Unit
  ): XRemoteContentProviderChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remoteContentProviderChange = js.Any.fromFunction1(remoteContentProviderChange))
    __obj.asInstanceOf[XRemoteContentProviderChangeListener]
  }
  
  extension [Self <: XRemoteContentProviderChangeListener](x: Self) {
    
    inline def setRemoteContentProviderChange(value: RemoteContentProviderChangeEvent => Unit): Self = StObject.set(x, "remoteContentProviderChange", js.Any.fromFunction1(value))
  }
}
