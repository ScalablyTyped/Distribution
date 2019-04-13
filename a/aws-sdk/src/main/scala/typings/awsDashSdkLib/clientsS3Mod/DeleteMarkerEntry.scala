package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMarkerEntry extends js.Object {
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
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object DeleteMarkerEntry {
  @scala.inline
  def apply(
    IsLatest: js.UndefOr[IsLatest] = js.undefined,
    Key: ObjectKey = null,
    LastModified: LastModified = null,
    Owner: Owner = null,
    VersionId: ObjectVersionId = null
  ): DeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteMarkerEntry]
  }
}

