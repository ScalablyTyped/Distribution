package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLayerRequest extends js.Object {
  /**
    * The layer ID.
    */
  var LayerId: String
}

object DeleteLayerRequest {
  @scala.inline
  def apply(LayerId: String): DeleteLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId)
  
    __obj.asInstanceOf[DeleteLayerRequest]
  }
}

