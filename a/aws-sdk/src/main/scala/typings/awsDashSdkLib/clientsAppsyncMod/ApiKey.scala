package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour.
    */
  var expires: js.UndefOr[Long] = js.undefined
  /**
    * The API key ID.
    */
  var id: js.UndefOr[String] = js.undefined
}

object ApiKey {
  @scala.inline
  def apply(description: String = null, expires: js.UndefOr[Long] = js.undefined, id: String = null): ApiKey = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ApiKey]
  }
}

