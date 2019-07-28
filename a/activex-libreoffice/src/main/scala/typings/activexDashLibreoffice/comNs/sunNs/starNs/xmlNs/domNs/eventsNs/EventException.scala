package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventException extends Exception {
  var code: Double
}

object EventException {
  @scala.inline
  def apply(Context: XInterface, Message: String, code: Double): EventException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, code = code)
  
    __obj.asInstanceOf[EventException]
  }
}

