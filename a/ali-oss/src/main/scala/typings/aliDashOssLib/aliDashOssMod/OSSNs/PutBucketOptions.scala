package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketOptions extends js.Object {
  var storageClass: StorageType
  var timeout: scala.Double
}

object PutBucketOptions {
  @scala.inline
  def apply(storageClass: StorageType, timeout: scala.Double): PutBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storageClass")(storageClass)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[PutBucketOptions]
  }
}

