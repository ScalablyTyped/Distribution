package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your instances.
    */
  var instances: js.UndefOr[InstanceList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get instances request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetInstancesResult {
  @scala.inline
  def apply(instances: InstanceList = null, nextPageToken: String = null): GetInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetInstancesResult]
  }
}

