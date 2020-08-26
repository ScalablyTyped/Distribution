package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link PackageRegistryBackend} service is used to bind a specific type of {@link XPackage} which can be registered or revoked.
  *
  * All {@link PackageRegistryBackend} objects are related to a {@link XPackageManager} instance.
  * @since OOo 2.0
  */
@js.native
trait PackageRegistryBackend extends XPackageRegistry {
  /**
    * Creates a persistent registry.
    * @param context context of registry, e.g. user, shared
    * @param cacheDirectory cache directory that the registry has to use
    * @param readOnly reflects whether writing to cache directory is allowed
    */
  def createPersistent(context: String, cacheDirectory: String, readOnly: Boolean): Unit = js.native
  /**
    * Creates a transient registry.
    * @param context context of registry, e.g. user, shared
    */
  def createTransient(context: String): Unit = js.native
}

object PackageRegistryBackend {
  @scala.inline
  def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    bindPackage: (String, String, Boolean, String, XCommandEnvironment) => XPackage,
    createPersistent: (String, String, Boolean) => Unit,
    createTransient: String => Unit,
    getSupportedPackageTypes: () => SafeArray[XPackageTypeInfo],
    packageRemoved: (String, String) => Unit
  ): PackageRegistryBackend = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], bindPackage = js.Any.fromFunction5(bindPackage), createPersistent = js.Any.fromFunction3(createPersistent), createTransient = js.Any.fromFunction1(createTransient), getSupportedPackageTypes = js.Any.fromFunction0(getSupportedPackageTypes), packageRemoved = js.Any.fromFunction2(packageRemoved))
    __obj.asInstanceOf[PackageRegistryBackend]
  }
  @scala.inline
  implicit class PackageRegistryBackendOps[Self <: PackageRegistryBackend] (val x: Self) extends AnyVal {
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
    def setCreatePersistent(value: (String, String, Boolean) => Unit): Self = this.set("createPersistent", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateTransient(value: String => Unit): Self = this.set("createTransient", js.Any.fromFunction1(value))
  }
  
}

