package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionEntity extends js.Object {
  /**
    * Field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted. You can provide the full field name, or any beginning characters followed by a wildcard (*). You can't overlap field patterns. For example, you can't have both ABC* and AB*. Note that field patterns are case-sensitive. 
    */
  var FieldPatterns: awsDashSdkLib.clientsCloudfrontMod.FieldPatterns
  /**
    * The provider associated with the public key being used for encryption. This value must also be provided with the private key for applications to be able to decrypt data.
    */
  var ProviderId: java.lang.String
  /**
    * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns. 
    */
  var PublicKeyId: java.lang.String
}

object EncryptionEntity {
  @scala.inline
  def apply(FieldPatterns: FieldPatterns, ProviderId: java.lang.String, PublicKeyId: java.lang.String): EncryptionEntity = {
    val __obj = js.Dynamic.literal(FieldPatterns = FieldPatterns, ProviderId = ProviderId, PublicKeyId = PublicKeyId)
  
    __obj.asInstanceOf[EncryptionEntity]
  }
}

