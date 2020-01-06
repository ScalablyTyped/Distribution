package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Object extends js.Object {
  /**
    * The name of the S3 bucket.
    */
  var Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The file name of the input document. Synchronous operations can use image files that are in JPEG or PNG format. Asynchronous operations also support PDF format files.
    */
  var Name: js.UndefOr[S3ObjectName] = js.native
  /**
    * If the bucket has versioning enabled, you can specify the object version. 
    */
  var Version: js.UndefOr[S3ObjectVersion] = js.native
}

object S3Object {
  @scala.inline
  def apply(Bucket: S3Bucket = null, Name: S3ObjectName = null, Version: S3ObjectVersion = null): S3Object = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Object]
  }
}

