package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SseKmsEncryptedObjects extends js.Object {
  /**
    * Specifies whether Amazon S3 replicates objects created with server-side encryption using an AWS KMS-managed key.
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

