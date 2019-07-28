package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostnameSuggestionRequest extends js.Object {
  /**
    * The layer ID.
    */
  var LayerId: String
}

object GetHostnameSuggestionRequest {
  @scala.inline
  def apply(LayerId: String): GetHostnameSuggestionRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId)
  
    __obj.asInstanceOf[GetHostnameSuggestionRequest]
  }
}

