package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestination extends js.Object {
  /**
    * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
    */
  var S3BucketDestination: InventoryS3BucketDestination
}

object InventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: InventoryS3BucketDestination): InventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination)
  
    __obj.asInstanceOf[InventoryDestination]
  }
}

