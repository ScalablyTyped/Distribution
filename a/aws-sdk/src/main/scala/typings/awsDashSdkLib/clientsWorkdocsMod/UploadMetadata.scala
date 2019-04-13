package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMetadata extends js.Object {
  /**
    * The signed headers.
    */
  var SignedHeaders: js.UndefOr[SignedHeaderMap] = js.undefined
  /**
    * The URL of the upload.
    */
  var UploadUrl: js.UndefOr[UrlType] = js.undefined
}

object UploadMetadata {
  @scala.inline
  def apply(SignedHeaders: SignedHeaderMap = null, UploadUrl: UrlType = null): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (SignedHeaders != null) __obj.updateDynamic("SignedHeaders")(SignedHeaders)
    if (UploadUrl != null) __obj.updateDynamic("UploadUrl")(UploadUrl)
    __obj.asInstanceOf[UploadMetadata]
  }
}

