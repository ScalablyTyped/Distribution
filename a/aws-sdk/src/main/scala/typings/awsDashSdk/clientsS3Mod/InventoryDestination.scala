package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestination extends js.Object {
  /**
    * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
    */
  var S3BucketDestination: InventoryS3BucketDestination = js.native
}

object InventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: InventoryS3BucketDestination): InventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InventoryDestination]
  }
}

