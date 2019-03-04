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
    acquire: js.Function0[scala.Unit],
    checkInstantiation: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[java.lang.String]],
    getImplementations: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerImplementation: js.Function3[java.lang.String, java.lang.String, XSimpleRegistry, scala.Unit],
    registerImplementationWithLocation: js.Function4[java.lang.String, java.lang.String, java.lang.String, XSimpleRegistry, scala.Unit],
    release: js.Function0[scala.Unit],
    revokeImplementation: js.Function2[java.lang.String, XSimpleRegistry, scala.Boolean]
  ): XImplementationRegistration2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, checkInstantiation = checkInstantiation, getImplementations = getImplementations, queryInterface = queryInterface, registerImplementation = registerImplementation, registerImplementationWithLocation = registerImplementationWithLocation, release = release, revokeImplementation = revokeImplementation)
  
    __obj.asInstanceOf[XImplementationRegistration2]
  }
}

