package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get instances request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetInstancesRequest {
  @scala.inline
  def apply(pageToken: java.lang.String = null): GetInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetInstancesRequest]
  }
}

