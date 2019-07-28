package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statement extends js.Object {
  /**
    * A collection of message objects.
    */
  var messages: MessageList
  /**
    *  At runtime, if the client is using the PostText API, Amazon Lex includes the response card in the response. It substitutes all of the session attributes and slot values for placeholders in the response card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.undefined
}

object Statement {
  @scala.inline
  def apply(messages: MessageList, responseCard: ResponseCard = null): Statement = {
    val __obj = js.Dynamic.literal(messages = messages)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[Statement]
  }
}

