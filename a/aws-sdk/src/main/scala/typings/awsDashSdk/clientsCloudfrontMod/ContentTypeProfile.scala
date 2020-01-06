package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeProfile extends js.Object {
  /**
    * The content type for a field-level encryption content type-profile mapping. 
    */
  var ContentType: String = js.native
  /**
    * The format for a field-level encryption content type-profile mapping. 
    */
  var Format: typings.awsDashSdk.clientsCloudfrontMod.Format = js.native
  /**
    * The profile ID for a field-level encryption content type-profile mapping. 
    */
  var ProfileId: js.UndefOr[String] = js.native
}

object ContentTypeProfile {
  @scala.inline
  def apply(ContentType: String, Format: Format, ProfileId: String = null): ContentTypeProfile = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (ProfileId != null) __obj.updateDynamic("ProfileId")(ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfile]
  }
}

