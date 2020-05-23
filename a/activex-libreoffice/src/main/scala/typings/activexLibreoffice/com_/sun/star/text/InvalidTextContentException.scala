package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TextContent = TextContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTextContentException]
  }
}

