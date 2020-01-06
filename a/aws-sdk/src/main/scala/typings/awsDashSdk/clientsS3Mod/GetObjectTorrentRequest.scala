package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectTorrentRequest extends js.Object {
  /**
    * The name of the bucket containing the object for which to get the torrent files.
    */
  var Bucket: BucketName = js.native
  /**
    * The object key for which to get the information.
    */
  var Key: ObjectKey = js.native
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.native
}

object GetObjectTorrentRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, RequestPayer: RequestPayer = null): GetObjectTorrentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentRequest]
  }
}

