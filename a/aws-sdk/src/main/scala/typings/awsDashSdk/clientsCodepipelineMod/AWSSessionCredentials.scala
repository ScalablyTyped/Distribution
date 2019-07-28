package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AWSSessionCredentials extends js.Object {
  /**
    * The access key for the session.
    */
  var accessKeyId: AccessKeyId
  /**
    * The secret access key for the session.
    */
  var secretAccessKey: SecretAccessKey
  /**
    * The token for the session.
    */
  var sessionToken: SessionToken
}

object AWSSessionCredentials {
  @scala.inline
  def apply(accessKeyId: AccessKeyId, secretAccessKey: SecretAccessKey, sessionToken: SessionToken): AWSSessionCredentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId, secretAccessKey = secretAccessKey, sessionToken = sessionToken)
  
    __obj.asInstanceOf[AWSSessionCredentials]
  }
}

