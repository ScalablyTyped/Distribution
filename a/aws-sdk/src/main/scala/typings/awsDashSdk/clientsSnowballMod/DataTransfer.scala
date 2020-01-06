package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransfer extends js.Object {
  /**
    * The number of bytes transferred between a Snowball and Amazon S3.
    */
  var BytesTransferred: js.UndefOr[Long] = js.native
  /**
    * The number of objects transferred between a Snowball and Amazon S3.
    */
  var ObjectsTransferred: js.UndefOr[Long] = js.native
  /**
    * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalBytes: js.UndefOr[Long] = js.native
  /**
    * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalObjects: js.UndefOr[Long] = js.native
}

object DataTransfer {
  @scala.inline
  def apply(
    BytesTransferred: Int | Double = null,
    ObjectsTransferred: Int | Double = null,
    TotalBytes: Int | Double = null,
    TotalObjects: Int | Double = null
  ): DataTransfer = {
    val __obj = js.Dynamic.literal()
    if (BytesTransferred != null) __obj.updateDynamic("BytesTransferred")(BytesTransferred.asInstanceOf[js.Any])
    if (ObjectsTransferred != null) __obj.updateDynamic("ObjectsTransferred")(ObjectsTransferred.asInstanceOf[js.Any])
    if (TotalBytes != null) __obj.updateDynamic("TotalBytes")(TotalBytes.asInstanceOf[js.Any])
    if (TotalObjects != null) __obj.updateDynamic("TotalObjects")(TotalObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransfer]
  }
}

