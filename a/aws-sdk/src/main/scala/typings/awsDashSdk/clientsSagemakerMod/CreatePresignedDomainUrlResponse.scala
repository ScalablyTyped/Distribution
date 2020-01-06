package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedDomainUrlResponse extends js.Object {
  /**
    * The presigned URL.
    */
  var AuthorizedUrl: js.UndefOr[PresignedDomainUrl] = js.native
}

object CreatePresignedDomainUrlResponse {
  @scala.inline
  def apply(AuthorizedUrl: PresignedDomainUrl = null): CreatePresignedDomainUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthorizedUrl != null) __obj.updateDynamic("AuthorizedUrl")(AuthorizedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedDomainUrlResponse]
  }
}

