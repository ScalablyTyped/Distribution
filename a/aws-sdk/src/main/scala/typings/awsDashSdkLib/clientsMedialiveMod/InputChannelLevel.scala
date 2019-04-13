package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputChannelLevel extends js.Object {
  /**
    * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
    */
  var Gain: __integerMinNegative60Max6
  /**
    * The index of the input channel used as a source.
    */
  var InputChannel: __integerMin0Max15
}

object InputChannelLevel {
  @scala.inline
  def apply(Gain: __integerMinNegative60Max6, InputChannel: __integerMin0Max15): InputChannelLevel = {
    val __obj = js.Dynamic.literal(Gain = Gain, InputChannel = InputChannel)
  
    __obj.asInstanceOf[InputChannelLevel]
  }
}

