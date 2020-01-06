package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMultiplexProgramRequest extends js.Object {
  /**
    * The ID of the multiplex that the program belongs to.
    */
  var MultiplexId: __string = js.native
  /**
    * The multiplex program name.
    */
  var ProgramName: __string = js.native
}

object DeleteMultiplexProgramRequest {
  @scala.inline
  def apply(MultiplexId: __string, ProgramName: __string): DeleteMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMultiplexProgramRequest]
  }
}

