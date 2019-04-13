package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsRequest extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Specifies a list of trail ARNs whose tags will be listed. The list has a limit of 20 ARNs. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceIdList: awsDashSdkLib.clientsCloudtrailMod.ResourceIdList
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceIdList: ResourceIdList, NextToken: String = null): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceIdList = ResourceIdList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsRequest]
  }
}

