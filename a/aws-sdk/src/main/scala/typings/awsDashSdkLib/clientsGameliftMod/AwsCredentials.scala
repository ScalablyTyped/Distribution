package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsCredentials extends js.Object {
  /**
    * Temporary key allowing access to the Amazon GameLift S3 account.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Temporary secret key allowing access to the Amazon GameLift S3 account.
    */
  var SecretAccessKey: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Token used to associate a specific build ID with the files uploaded using these credentials.
    */
  var SessionToken: js.UndefOr[NonEmptyString] = js.undefined
}

object AwsCredentials {
  @scala.inline
  def apply(
    AccessKeyId: NonEmptyString = null,
    SecretAccessKey: NonEmptyString = null,
    SessionToken: NonEmptyString = null
  ): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (SecretAccessKey != null) __obj.updateDynamic("SecretAccessKey")(SecretAccessKey)
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken)
    __obj.asInstanceOf[AwsCredentials]
  }
}

