package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestFileLocation extends js.Object {
  /**
    * Amazon S3 bucket.
    */
  var Bucket: S3Bucket = js.native
  /**
    * Amazon S3 key that identifies an object.
    */
  var Key: S3Key = js.native
}

object ManifestFileLocation {
  @scala.inline
  def apply(Bucket: S3Bucket, Key: S3Key): ManifestFileLocation = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManifestFileLocation]
  }
}

