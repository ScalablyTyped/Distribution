package typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendData extends js.Object {
  /**
    * Bucket to which the object was uploaded.
    */
  var Bucket: String
  /**
    * ETag of the uploaded object.
    */
  var ETag: String
  /**
    * Key to which the object was uploaded.
    */
  var Key: String
  /**
    * URL of the uploaded object.
    */
  var Location: String
}

object SendData {
  @scala.inline
  def apply(Bucket: String, ETag: String, Key: String, Location: String): SendData = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, ETag = ETag, Key = Key, Location = Location)
  
    __obj.asInstanceOf[SendData]
  }
}

