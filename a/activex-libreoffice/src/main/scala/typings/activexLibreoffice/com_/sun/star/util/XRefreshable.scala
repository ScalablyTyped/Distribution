package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be refreshed from a data source. */
trait XRefreshable
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive the event "refreshed." */
  def addRefreshListener(l: XRefreshListener): Unit
  
  /** refreshes the data of the object from the connected data source. */
  def refresh(): Unit
  
  /** removes the specified listener. */
  def removeRefreshListener(l: XRefreshListener): Unit
}
object XRefreshable {
  
  inline def apply(
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit
  ): XRefreshable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
    __obj.asInstanceOf[XRefreshable]
  }
  
  extension [Self <: XRefreshable](x: Self) {
    
    inline def setAddRefreshListener(value: XRefreshListener => Unit): Self = StObject.set(x, "addRefreshListener", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setRemoveRefreshListener(value: XRefreshListener => Unit): Self = StObject.set(x, "removeRefreshListener", js.Any.fromFunction1(value))
  }
}
