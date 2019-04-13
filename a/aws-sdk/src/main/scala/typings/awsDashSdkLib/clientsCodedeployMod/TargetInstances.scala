package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstances extends js.Object {
  /**
    * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined
  /**
    * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call as tagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined
  /**
    * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a blue/green deployment. Cannot be used in the same call as ec2TagSet.
    */
  var tagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
}

object TargetInstances {
  @scala.inline
  def apply(
    autoScalingGroups: AutoScalingGroupNameList = null,
    ec2TagSet: EC2TagSet = null,
    tagFilters: EC2TagFilterList = null
  ): TargetInstances = {
    val __obj = js.Dynamic.literal()
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups)
    if (ec2TagSet != null) __obj.updateDynamic("ec2TagSet")(ec2TagSet)
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters)
    __obj.asInstanceOf[TargetInstances]
  }
}

