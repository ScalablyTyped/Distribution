package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to disconnect an object from its persistence. */
trait XPersistanceHolder
  extends StObject
     with XInterface {
  
  /**
    * connects the object to a persistence.
    * @param xStream a stream that specify the persistence
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def connectPersistance(xStream: XStream): Unit
  
  /**
    * disconnects the object from the persistence.
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def disconnectPersistence(): Unit
}
object XPersistanceHolder {
  
  inline def apply(
    acquire: () => Unit,
    connectPersistance: XStream => Unit,
    disconnectPersistence: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPersistanceHolder = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectPersistance = js.Any.fromFunction1(connectPersistance), disconnectPersistence = js.Any.fromFunction0(disconnectPersistence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPersistanceHolder]
  }
  
  extension [Self <: XPersistanceHolder](x: Self) {
    
    inline def setConnectPersistance(value: XStream => Unit): Self = StObject.set(x, "connectPersistance", js.Any.fromFunction1(value))
    
    inline def setDisconnectPersistence(value: () => Unit): Self = StObject.set(x, "disconnectPersistence", js.Any.fromFunction0(value))
  }
}
