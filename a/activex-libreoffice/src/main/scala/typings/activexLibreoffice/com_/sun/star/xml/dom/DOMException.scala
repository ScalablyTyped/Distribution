package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
}

