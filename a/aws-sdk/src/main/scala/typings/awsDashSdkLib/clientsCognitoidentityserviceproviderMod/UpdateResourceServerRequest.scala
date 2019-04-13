package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResourceServerRequest extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType
  /**
    * The name of the resource server.
    */
  var Name: ResourceServerNameType
  /**
    * The scope values to be set for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object UpdateResourceServerRequest {
  @scala.inline
  def apply(
    Identifier: ResourceServerIdentifierType,
    Name: ResourceServerNameType,
    UserPoolId: UserPoolIdType,
    Scopes: ResourceServerScopeListType = null
  ): UpdateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier, Name = Name, UserPoolId = UserPoolId)
    if (Scopes != null) __obj.updateDynamic("Scopes")(Scopes)
    __obj.asInstanceOf[UpdateResourceServerRequest]
  }
}

