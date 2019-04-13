package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceServerRequest extends js.Object {
  /**
    * A unique resource server identifier for the resource server. This could be an HTTPS endpoint where the resource server is located. For example, https://my-weather-api.example.com.
    */
  var Identifier: ResourceServerIdentifierType
  /**
    * A friendly name for the resource server.
    */
  var Name: ResourceServerNameType
  /**
    * A list of scopes. Each scope is map, where the keys are name and description.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object CreateResourceServerRequest {
  @scala.inline
  def apply(
    Identifier: ResourceServerIdentifierType,
    Name: ResourceServerNameType,
    UserPoolId: UserPoolIdType,
    Scopes: ResourceServerScopeListType = null
  ): CreateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier, Name = Name, UserPoolId = UserPoolId)
    if (Scopes != null) __obj.updateDynamic("Scopes")(Scopes)
    __obj.asInstanceOf[CreateResourceServerRequest]
  }
}

