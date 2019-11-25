package typings.alexaDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Speech extends js.Object {
  var speech: String
  var `type`: String
}

object Anon_Speech {
  @scala.inline
  def apply(speech: String, `type`: String): Anon_Speech = {
    val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Speech]
  }
}

