package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostnameSuggestionResult extends js.Object {
  /**
    * The generated host name.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.undefined
}

object GetHostnameSuggestionResult {
  @scala.inline
  def apply(Hostname: String = null, LayerId: String = null): GetHostnameSuggestionResult = {
    val __obj = js.Dynamic.literal()
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname)
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId)
    __obj.asInstanceOf[GetHostnameSuggestionResult]
  }
}

