package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMultiplexRequest extends js.Object {
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: __string = js.native
}

object DeleteMultiplexRequest {
  @scala.inline
  def apply(MultiplexId: __string): DeleteMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMultiplexRequest]
  }
}

