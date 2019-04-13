package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectVersion extends js.Object {
  /**
    * 
    */
  var ETag: js.UndefOr[ETag] = js.undefined
  /**
    * Specifies whether the object is (true) or is not (false) the latest version of an object.
    */
  var IsLatest: js.UndefOr[IsLatest] = js.undefined
  /**
    * The object key.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * Date and time the object was last modified.
    */
  var LastModified: js.UndefOr[LastModified] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[Owner] = js.undefined
  /**
    * Size in bytes of the object.
    */
  var Size: js.UndefOr[Size] = js.undefined
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.undefined
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object ObjectVersion {
  @scala.inline
  def apply(
    ETag: ETag = null,
    IsLatest: js.UndefOr[IsLatest] = js.undefined,
    Key: ObjectKey = null,
    LastModified: LastModified = null,
    Owner: Owner = null,
    Size: js.UndefOr[Size] = js.undefined,
    StorageClass: ObjectVersionStorageClass = null,
    VersionId: ObjectVersionId = null
  ): ObjectVersion = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[ObjectVersion]
  }
}

