package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  /**
    * 
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * 
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * 
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LastModified] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Owner] = js.undefined
  /**
    * 
    */
  var Size: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Size] = js.undefined
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectStorageClass] = js.undefined
}

object Object {
  @scala.inline
  def apply(
    ETag: ETag = null,
    Key: ObjectKey = null,
    LastModified: LastModified = null,
    Owner: Owner = null,
    Size: Int | Double = null,
    StorageClass: ObjectStorageClass = null
  ): Object = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

