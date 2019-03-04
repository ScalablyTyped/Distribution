package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** encapsulates the details of an XML parse error or warning. */
trait DOMException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  var Code: DOMExceptionType
}

object DOMException {
  @scala.inline
  def apply(
    Code: DOMExceptionType,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): DOMException = {
    val __obj = js.Dynamic.literal(Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[DOMException]
  }
}

