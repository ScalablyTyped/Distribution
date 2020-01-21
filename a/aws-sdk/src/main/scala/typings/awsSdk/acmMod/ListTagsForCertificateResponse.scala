package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForCertificateResponse extends js.Object {
  /**
    * The key-value pairs that define the applied tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ListTagsForCertificateResponse {
  @scala.inline
  def apply(Tags: TagList = null): ListTagsForCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForCertificateResponse]
  }
}

