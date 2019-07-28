package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAliasDescription extends js.Object {
  /**
    * The UNIX timestamp of when the role alias was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The number of seconds for which the credential is valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
  /**
    * The UNIX timestamp of when the role alias was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The role alias owner.
    */
  var owner: js.UndefOr[AwsAccountId] = js.undefined
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.undefined
  /**
    * The ARN of the role alias.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object RoleAliasDescription {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
    lastModifiedDate: DateType = null,
    owner: AwsAccountId = null,
    roleAlias: RoleAlias = null,
    roleAliasArn: RoleAliasArn = null,
    roleArn: RoleArn = null
  ): RoleAliasDescription = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(credentialDurationSeconds)) __obj.updateDynamic("credentialDurationSeconds")(credentialDurationSeconds)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (roleAlias != null) __obj.updateDynamic("roleAlias")(roleAlias)
    if (roleAliasArn != null) __obj.updateDynamic("roleAliasArn")(roleAliasArn)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[RoleAliasDescription]
  }
}

