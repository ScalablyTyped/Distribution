package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAuthConfig extends js.Object {
  /**
    * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
    */
  var AuthScheme: js.UndefOr[typings.awsDashSdk.clientsRdsMod.AuthScheme] = js.native
  /**
    * A user-specified description about the authentication used by a proxy to log in as a specific database user.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
    */
  var IAMAuth: js.UndefOr[IAMAuthMode] = js.native
  /**
    * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
    */
  var SecretArn: js.UndefOr[String] = js.native
  /**
    * The name of the database user to which the proxy connects.
    */
  var UserName: js.UndefOr[String] = js.native
}

object UserAuthConfig {
  @scala.inline
  def apply(
    AuthScheme: AuthScheme = null,
    Description: String = null,
    IAMAuth: IAMAuthMode = null,
    SecretArn: String = null,
    UserName: String = null
  ): UserAuthConfig = {
    val __obj = js.Dynamic.literal()
    if (AuthScheme != null) __obj.updateDynamic("AuthScheme")(AuthScheme.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (IAMAuth != null) __obj.updateDynamic("IAMAuth")(IAMAuth.asInstanceOf[js.Any])
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAuthConfig]
  }
}

