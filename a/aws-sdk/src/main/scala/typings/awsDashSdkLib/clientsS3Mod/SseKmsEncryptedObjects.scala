package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SseKmsEncryptedObjects extends js.Object {
  /**
    *  If the status is not Enabled, replication for S3 objects encrypted with AWS KMS is disabled.
    */
  var Status: SseKmsEncryptedObjectsStatus
}

object SseKmsEncryptedObjects {
  @scala.inline
  def apply(Status: SseKmsEncryptedObjectsStatus): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
}

