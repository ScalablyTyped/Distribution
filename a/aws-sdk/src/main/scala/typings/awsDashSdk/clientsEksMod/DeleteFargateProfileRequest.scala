package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFargateProfileRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
    */
  var clusterName: String = js.native
  /**
    * The name of the Fargate profile to delete.
    */
  var fargateProfileName: String = js.native
}

object DeleteFargateProfileRequest {
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String): DeleteFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFargateProfileRequest]
  }
}

