package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration is missing */
trait MissingBootstrapFileException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  var BootstrapFileURL: java.lang.String
}

object MissingBootstrapFileException {
  @scala.inline
  def apply(
    BootstrapFileURL: java.lang.String,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): MissingBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL, Context = Context, Message = Message)
  
    __obj.asInstanceOf[MissingBootstrapFileException]
  }
}

