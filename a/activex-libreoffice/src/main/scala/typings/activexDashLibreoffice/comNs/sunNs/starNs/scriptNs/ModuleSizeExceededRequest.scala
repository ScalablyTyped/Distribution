package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Is used for interaction handle in case password protected modules exceed the size that can be stored in OpenOffice 2.x, 1.x formats */
trait ModuleSizeExceededRequest extends Exception {
  /** The name of the modules that exceed size that can be stored */
  var Names: SafeArray[String]
}

object ModuleSizeExceededRequest {
  @scala.inline
  def apply(Context: XInterface, Message: String, Names: SafeArray[String]): ModuleSizeExceededRequest = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Names = Names)
  
    __obj.asInstanceOf[ModuleSizeExceededRequest]
  }
}

