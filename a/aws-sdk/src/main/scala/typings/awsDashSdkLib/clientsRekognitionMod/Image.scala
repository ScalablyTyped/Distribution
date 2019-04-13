package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * Blob of image bytes up to 5 MBs.
    */
  var Bytes: js.UndefOr[ImageBlob] = js.undefined
  /**
    * Identifies an S3 object as the image source.
    */
  var S3Object: js.UndefOr[S3Object] = js.undefined
}

object Image {
  @scala.inline
  def apply(Bytes: ImageBlob = null, S3Object: S3Object = null): Image = {
    val __obj = js.Dynamic.literal()
    if (Bytes != null) __obj.updateDynamic("Bytes")(Bytes.asInstanceOf[js.Any])
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object)
    __obj.asInstanceOf[Image]
  }
}

