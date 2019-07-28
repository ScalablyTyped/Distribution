package typings.activexDashLibreoffice.comNs.sunNs.starNs.registryNs

import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the functionality of {@link com.sun.star.registry.XImplementationRegistration} . It can be useful to specify a complete Url to a component but
  * register the components name only (library or jar name).
  * @since OOo 2.4
  */
trait XImplementationRegistration2 extends XImplementationRegistration {
  /**
    * registers a component which provides one or more implementations.
    * @param aImplementationLoader the URL of the implementation loader.
    * @param aLocation specifies the location of the component with the URL.
    * @param aRegisteredLocation the URL with which the component is actually registered.
    * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be installed in the syste
    */
  def registerImplementationWithLocation(
    aImplementationLoader: String,
    aLocation: String,
    aRegisteredLocation: String,
    xReg: XSimpleRegistry
  ): Unit
}

object XImplementationRegistration2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    checkInstantiation: String => SafeArray[String],
    getImplementations: (String, String) => SafeArray[String],
    queryInterface: `type` => js.Any,
    registerImplementation: (String, String, XSimpleRegistry) => Unit,
    registerImplementationWithLocation: (String, String, String, XSimpleRegistry) => Unit,
    release: () => Unit,
    revokeImplementation: (String, XSimpleRegistry) => Boolean
  ): XImplementationRegistration2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInstantiation = js.Any.fromFunction1(checkInstantiation), getImplementations = js.Any.fromFunction2(getImplementations), queryInterface = js.Any.fromFunction1(queryInterface), registerImplementation = js.Any.fromFunction3(registerImplementation), registerImplementationWithLocation = js.Any.fromFunction4(registerImplementationWithLocation), release = js.Any.fromFunction0(release), revokeImplementation = js.Any.fromFunction2(revokeImplementation))
  
    __obj.asInstanceOf[XImplementationRegistration2]
  }
}

