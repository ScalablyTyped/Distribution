package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive **refreshed** events. */
trait XRefreshListener
  extends StObject
     with XEventListener {
  
  /** is called when the object data is refreshed. */
  def refreshed(rEvent: EventObject): Unit
}
object XRefreshListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    refreshed: EventObject => Unit,
    release: () => Unit
  ): XRefreshListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), refreshed = js.Any.fromFunction1(refreshed), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRefreshListener]
  }
  
  extension [Self <: XRefreshListener](x: Self) {
    
    inline def setRefreshed(value: EventObject => Unit): Self = StObject.set(x, "refreshed", js.Any.fromFunction1(value))
  }
}
