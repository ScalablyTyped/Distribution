package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSelectionCriteria extends js.Object {
  /**
    *  A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If you include SourceSelectionCriteria in the replication configuration, this element is required. 
    */
  var SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects] = js.undefined
}

object SourceSelectionCriteria {
  @scala.inline
  def apply(SseKmsEncryptedObjects: SseKmsEncryptedObjects = null): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (SseKmsEncryptedObjects != null) __obj.updateDynamic("SseKmsEncryptedObjects")(SseKmsEncryptedObjects)
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
}

