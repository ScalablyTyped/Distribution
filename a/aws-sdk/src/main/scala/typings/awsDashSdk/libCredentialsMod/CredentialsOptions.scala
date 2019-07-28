package typings.awsDashSdk.libCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsOptions extends js.Object {
  /**
    * AWS access key ID.
    */
  var accessKeyId: String
  /**
    * AWS secret access key.
    */
  var secretAccessKey: String
  /**
    * AWS session token.
    */
  var sessionToken: js.UndefOr[String] = js.undefined
}

object CredentialsOptions {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String = null): CredentialsOptions = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId, secretAccessKey = secretAccessKey)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[CredentialsOptions]
  }
}

