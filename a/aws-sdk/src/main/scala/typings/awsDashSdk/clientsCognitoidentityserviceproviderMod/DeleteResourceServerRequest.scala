package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourceServerRequest extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: UserPoolIdType
}

object DeleteResourceServerRequest {
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, UserPoolId: UserPoolIdType): DeleteResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DeleteResourceServerRequest]
  }
}

