package typings.activexLibreoffice.com_.sun.star.registry

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers a registry for implementation objects and provides information about the registered implementations. */
trait XImplementationRegistration extends XInterface {
  /**
    * @param implementationName specifies the name of the checked implementation.
    * @returns a sequence with names of the missing services to create an instance of this implementation.
    */
  def checkInstantiation(implementationName: String): SafeArray[String]
  /**
    * @param aImplementationLoader specifies the name of the needed loader for this type of implementation. For example, the loader "com.sun.star.loader.Share
    * @param aLocation specifies the location of the component with the URL.
    * @returns the names of the implementations registered by the url location.
    */
  def getImplementations(aImplementationLoader: String, aLocation: String): SafeArray[String]
  /**
    * registers a component which provides one or more implementations.
    * @param aImplementationLoader the URL of the implementation loader.
    * @param aLocation specifies the location of the component with the URL.
    * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be installed in the syste
    */
  def registerImplementation(aImplementationLoader: String, aLocation: String, xReg: XSimpleRegistry): Unit
  /**
    * revokes a component and all their provided implementations from the registry.
    * @param aLocation specifies the location of the component with the URL.
    * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be revoked from the syste
    */
  def revokeImplementation(aLocation: String, xReg: XSimpleRegistry): Boolean
}

object XImplementationRegistration {
  @scala.inline
  def apply(
    acquire: () => Unit,
    checkInstantiation: String => SafeArray[String],
    getImplementations: (String, String) => SafeArray[String],
    queryInterface: `type` => js.Any,
    registerImplementation: (String, String, XSimpleRegistry) => Unit,
    release: () => Unit,
    revokeImplementation: (String, XSimpleRegistry) => Boolean
  ): XImplementationRegistration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInstantiation = js.Any.fromFunction1(checkInstantiation), getImplementations = js.Any.fromFunction2(getImplementations), queryInterface = js.Any.fromFunction1(queryInterface), registerImplementation = js.Any.fromFunction3(registerImplementation), release = js.Any.fromFunction0(release), revokeImplementation = js.Any.fromFunction2(revokeImplementation))
    __obj.asInstanceOf[XImplementationRegistration]
  }
}

