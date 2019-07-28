package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForCertificateResponse extends js.Object {
  /**
    * The key-value pairs that define the applied tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForCertificateResponse {
  @scala.inline
  def apply(Tags: TagList = null): ListTagsForCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForCertificateResponse]
  }
}

