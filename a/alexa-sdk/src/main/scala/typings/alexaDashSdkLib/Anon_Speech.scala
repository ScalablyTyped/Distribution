package typings
package alexaDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Speech extends js.Object {
  var speech: java.lang.String
  var `type`: java.lang.String
}

object Anon_Speech {
  @scala.inline
  def apply(speech: java.lang.String, `type`: java.lang.String): Anon_Speech = {
    val __obj = js.Dynamic.literal(speech = speech)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Speech]
  }
}

