package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  /**
    * The locale of the text message. Currently, en-US is supported.
    */
  var Locale: typings.awsDashSdk.clientsAlexaforbusinessMod.Locale = js.native
  /**
    * The value of the text message.
    */
  var Value: TextValue = js.native
}

object Text {
  @scala.inline
  def apply(Locale: Locale, Value: TextValue): Text = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Text]
  }
}

