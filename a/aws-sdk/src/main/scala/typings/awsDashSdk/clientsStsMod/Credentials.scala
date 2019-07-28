package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * The access key ID that identifies the temporary security credentials.
    */
  var AccessKeyId: accessKeyIdType
  /**
    * The date on which the current credentials expire.
    */
  var Expiration: dateType
  /**
    * The secret access key that can be used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType
  /**
    * The token that users must pass to the service API to use the temporary credentials.
    */
  var SessionToken: tokenType
}

object Credentials {
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    Expiration: dateType,
    SecretAccessKey: accessKeySecretType,
    SessionToken: tokenType
  ): Credentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId, Expiration = Expiration, SecretAccessKey = SecretAccessKey, SessionToken = SessionToken)
  
    __obj.asInstanceOf[Credentials]
  }
}

