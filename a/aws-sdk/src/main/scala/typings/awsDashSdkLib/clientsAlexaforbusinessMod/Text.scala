package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  /**
    * The locale of the text message. Currently, en-US is supported.
    */
  var Locale: awsDashSdkLib.clientsAlexaforbusinessMod.Locale
  /**
    * The value of the text message.
    */
  var Value: TextValue
}

object Text {
  @scala.inline
  def apply(Locale: Locale, Value: TextValue): Text = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[Text]
  }
}

