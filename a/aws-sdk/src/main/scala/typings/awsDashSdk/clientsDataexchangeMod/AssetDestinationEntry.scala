package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetDestinationEntry extends js.Object {
  /**
    * The unique identifier for the asset.
    */
  var AssetId: Id = js.native
  /**
    * The S3 bucket that is the destination for the asset.
    */
  var Bucket: __string = js.native
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: js.UndefOr[__string] = js.native
}

object AssetDestinationEntry {
  @scala.inline
  def apply(AssetId: Id, Bucket: __string, Key: __string = null): AssetDestinationEntry = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDestinationEntry]
  }
}

