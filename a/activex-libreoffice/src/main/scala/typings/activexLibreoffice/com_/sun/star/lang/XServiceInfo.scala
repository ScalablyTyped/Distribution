package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information regarding the implementation: which services are implemented and the name of the implementation. */
trait XServiceInfo
  extends StObject
     with XInterface {
  
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  val ImplementationName: String
  
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  val SupportedServiceNames: SafeArray[String]
  
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  def getImplementationName(): String
  
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  def getSupportedServiceNames(): SafeArray[String]
  
  /**
    * Tests whether the specified service is supported, i.e. implemented by the implementation.
    * @param ServiceName name of service to be tested
    * @returns true, if service is supported, false otherwise
    */
  def supportsService(ServiceName: String): Boolean
}
object XServiceInfo {
  
  inline def apply(
    ImplementationName: String,
    SupportedServiceNames: SafeArray[String],
    acquire: () => Unit,
    getImplementationName: () => String,
    getSupportedServiceNames: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit,
    supportsService: String => Boolean
  ): XServiceInfo = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName.asInstanceOf[js.Any], SupportedServiceNames = SupportedServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsService = js.Any.fromFunction1(supportsService))
    __obj.asInstanceOf[XServiceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XServiceInfo] (val x: Self) extends AnyVal {
    
    inline def setGetImplementationName(value: () => String): Self = StObject.set(x, "getImplementationName", js.Any.fromFunction0(value))
    
    inline def setGetSupportedServiceNames(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedServiceNames", js.Any.fromFunction0(value))
    
    inline def setImplementationName(value: String): Self = StObject.set(x, "ImplementationName", value.asInstanceOf[js.Any])
    
    inline def setSupportedServiceNames(value: SafeArray[String]): Self = StObject.set(x, "SupportedServiceNames", value.asInstanceOf[js.Any])
    
    inline def setSupportsService(value: String => Boolean): Self = StObject.set(x, "supportsService", js.Any.fromFunction1(value))
  }
}
