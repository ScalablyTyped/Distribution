package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  var code: scala.Double
}

object EventException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    code: scala.Double
  ): EventException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, code = code)
  
    __obj.asInstanceOf[EventException]
  }
}

