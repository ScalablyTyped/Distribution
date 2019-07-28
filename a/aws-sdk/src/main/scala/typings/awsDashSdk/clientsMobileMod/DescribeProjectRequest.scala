package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProjectRequest extends js.Object {
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId
  /**
    *  If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS CloudFormation stacks in the AWS Mobile Hub project. 
    */
  var syncFromResources: js.UndefOr[Boolean] = js.undefined
}

object DescribeProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId, syncFromResources: js.UndefOr[Boolean] = js.undefined): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId)
    if (!js.isUndefined(syncFromResources)) __obj.updateDynamic("syncFromResources")(syncFromResources)
    __obj.asInstanceOf[DescribeProjectRequest]
  }
}

