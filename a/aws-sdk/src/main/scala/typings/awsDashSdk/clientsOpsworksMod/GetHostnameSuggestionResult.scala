package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostnameSuggestionResult extends js.Object {
  /**
    * The generated host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
}

object GetHostnameSuggestionResult {
  @scala.inline
  def apply(Hostname: String = null, LayerId: String = null): GetHostnameSuggestionResult = {
    val __obj = js.Dynamic.literal()
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname.asInstanceOf[js.Any])
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostnameSuggestionResult]
  }
}

