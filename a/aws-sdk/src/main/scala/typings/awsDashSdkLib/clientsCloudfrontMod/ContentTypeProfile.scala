package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentTypeProfile extends js.Object {
  /**
    * The content type for a field-level encryption content type-profile mapping. 
    */
  var ContentType: java.lang.String
  /**
    * The format for a field-level encryption content type-profile mapping. 
    */
  var Format: awsDashSdkLib.clientsCloudfrontMod.Format
  /**
    * The profile ID for a field-level encryption content type-profile mapping. 
    */
  var ProfileId: js.UndefOr[java.lang.String] = js.undefined
}

object ContentTypeProfile {
  @scala.inline
  def apply(ContentType: java.lang.String, Format: Format, ProfileId: java.lang.String = null): ContentTypeProfile = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, Format = Format.asInstanceOf[js.Any])
    if (ProfileId != null) __obj.updateDynamic("ProfileId")(ProfileId)
    __obj.asInstanceOf[ContentTypeProfile]
  }
}

