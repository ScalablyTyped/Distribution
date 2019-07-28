package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown whenever a method gets a {@link TextContent} as an actual argument when the text content cannot be used for that operation. */
trait InvalidTextContentException extends Exception {
  /** contains the interface of the text content that caused the exception. */
  var TextContent: XTextContent
}

object InvalidTextContentException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TextContent: XTextContent): InvalidTextContentException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, TextContent = TextContent)
  
    __obj.asInstanceOf[InvalidTextContentException]
  }
}

