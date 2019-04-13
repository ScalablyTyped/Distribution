package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerType extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined
  /**
    * The name of the resource server.
    */
  var Name: js.UndefOr[ResourceServerNameType] = js.undefined
  /**
    * A list of scopes that are defined for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}

object ResourceServerType {
  @scala.inline
  def apply(
    Identifier: ResourceServerIdentifierType = null,
    Name: ResourceServerNameType = null,
    Scopes: ResourceServerScopeListType = null,
    UserPoolId: UserPoolIdType = null
  ): ResourceServerType = {
    val __obj = js.Dynamic.literal()
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Scopes != null) __obj.updateDynamic("Scopes")(Scopes)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[ResourceServerType]
  }
}

