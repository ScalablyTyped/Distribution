package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyIds extends js.Object {
  /**
    * A list of all the ApiKey identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.native
  /**
    * A list of warning messages.
    */
  var warnings: js.UndefOr[ListOfString] = js.native
}

object ApiKeyIds {
  @scala.inline
  def apply(ids: ListOfString = null, warnings: ListOfString = null): ApiKeyIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyIds]
  }
}

