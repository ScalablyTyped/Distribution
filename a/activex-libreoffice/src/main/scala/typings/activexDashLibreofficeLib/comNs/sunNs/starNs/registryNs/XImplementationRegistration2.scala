package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

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
    aImplementationLoader: java.lang.String,
    aLocation: java.lang.String,
    aRegisteredLocation: java.lang.String,
    xReg: XSimpleRegistry
  ): scala.Unit
}

object XImplementationRegistration2 {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    checkInstantiation: java.lang.String => stdLib.SafeArray[java.lang.String],
    getImplementations: (java.lang.String, java.lang.String) => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerImplementation: (java.lang.String, java.lang.String, XSimpleRegistry) => scala.Unit,
    registerImplementationWithLocation: (java.lang.String, java.lang.String, java.lang.String, XSimpleRegistry) => scala.Unit,
    release: () => scala.Unit,
    revokeImplementation: (java.lang.String, XSimpleRegistry) => scala.Boolean
  ): XImplementationRegistration2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInstantiation = js.Any.fromFunction1(checkInstantiation), getImplementations = js.Any.fromFunction2(getImplementations), queryInterface = js.Any.fromFunction1(queryInterface), registerImplementation = js.Any.fromFunction3(registerImplementation), registerImplementationWithLocation = js.Any.fromFunction4(registerImplementationWithLocation), release = js.Any.fromFunction0(release), revokeImplementation = js.Any.fromFunction2(revokeImplementation))
  
    __obj.asInstanceOf[XImplementationRegistration2]
  }
}

