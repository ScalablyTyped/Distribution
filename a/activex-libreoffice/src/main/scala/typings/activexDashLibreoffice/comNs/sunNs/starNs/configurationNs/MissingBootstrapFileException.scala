package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration is missing */
trait MissingBootstrapFileException extends Exception {
  var BootstrapFileURL: String
}

object MissingBootstrapFileException {
  @scala.inline
  def apply(BootstrapFileURL: String, Context: XInterface, Message: String): MissingBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL, Context = Context, Message = Message)
  
    __obj.asInstanceOf[MissingBootstrapFileException]
  }
}

