package typings.awsDashSdk.libCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsOptions extends js.Object {
  /**
    * AWS access key ID.
    */
  var accessKeyId: String = js.native
  /**
    * AWS secret access key.
    */
  var secretAccessKey: String = js.native
  /**
    * AWS session token.
    */
  var sessionToken: js.UndefOr[String] = js.native
}

object CredentialsOptions {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String = null): CredentialsOptions = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsOptions]
  }
}

