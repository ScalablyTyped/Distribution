package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** encapsulates the details of an XML parse error or warning. */
trait DOMException extends Exception {
  var Code: DOMExceptionType
}

object DOMException {
  @scala.inline
  def apply(Code: DOMExceptionType, Context: XInterface, Message: String): DOMException = {
    val __obj = js.Dynamic.literal(Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[DOMException]
  }
}

