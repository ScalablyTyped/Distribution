package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioChannelMapping extends js.Object {
  /**
    * Indices and gain values for each input channel that should be remixed into this output channel.
    */
  var InputChannelLevels: __listOfInputChannelLevel
  /**
    * The index of the output channel being produced.
    */
  var OutputChannel: __integerMin0Max7
}

object AudioChannelMapping {
  @scala.inline
  def apply(InputChannelLevels: __listOfInputChannelLevel, OutputChannel: __integerMin0Max7): AudioChannelMapping = {
    val __obj = js.Dynamic.literal(InputChannelLevels = InputChannelLevels, OutputChannel = OutputChannel)
  
    __obj.asInstanceOf[AudioChannelMapping]
  }
}

