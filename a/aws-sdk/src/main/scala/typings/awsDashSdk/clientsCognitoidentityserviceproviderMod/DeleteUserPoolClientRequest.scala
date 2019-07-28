package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserPoolClientRequest extends js.Object {
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * The user pool ID for the user pool where you want to delete the client.
    */
  var UserPoolId: UserPoolIdType
}

object DeleteUserPoolClientRequest {
  @scala.inline
  def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): DeleteUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DeleteUserPoolClientRequest]
  }
}

