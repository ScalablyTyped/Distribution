package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStaticIpsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get static IPs request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetStaticIpsRequest {
  @scala.inline
  def apply(pageToken: java.lang.String = null): GetStaticIpsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetStaticIpsRequest]
  }
}

