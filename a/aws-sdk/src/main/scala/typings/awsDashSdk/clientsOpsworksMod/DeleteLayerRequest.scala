package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLayerRequest extends js.Object {
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
}

object DeleteLayerRequest {
  @scala.inline
  def apply(LayerId: String): DeleteLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLayerRequest]
  }
}

