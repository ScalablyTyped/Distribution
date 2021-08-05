package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** identifies the object with a service name which can be used to create such an object by a factory. */
trait XServiceName
  extends StObject
     with XInterface {
  
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  val ServiceName: String
  
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  def getServiceName(): String
}
object XServiceName {
  
  inline def apply(
    ServiceName: String,
    acquire: () => Unit,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceName = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XServiceName]
  }
  
  extension [Self <: XServiceName](x: Self) {
    
    inline def setGetServiceName(value: () => String): Self = StObject.set(x, "getServiceName", js.Any.fromFunction0(value))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
