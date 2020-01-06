package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadMetadata extends js.Object {
  /**
    * The signed headers.
    */
  var SignedHeaders: js.UndefOr[SignedHeaderMap] = js.native
  /**
    * The URL of the upload.
    */
  var UploadUrl: js.UndefOr[UrlType] = js.native
}

object UploadMetadata {
  @scala.inline
  def apply(SignedHeaders: SignedHeaderMap = null, UploadUrl: UrlType = null): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (SignedHeaders != null) __obj.updateDynamic("SignedHeaders")(SignedHeaders.asInstanceOf[js.Any])
    if (UploadUrl != null) __obj.updateDynamic("UploadUrl")(UploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadMetadata]
  }
}

