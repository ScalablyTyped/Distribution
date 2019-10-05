package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoleAliasRequest extends js.Object {
  /**
    * The number of seconds the credential will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
  /**
    * The role alias to update.
    */
  var roleAlias: RoleAlias
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object UpdateRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias, credentialDurationSeconds: Int | Double = null, roleArn: RoleArn = null): UpdateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias)
    if (credentialDurationSeconds != null) __obj.updateDynamic("credentialDurationSeconds")(credentialDurationSeconds.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[UpdateRoleAliasRequest]
  }
}

