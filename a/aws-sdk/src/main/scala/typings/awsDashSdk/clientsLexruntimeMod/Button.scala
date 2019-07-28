package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  /**
    * Text that is visible to the user on the button.
    */
  var text: ButtonTextStringWithLength
  /**
    * The value sent to Amazon Lex when a user chooses the button. For example, consider button text "NYC." When the user chooses the button, the value sent can be "New York City."
    */
  var value: ButtonValueStringWithLength
}

object Button {
  @scala.inline
  def apply(text: ButtonTextStringWithLength, value: ButtonValueStringWithLength): Button = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[Button]
  }
}

