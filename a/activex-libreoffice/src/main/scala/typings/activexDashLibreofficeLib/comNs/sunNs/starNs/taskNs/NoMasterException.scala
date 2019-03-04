package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a master password is needed but not available/correct. */
trait NoMasterException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** specifies the mode in which password should be queried. */
  var Mode: PasswordRequestMode
}

object NoMasterException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Mode: PasswordRequestMode
  ): NoMasterException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Mode = Mode)
  
    __obj.asInstanceOf[NoMasterException]
  }
}

