package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information regarding the implementation: which services are implemented and the name of the implementation. */
trait XServiceInfo extends XInterface {
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
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName, SupportedServiceNames = SupportedServiceNames, acquire = js.Any.fromFunction0(acquire), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsService = js.Any.fromFunction1(supportsService))
  
    __obj.asInstanceOf[XServiceInfo]
  }
}

