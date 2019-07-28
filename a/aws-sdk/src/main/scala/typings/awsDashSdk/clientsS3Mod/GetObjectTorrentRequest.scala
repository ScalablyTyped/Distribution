package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTorrentRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var Key: ObjectKey
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
}

object GetObjectTorrentRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, RequestPayer: RequestPayer = null): GetObjectTorrentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentRequest]
  }
}

