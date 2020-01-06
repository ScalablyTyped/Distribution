package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetSourceEntry extends js.Object {
  /**
    * The S3 bucket that's part of the source of the asset.
    */
  var Bucket: __string = js.native
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: __string = js.native
}

object AssetSourceEntry {
  @scala.inline
  def apply(Bucket: __string, Key: __string): AssetSourceEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssetSourceEntry]
  }
}

