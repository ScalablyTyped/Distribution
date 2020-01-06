package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The text of the message.
    */
  var content: ContentString = js.native
  /**
    * The content type of the message string.
    */
  var contentType: ContentType = js.native
  /**
    * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[GroupNumber] = js.native
}

object Message {
  @scala.inline
  def apply(content: ContentString, contentType: ContentType, groupNumber: Int | Double = null): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    if (groupNumber != null) __obj.updateDynamic("groupNumber")(groupNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

