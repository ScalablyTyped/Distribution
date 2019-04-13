package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetVisibleToAllUsersInput extends js.Object {
  /**
    * Identifiers of the job flows to receive the new visibility setting.
    */
  var JobFlowIds: XmlStringList
  /**
    * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view and manage it.
    */
  var VisibleToAllUsers: Boolean
}

object SetVisibleToAllUsersInput {
  @scala.inline
  def apply(JobFlowIds: XmlStringList, VisibleToAllUsers: Boolean): SetVisibleToAllUsersInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds, VisibleToAllUsers = VisibleToAllUsers)
  
    __obj.asInstanceOf[SetVisibleToAllUsersInput]
  }
}

