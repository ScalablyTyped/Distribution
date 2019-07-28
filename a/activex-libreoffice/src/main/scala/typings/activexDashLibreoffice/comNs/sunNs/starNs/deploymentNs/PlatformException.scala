package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DeploymentException} indicates that the current platform is not supported.
  * @since OOo 3.0
  */
trait PlatformException extends Exception {
  /** The package which does not support the current platform. */
  var `package`: XPackage
}

object PlatformException {
  @scala.inline
  def apply(Context: XInterface, Message: String, `package`: XPackage): PlatformException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[PlatformException]
  }
}

