package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyIds extends js.Object {
  /**
    * A list of all the ApiKey identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.undefined
  /**
    * A list of warning messages.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}

object ApiKeyIds {
  @scala.inline
  def apply(ids: ListOfString = null, warnings: ListOfString = null): ApiKeyIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[ApiKeyIds]
  }
}

