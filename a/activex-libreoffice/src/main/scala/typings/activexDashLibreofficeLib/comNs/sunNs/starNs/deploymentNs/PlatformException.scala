package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DeploymentException} indicates that the current platform is not supported.
  * @since OOo 3.0
  */
trait PlatformException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The package which does not support the current platform. */
  var `package`: XPackage
}

