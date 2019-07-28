package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoleAliasRequest extends js.Object {
  /**
    * How long (in seconds) the credentials will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
  /**
    * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
    */
  var roleAlias: RoleAlias
  /**
    * The role ARN.
    */
  var roleArn: RoleArn
}

object CreateRoleAliasRequest {
  @scala.inline
  def apply(
    roleAlias: RoleAlias,
    roleArn: RoleArn,
    credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
  ): CreateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias, roleArn = roleArn)
    if (!js.isUndefined(credentialDurationSeconds)) __obj.updateDynamic("credentialDurationSeconds")(credentialDurationSeconds)
    __obj.asInstanceOf[CreateRoleAliasRequest]
  }
}

