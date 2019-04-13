package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectResponse extends js.Object {
  /**
    * The SHA256 digest of the object that is persisted.
    */
  var ContentSHA256: js.UndefOr[SHA256Hash] = js.undefined
  /**
    * Unique identifier of the object in the container.
    */
  var ETag: js.UndefOr[ETag] = js.undefined
  /**
    * The storage class where the object was persisted. The class should be “Temporal”.
    */
  var StorageClass: js.UndefOr[StorageClass] = js.undefined
}

object PutObjectResponse {
  @scala.inline
  def apply(ContentSHA256: SHA256Hash = null, ETag: ETag = null, StorageClass: StorageClass = null): PutObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (ContentSHA256 != null) __obj.updateDynamic("ContentSHA256")(ContentSHA256)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectResponse]
  }
}

