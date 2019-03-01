package typings
package awsDashSdkLib.libCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsOptions extends js.Object {
  /**
    * AWS access key ID.
    */
  var accessKeyId: java.lang.String
  /**
    * AWS secret access key.
    */
  var secretAccessKey: java.lang.String
  /**
    * AWS session token.
    */
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
}

object CredentialsOptions {
  @scala.inline
  def apply(
    accessKeyId: java.lang.String,
    secretAccessKey: java.lang.String,
    sessionToken: java.lang.String = null
  ): CredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessKeyId")(accessKeyId)
    __obj.updateDynamic("secretAccessKey")(secretAccessKey)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[CredentialsOptions]
  }
}

