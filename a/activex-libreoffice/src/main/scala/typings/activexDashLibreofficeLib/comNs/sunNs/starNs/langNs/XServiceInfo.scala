package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information regarding the implementation: which services are implemented and the name of the implementation. */
trait XServiceInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  val ImplementationName: java.lang.String
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  val SupportedServiceNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  def getImplementationName(): java.lang.String
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  def getSupportedServiceNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Tests whether the specified service is supported, i.e. implemented by the implementation.
    * @param ServiceName name of service to be tested
    * @returns true, if service is supported, false otherwise
    */
  def supportsService(ServiceName: java.lang.String): scala.Boolean
}

