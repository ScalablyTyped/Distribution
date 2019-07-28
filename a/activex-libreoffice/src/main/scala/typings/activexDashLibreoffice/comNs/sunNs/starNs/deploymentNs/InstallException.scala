package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the fact that deployment unit is about to be installed.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.2
  */
trait InstallException extends Exception {
  /** the display name of the extension, which is to be installed. */
  var displayName: String
}

object InstallException {
  @scala.inline
  def apply(Context: XInterface, Message: String, displayName: String): InstallException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, displayName = displayName)
  
    __obj.asInstanceOf[InstallException]
  }
}

