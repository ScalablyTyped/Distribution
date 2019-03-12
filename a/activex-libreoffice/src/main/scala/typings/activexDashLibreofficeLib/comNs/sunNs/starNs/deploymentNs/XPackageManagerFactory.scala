package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XPackageManagerFactory} interface is used to obtain {@link XPackageManager} instances.
  *
  * You have to use the singleton ` /singletons/com.sun.star.deployment.thePackageManagerFactory` exclusively.
  * @deprecated DeprecatedUse XExtensionManager.
  * @since OOo 2.0
  */
trait XPackageManagerFactory extends js.Object {
  /**
    * Method to create (or reusing and already existing) {@link XPackageManager} object to add or remove UNO packages persistently.
    *
    * Packages for context strings `"user"` and `"shared"` will be registered and revoked persistently.
    *
    * Context strings other than `"user"` , `"shared"` will last in an {@link com.sun.star.lang.IllegalArgumentException} .
    * @param context context string, e.g. `"user"` => persistent storage and registration into installation's user layer`"shared"` => persistent storage and r
    * @returns {@link XPackageManager} object
    * @throws com::sun::star::lang::IllegalArgumentException in case of an invalid context
    */
  def getPackageManager(context: java.lang.String): XPackageManager
}

object XPackageManagerFactory {
  @scala.inline
  def apply(getPackageManager: java.lang.String => XPackageManager): XPackageManagerFactory = {
    val __obj = js.Dynamic.literal(getPackageManager = js.Any.fromFunction1(getPackageManager))
  
    __obj.asInstanceOf[XPackageManagerFactory]
  }
}

