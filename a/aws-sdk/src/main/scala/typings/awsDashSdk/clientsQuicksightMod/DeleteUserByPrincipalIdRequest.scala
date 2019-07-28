package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserByPrincipalIdRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsDashSdk.clientsQuicksightMod.Namespace
  /**
    * The principal ID of the user.
    */
  var PrincipalId: String
}

object DeleteUserByPrincipalIdRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace, PrincipalId: String): DeleteUserByPrincipalIdRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, Namespace = Namespace, PrincipalId = PrincipalId)
  
    __obj.asInstanceOf[DeleteUserByPrincipalIdRequest]
  }
}

