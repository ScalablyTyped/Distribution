package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /**
    * A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of bytes is 5 MB. The document bytes must be in PNG or JPG format. If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using the Bytes field. 
    */
  var Bytes: js.UndefOr[ImageBlob] = js.undefined
  /**
    * Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5 MB.
    */
  var S3Object: js.UndefOr[S3Object] = js.undefined
}

object Document {
  @scala.inline
  def apply(Bytes: ImageBlob = null, S3Object: S3Object = null): Document = {
    val __obj = js.Dynamic.literal()
    if (Bytes != null) __obj.updateDynamic("Bytes")(Bytes.asInstanceOf[js.Any])
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object)
    __obj.asInstanceOf[Document]
  }
}

