package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DeploymentException} reflects a deployment error.
  * @since OOo 2.0
  */
trait DeploymentException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** reflects the cause of the error. Commonly an exception. */
  var Cause: js.Any
}

object DeploymentException {
  @scala.inline
  def apply(
    Cause: js.Any,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): DeploymentException = {
    val __obj = js.Dynamic.literal(Cause = Cause, Context = Context, Message = Message)
  
    __obj.asInstanceOf[DeploymentException]
  }
}

