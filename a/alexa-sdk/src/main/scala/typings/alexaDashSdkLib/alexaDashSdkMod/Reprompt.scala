package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reprompt extends js.Object {
  var outputSpeech: OutputSpeech
}

object Reprompt {
  @scala.inline
  def apply(outputSpeech: OutputSpeech): Reprompt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("outputSpeech")(outputSpeech)
    __obj.asInstanceOf[Reprompt]
  }
}

