package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DeploymentException} reflects a deployment error.
  * @since OOo 2.0
  */
trait DeploymentException extends Exception {
  /** reflects the cause of the error. Commonly an exception. */
  var Cause: js.Any
}

object DeploymentException {
  @scala.inline
  def apply(Cause: js.Any, Context: XInterface, Message: String): DeploymentException = {
    val __obj = js.Dynamic.literal(Cause = Cause, Context = Context, Message = Message)
  
    __obj.asInstanceOf[DeploymentException]
  }
}

