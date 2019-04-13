package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionAtRest extends js.Object {
  /**
    * The AWS KMS key used for data encryption.
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

