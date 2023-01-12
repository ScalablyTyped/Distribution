package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link PackageRegistryBackend} service is used to bind a specific type of {@link XPackage} which can be registered or revoked.
  *
  * All {@link PackageRegistryBackend} objects are related to a {@link XPackageManager} instance.
  * @since OOo 2.0
  */
trait PackageRegistryBackend
  extends StObject
     with XPackageRegistry {
  
  /**
    * Creates a persistent registry.
    * @param context context of registry, e.g. user, shared
    * @param cacheDirectory cache directory that the registry has to use
    * @param readOnly reflects whether writing to cache directory is allowed
    */
  def createPersistent(context: String, cacheDirectory: String, readOnly: Boolean): Unit
  
  /**
    * Creates a transient registry.
    * @param context context of registry, e.g. user, shared
    */
  def createTransient(context: String): Unit
}
object PackageRegistryBackend {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PackageRegistryBackend] (val x: Self) extends AnyVal {
    
    inline def setCreatePersistent(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "createPersistent", js.Any.fromFunction3(value))
    
    inline def setCreateTransient(value: String => Unit): Self = StObject.set(x, "createTransient", js.Any.fromFunction1(value))
  }
}
