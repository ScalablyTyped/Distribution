package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTypeResponse extends js.Object {
  /**
    * The Type object.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}

object GetTypeResponse {
  @scala.inline
  def apply(`type`: Type = null): GetTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetTypeResponse]
  }
}

