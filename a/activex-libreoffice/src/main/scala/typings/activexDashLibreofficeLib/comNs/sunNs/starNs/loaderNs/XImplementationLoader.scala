package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * handles activation (loading) of a UNO component.
  * @see com.sun.star.registry.XImplementationRegistration
  */
trait XImplementationLoader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * activates a concrete implementation within a component.
    * @param implementationName The name of the implementation, which shall be instantiated. The method {@link XImplementationLoader.writeRegistryInfo()} writ
    * @param implementationLoaderUrl specification bug, ignore this parameter, please pass an empty string.
    * @param locationUrl Points to the location of the file containing the component (for instance a .jar-file or a shared library). This parameter should be
    * @param xKey A registry which may be used to read static data previously written via {@link XImplementationLoader.writeRegistryInfo()} . The use of this
    * @returns returns a factory interface, which allows to create an instance of the concrete implementation. In general, the object supports a {@link com.sun.
    */
  def activate(
    implementationName: java.lang.String,
    implementationLoaderUrl: java.lang.String,
    locationUrl: java.lang.String,
    xKey: activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XRegistryKey
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * writes a list of all implementations hosted by this component into a registry key.
    *
    * This method is called during registering a component.
    * @param xKey The registry key, which shall be used to write for each implementation the implementation name plus a list of supported services.
    * @param implementationLoaderUrl specification bug, ignore this parameter, please pass an empty string.
    * @param locationUrl Points to the location of the file containing the component (for instance a .jar-file or a shared library). This parameter should be
    * @see com.sun.star.registry.XImplementationRegistration
    */
  def writeRegistryInfo(
    xKey: activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XRegistryKey,
    implementationLoaderUrl: java.lang.String,
    locationUrl: java.lang.String
  ): scala.Boolean
}

