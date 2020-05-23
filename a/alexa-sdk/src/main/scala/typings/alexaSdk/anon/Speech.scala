package typings.alexaSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Speech extends js.Object {
  var speech: String
  var `type`: String
}

object Speech {
  @scala.inline
  def apply(speech: String, `type`: String): Speech = {
    val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Speech]
  }
}

