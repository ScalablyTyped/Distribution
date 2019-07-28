package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration contains invalid data */
trait InvalidBootstrapFileException extends Exception {
  var BootstrapFileURL: String
}

object InvalidBootstrapFileException {
  @scala.inline
  def apply(BootstrapFileURL: String, Context: XInterface, Message: String): InvalidBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InvalidBootstrapFileException]
  }
}

