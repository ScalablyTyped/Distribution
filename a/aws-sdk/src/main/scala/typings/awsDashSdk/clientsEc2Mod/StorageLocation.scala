package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageLocation extends js.Object {
  /**
    * The name of the S3 bucket.
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * The key.
    */
  var Key: js.UndefOr[String] = js.undefined
}

object StorageLocation {
  @scala.inline
  def apply(Bucket: String = null, Key: String = null): StorageLocation = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[StorageLocation]
  }
}

