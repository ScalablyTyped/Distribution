package typings.activexLibreoffice.com_.sun.star.loader

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.registry.XRegistryKey
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * handles activation (loading) of a UNO component.
  * @see com.sun.star.registry.XImplementationRegistration
  */
@js.native
trait XImplementationLoader extends XInterface {
  /**
    * activates a concrete implementation within a component.
    * @param implementationName The name of the implementation, which shall be instantiated. The method {@link XImplementationLoader.writeRegistryInfo()} writ
    * @param implementationLoaderUrl specification bug, ignore this parameter, please pass an empty string.
    * @param locationUrl Points to the location of the file containing the component (for instance a .jar-file or a shared library). This parameter should be
    * @param xKey A registry which may be used to read static data previously written via {@link XImplementationLoader.writeRegistryInfo()} . The use of this
    * @returns returns a factory interface, which allows to create an instance of the concrete implementation. In general, the object supports a {@link com.sun.
    */
  def activate(
    implementationName: String,
    implementationLoaderUrl: String,
    locationUrl: String,
    xKey: XRegistryKey
  ): XInterface = js.native
  /**
    * writes a list of all implementations hosted by this component into a registry key.
    *
    * This method is called during registering a component.
    * @param xKey The registry key, which shall be used to write for each implementation the implementation name plus a list of supported services.
    * @param implementationLoaderUrl specification bug, ignore this parameter, please pass an empty string.
    * @param locationUrl Points to the location of the file containing the component (for instance a .jar-file or a shared library). This parameter should be
    * @see com.sun.star.registry.XImplementationRegistration
    */
  def writeRegistryInfo(xKey: XRegistryKey, implementationLoaderUrl: String, locationUrl: String): Boolean = js.native
}

object XImplementationLoader {
  @scala.inline
  def apply(
    acquire: () => Unit,
    activate: (String, String, String, XRegistryKey) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeRegistryInfo: (XRegistryKey, String, String) => Boolean
  ): XImplementationLoader = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction4(activate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeRegistryInfo = js.Any.fromFunction3(writeRegistryInfo))
    __obj.asInstanceOf[XImplementationLoader]
  }
  @scala.inline
  implicit class XImplementationLoaderOps[Self <: XImplementationLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivate(value: (String, String, String, XRegistryKey) => XInterface): Self = this.set("activate", js.Any.fromFunction4(value))
    @scala.inline
    def setWriteRegistryInfo(value: (XRegistryKey, String, String) => Boolean): Self = this.set("writeRegistryInfo", js.Any.fromFunction3(value))
  }
  
}

