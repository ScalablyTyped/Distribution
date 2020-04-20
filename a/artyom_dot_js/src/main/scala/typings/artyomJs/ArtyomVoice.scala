package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomVoice extends js.Object {
  var default: Boolean
  var lang: String
  var localService: Boolean
  var name: String
  var voiceURI: String
}

object ArtyomVoice {
  @scala.inline
  def apply(default: Boolean, lang: String, localService: Boolean, name: String, voiceURI: String): ArtyomVoice = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], localService = localService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceURI = voiceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomVoice]
  }
}

