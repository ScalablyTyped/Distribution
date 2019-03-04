package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomVoice extends js.Object {
  var default: scala.Boolean
  var lang: java.lang.String
  var localService: scala.Boolean
  var name: java.lang.String
  var voiceURI: java.lang.String
}

object ArtyomVoice {
  @scala.inline
  def apply(
    default: scala.Boolean,
    lang: java.lang.String,
    localService: scala.Boolean,
    name: java.lang.String,
    voiceURI: java.lang.String
  ): ArtyomVoice = {
    val __obj = js.Dynamic.literal(default = default, lang = lang, localService = localService, name = name, voiceURI = voiceURI)
  
    __obj.asInstanceOf[ArtyomVoice]
  }
}

