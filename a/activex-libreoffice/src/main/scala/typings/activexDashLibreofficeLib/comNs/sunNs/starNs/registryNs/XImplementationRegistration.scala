package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers a registry for implementation objects and provides information about the registered implementations. */
trait XImplementationRegistration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param implementationName specifies the name of the checked implementation.
    * @returns a sequence with names of the missing services to create an instance of this implementation.
    */
  def checkInstantiation(implementationName: java.lang.String): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * @param aImplementationLoader specifies the name of the needed loader for this type of implementation. For example, the loader "com.sun.star.loader.Share
    * @param aLocation specifies the location of the component with the URL.
    * @returns the names of the implementations registered by the url location.
    */
  def getImplementations(aImplementationLoader: java.lang.String, aLocation: java.lang.String): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * registers a component which provides one or more implementations.
    * @param aImplementationLoader the URL of the implementation loader.
    * @param aLocation specifies the location of the component with the URL.
    * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be installed in the syste
    */
  def registerImplementation(aImplementationLoader: java.lang.String, aLocation: java.lang.String, xReg: XSimpleRegistry): scala.Unit
  /**
    * revokes a component and all their provided implementations from the registry.
    * @param aLocation specifies the location of the component with the URL.
    * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be revoked from the syste
    */
  def revokeImplementation(aLocation: java.lang.String, xReg: XSimpleRegistry): scala.Boolean
}

object XImplementationRegistration {
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
    release: js.Function0[scala.Unit],
    revokeImplementation: js.Function2[java.lang.String, XSimpleRegistry, scala.Boolean]
  ): XImplementationRegistration = {
    val __obj = js.Dynamic.literal(acquire = acquire, checkInstantiation = checkInstantiation, getImplementations = getImplementations, queryInterface = queryInterface, registerImplementation = registerImplementation, release = release, revokeImplementation = revokeImplementation)
  
    __obj.asInstanceOf[XImplementationRegistration]
  }
}

