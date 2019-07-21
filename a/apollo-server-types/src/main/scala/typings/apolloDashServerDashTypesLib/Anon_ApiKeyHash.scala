package typings
package apolloDashServerDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyHash extends js.Object {
  var apiKeyHash: js.UndefOr[java.lang.String] = js.undefined
  var serviceID: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ApiKeyHash {
  @scala.inline
  def apply(apiKeyHash: java.lang.String = null, serviceID: java.lang.String = null): Anon_ApiKeyHash = {
    val __obj = js.Dynamic.literal()
    if (apiKeyHash != null) __obj.updateDynamic("apiKeyHash")(apiKeyHash)
    if (serviceID != null) __obj.updateDynamic("serviceID")(serviceID)
    __obj.asInstanceOf[Anon_ApiKeyHash]
  }
}

