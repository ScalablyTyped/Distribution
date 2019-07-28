package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * The text of the message.
    */
  var content: ContentString
  /**
    * The content type of the message string.
    */
  var contentType: ContentType
  /**
    * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[GroupNumber] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    content: ContentString,
    contentType: ContentType,
    groupNumber: js.UndefOr[GroupNumber] = js.undefined
  ): Message = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(groupNumber)) __obj.updateDynamic("groupNumber")(groupNumber)
    __obj.asInstanceOf[Message]
  }
}

