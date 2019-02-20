package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a collection of implementations for services reading from a persistent registry storage.
  *
  * For usage of the service manager have a look at service description of {@link ServiceManager} .
  * @see ServiceManager
  */
@js.native
trait RegistryServiceManager
  extends ServiceManager
     with XInitialization {
  /** Specifies the current registry to be read from. */
  var Registry: activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XSimpleRegistry = js.native
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  /* InferMemberOverrides */
  override def getAvailableServiceNames(): activexDashInteropLib.SafeArray[java.lang.String] = js.native
}

