package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsDashSdk.clientsQuicksightMod.Namespace
  /**
    * The name of the user that you want to delete.
    */
  var UserName: typings.awsDashSdk.clientsQuicksightMod.UserName
}

object DeleteUserRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace, UserName: UserName): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, Namespace = Namespace, UserName = UserName)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

