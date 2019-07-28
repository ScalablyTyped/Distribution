package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationsForResourceRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get operations for resource request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the resource for which you are requesting information.
    */
  var resourceName: ResourceName
}

object GetOperationsForResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, pageToken: String = null): GetOperationsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetOperationsForResourceRequest]
  }
}

