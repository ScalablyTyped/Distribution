package typings
package awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendData extends js.Object {
  /**
    * Bucket to which the object was uploaded.
    */
  var Bucket: java.lang.String
  /**
    * ETag of the uploaded object.
    */
  var ETag: java.lang.String
  /**
    * Key to which the object was uploaded.
    */
  var Key: java.lang.String
  /**
    * URL of the uploaded object.
    */
  var Location: java.lang.String
}

object SendData {
  @scala.inline
  def apply(
    Bucket: java.lang.String,
    ETag: java.lang.String,
    Key: java.lang.String,
    Location: java.lang.String
  ): SendData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bucket")(Bucket)
    __obj.updateDynamic("ETag")(ETag)
    __obj.updateDynamic("Key")(Key)
    __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[SendData]
  }
}

