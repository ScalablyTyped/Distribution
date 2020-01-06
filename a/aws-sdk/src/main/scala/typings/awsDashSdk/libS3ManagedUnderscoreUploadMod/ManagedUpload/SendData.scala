package typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendData extends js.Object {
  /**
    * Bucket to which the object was uploaded.
    */
  var Bucket: String = js.native
  /**
    * ETag of the uploaded object.
    */
  var ETag: String = js.native
  /**
    * Key to which the object was uploaded.
    */
  var Key: String = js.native
  /**
    * URL of the uploaded object.
    */
  var Location: String = js.native
}

object SendData {
  @scala.inline
  def apply(Bucket: String, ETag: String, Key: String, Location: String): SendData = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ETag = ETag.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendData]
  }
}

