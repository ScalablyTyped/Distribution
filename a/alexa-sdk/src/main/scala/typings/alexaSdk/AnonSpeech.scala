package typings.alexaSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpeech extends js.Object {
  var speech: String
  var `type`: String
}

object AnonSpeech {
  @scala.inline
  def apply(speech: String, `type`: String): AnonSpeech = {
    val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpeech]
  }
}

