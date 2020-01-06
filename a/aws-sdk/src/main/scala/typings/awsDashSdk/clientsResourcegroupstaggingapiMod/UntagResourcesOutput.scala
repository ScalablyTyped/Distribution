package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourcesOutput extends js.Object {
  /**
    * Details of resources that could not be untagged. An error code, status code, and error message are returned for each failed item. 
    */
  var FailedResourcesMap: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.FailedResourcesMap] = js.native
}

object UntagResourcesOutput {
  @scala.inline
  def apply(FailedResourcesMap: FailedResourcesMap = null): UntagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (FailedResourcesMap != null) __obj.updateDynamic("FailedResourcesMap")(FailedResourcesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourcesOutput]
  }
}

