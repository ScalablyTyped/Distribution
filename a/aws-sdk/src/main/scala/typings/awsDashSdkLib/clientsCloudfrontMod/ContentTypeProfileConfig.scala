package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentTypeProfileConfig extends js.Object {
  /**
    * The configuration for a field-level encryption content type-profile. 
    */
  var ContentTypeProfiles: js.UndefOr[ContentTypeProfiles] = js.undefined
  /**
    * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown. 
    */
  var ForwardWhenContentTypeIsUnknown: scala.Boolean
}

object ContentTypeProfileConfig {
  @scala.inline
  def apply(ForwardWhenContentTypeIsUnknown: scala.Boolean, ContentTypeProfiles: ContentTypeProfiles = null): ContentTypeProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenContentTypeIsUnknown = ForwardWhenContentTypeIsUnknown)
    if (ContentTypeProfiles != null) __obj.updateDynamic("ContentTypeProfiles")(ContentTypeProfiles)
    __obj.asInstanceOf[ContentTypeProfileConfig]
  }
}

