package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVersionResponse extends js.Object {
  /**
    * The date, in ISO 8601 format, when the version of the message template was created.
    */
  var CreationDate: __string = js.native
  /**
    * A JSON object that specifies the default values that are used for message variables in the version of the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[__string] = js.native
  /**
    * The date, in ISO 8601 format, when the version of the message template was last modified.
    */
  var LastModifiedDate: __string = js.native
  /**
    * The custom description of the version of the message template.
    */
  var TemplateDescription: js.UndefOr[__string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: __string = js.native
  /**
    * The type of channel that the message template is designed for. Possible values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: __string = js.native
  /**
    * The unique identifier for the version of the message template. This value is an integer that Amazon Pinpoint automatically increments and assigns to each new version of a template.
    */
  var Version: js.UndefOr[__string] = js.native
}

object TemplateVersionResponse {
  @scala.inline
  def apply(
    CreationDate: __string,
    LastModifiedDate: __string,
    TemplateName: __string,
    TemplateType: __string,
    DefaultSubstitutions: __string = null,
    TemplateDescription: __string = null,
    Version: __string = null
  ): TemplateVersionResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionResponse]
  }
}

