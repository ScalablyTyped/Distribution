package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionKey extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the encryption key being used to encrypt the custom terminology.
    */
  var Id: EncryptionKeyID
  /**
    * The type of encryption key used by Amazon Translate to encrypt custom terminologies.
    */
  var Type: EncryptionKeyType
}

object EncryptionKey {
  @scala.inline
  def apply(Id: EncryptionKeyID, Type: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(Id = Id, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptionKey]
  }
}

