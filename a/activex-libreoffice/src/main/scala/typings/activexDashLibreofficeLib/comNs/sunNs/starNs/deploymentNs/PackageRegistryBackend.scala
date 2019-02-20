package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link PackageRegistryBackend} service is used to bind a specific type of {@link XPackage} which can be registered or revoked.
  *
  * All {@link PackageRegistryBackend} objects are related to a {@link XPackageManager} instance.
  * @since OOo 2.0
  */
trait PackageRegistryBackend extends XPackageRegistry {
  /**
    * Creates a persistent registry.
    * @param context context of registry, e.g. user, shared
    * @param cacheDirectory cache directory that the registry has to use
    * @param readOnly reflects whether writing to cache directory is allowed
    */
  def createPersistent(context: java.lang.String, cacheDirectory: java.lang.String, readOnly: scala.Boolean): scala.Unit
  /**
    * Creates a transient registry.
    * @param context context of registry, e.g. user, shared
    */
  def createTransient(context: java.lang.String): scala.Unit
}

