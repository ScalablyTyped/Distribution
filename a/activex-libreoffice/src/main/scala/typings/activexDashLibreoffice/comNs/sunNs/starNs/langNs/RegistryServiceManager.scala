package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.registryNs.XSimpleRegistry
import typings.std.SafeArray
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
  var Registry: XSimpleRegistry = js.native
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  /* InferMemberOverrides */
  override def getAvailableServiceNames(): SafeArray[String] = js.native
}

