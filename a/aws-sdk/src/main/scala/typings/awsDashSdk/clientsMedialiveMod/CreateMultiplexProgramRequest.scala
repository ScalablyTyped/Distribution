package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexProgramRequest extends js.Object {
  /**
    * ID of the multiplex where the program is to be created.
    */
  var MultiplexId: __string = js.native
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: typings.awsDashSdk.clientsMedialiveMod.MultiplexProgramSettings = js.native
  /**
    * Name of multiplex program.
    */
  var ProgramName: __string = js.native
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: __string = js.native
}

object CreateMultiplexProgramRequest {
  @scala.inline
  def apply(
    MultiplexId: __string,
    MultiplexProgramSettings: MultiplexProgramSettings,
    ProgramName: __string,
    RequestId: __string
  ): CreateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], MultiplexProgramSettings = MultiplexProgramSettings.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateMultiplexProgramRequest]
  }
}

