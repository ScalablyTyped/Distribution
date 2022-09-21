package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Blocker Monitor.
  *
  * This interface is used to manipulate a blocker.
  */
trait XBlockerMonitor
  extends StObject
     with XInterface {
  
  /**
    * Configures the blocker's id.
    * @param id the keeper id of the blocker
    */
  def setBlockerId(id: Double): Unit
}
object XBlockerMonitor {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setBlockerId: Double => Unit
  ): XBlockerMonitor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBlockerId = js.Any.fromFunction1(setBlockerId))
    __obj.asInstanceOf[XBlockerMonitor]
  }
  
  extension [Self <: XBlockerMonitor](x: Self) {
    
    inline def setSetBlockerId(value: Double => Unit): Self = StObject.set(x, "setBlockerId", js.Any.fromFunction1(value))
  }
}
