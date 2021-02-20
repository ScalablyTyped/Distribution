package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information regarding the implementation: which services are implemented and the name of the implementation. */
@js.native
trait XServiceInfo extends XInterface {
  
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  val ImplementationName: String = js.native
  
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  val SupportedServiceNames: SafeArray[String] = js.native
  
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  def getImplementationName(): String = js.native
  
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  def getSupportedServiceNames(): SafeArray[String] = js.native
  
  /**
    * Tests whether the specified service is supported, i.e. implemented by the implementation.
    * @param ServiceName name of service to be tested
    * @returns true, if service is supported, false otherwise
    */
  def supportsService(ServiceName: String): Boolean = js.native
}
object XServiceInfo {
  
  @scala.inline
  def apply(
    ImplementationName: String,
    SupportedServiceNames: SafeArray[String],
    acquire: () => Unit,
    getImplementationName: () => String,
    getSupportedServiceNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsService: String => Boolean
  ): XServiceInfo = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName.asInstanceOf[js.Any], SupportedServiceNames = SupportedServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsService = js.Any.fromFunction1(supportsService))
    __obj.asInstanceOf[XServiceInfo]
  }
  
  @scala.inline
  implicit class XServiceInfoMutableBuilder[Self <: XServiceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetImplementationName(value: () => String): Self = StObject.set(x, "getImplementationName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedServiceNames(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedServiceNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImplementationName(value: String): Self = StObject.set(x, "ImplementationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedServiceNames(value: SafeArray[String]): Self = StObject.set(x, "SupportedServiceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsService(value: String => Boolean): Self = StObject.set(x, "supportsService", js.Any.fromFunction1(value))
  }
}
