package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  /**
    * The locale of the audio message. Currently, en-US is supported.
    */
  var Locale: typings.awsDashSdk.clientsAlexaforbusinessMod.Locale
  /**
    * The location of the audio file. Currently, S3 URLs are supported. Only S3 locations comprised of safe characters are valid. For more information, see Safe Characters.
    */
  var Location: AudioLocation
}

object Audio {
  @scala.inline
  def apply(Locale: Locale, Location: AudioLocation): Audio = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Location = Location)
  
    __obj.asInstanceOf[Audio]
  }
}

