package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioChannelMapping extends js.Object {
  /**
    * Indices and gain values for each input channel that should be remixed into this output channel.
    */
  var InputChannelLevels: __listOfInputChannelLevel = js.native
  /**
    * The index of the output channel being produced.
    */
  var OutputChannel: __integerMin0Max7 = js.native
}

object AudioChannelMapping {
  @scala.inline
  def apply(InputChannelLevels: __listOfInputChannelLevel, OutputChannel: __integerMin0Max7): AudioChannelMapping = {
    val __obj = js.Dynamic.literal(InputChannelLevels = InputChannelLevels.asInstanceOf[js.Any], OutputChannel = OutputChannel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioChannelMapping]
  }
}

