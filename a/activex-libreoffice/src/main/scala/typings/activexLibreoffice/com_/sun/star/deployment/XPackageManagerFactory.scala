package typings.activexLibreoffice.com_.sun.star.deployment

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
@js.native
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
  def getPackageManager(context: String): XPackageManager = js.native
}

object XPackageManagerFactory {
  @scala.inline
  def apply(getPackageManager: String => XPackageManager): XPackageManagerFactory = {
    val __obj = js.Dynamic.literal(getPackageManager = js.Any.fromFunction1(getPackageManager))
    __obj.asInstanceOf[XPackageManagerFactory]
  }
  @scala.inline
  implicit class XPackageManagerFactoryOps[Self <: XPackageManagerFactory] (val x: Self) extends AnyVal {
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
    def setGetPackageManager(value: String => XPackageManager): Self = this.set("getPackageManager", js.Any.fromFunction1(value))
  }
  
}

