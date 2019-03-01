package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the fact that deployment unit is about to be installed.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.2
  */
trait InstallException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** the display name of the extension, which is to be installed. */
  var displayName: java.lang.String
}

object InstallException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    displayName: java.lang.String
  ): InstallException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[InstallException]
  }
}

