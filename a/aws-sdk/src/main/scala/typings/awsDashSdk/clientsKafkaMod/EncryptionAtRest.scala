package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionAtRest extends js.Object {
  /**
    * 
    The ARN of the AWS KMS key for encrypting data at rest. If you don't specify a KMS key, MSK creates one for you and uses it.
    
    */
  var DataVolumeKMSKeyId: __string
}

object EncryptionAtRest {
  @scala.inline
  def apply(DataVolumeKMSKeyId: __string): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(DataVolumeKMSKeyId = DataVolumeKMSKeyId)
  
    __obj.asInstanceOf[EncryptionAtRest]
  }
}

