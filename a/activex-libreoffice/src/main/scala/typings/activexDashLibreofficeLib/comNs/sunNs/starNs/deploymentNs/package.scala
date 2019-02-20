package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object deploymentNs {
  /**
    * the {@link ExtensionManager} service.
    *
    * The component context entry is ` /singletons/com.sun.star.deployment.ExtensionManager` .
    * @since OOo 3.3
    */
  type ExtensionManager = XExtensionManager
  /**
    * indicates that a function call with the given arguments is not supported because the extension was removed. {@link XPackage.isRemoved()} will return
    * true on that object.
    * @since OOo 3.3
    */
  type ExtensionRemovedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * Implementations of this service provide the root location of a package for a given Package ID.
    * @since OOo 2.3
    */
  type PackageInformationProvider = XPackageInformationProvider
  /**
    * Implementations of this service provide access to the root element of one or more update information files for a given sets of URLs.
    * @since OOo 2.2
    */
  type UpdateInformationProvider = XUpdateInformationProvider
  /**
    * {@link thePackageManagerFactory} denotes the one and only {@link XPackageManagerFactory} object to be used.
    *
    * The component context entry is ` /singletons/com.sun.star.deployment.thePackageManagerFactory` .
    * @deprecated DeprecatedUse XExtensionManager.
    * @since OOo 2.0
    */
  type thePackageManagerFactory = XPackageManagerFactory
}
