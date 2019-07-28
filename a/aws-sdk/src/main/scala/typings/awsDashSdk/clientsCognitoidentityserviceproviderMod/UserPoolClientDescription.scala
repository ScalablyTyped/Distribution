package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolClientDescription extends js.Object {
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The client name from the user pool client description.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.undefined
  /**
    * The user pool ID for the user pool where you want to describe the user pool client.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}

object UserPoolClientDescription {
  @scala.inline
  def apply(
    ClientId: ClientIdType = null,
    ClientName: ClientNameType = null,
    UserPoolId: UserPoolIdType = null
  ): UserPoolClientDescription = {
    val __obj = js.Dynamic.literal()
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (ClientName != null) __obj.updateDynamic("ClientName")(ClientName)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[UserPoolClientDescription]
  }
}

