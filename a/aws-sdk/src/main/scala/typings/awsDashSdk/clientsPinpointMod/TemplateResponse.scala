package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The date when the message template was created.
    */
  var CreationDate: __string
  /**
    * The date when the message template was last modified.
    */
  var LastModifiedDate: __string
  /**
    * The name of the message template.
    */
  var TemplateName: __string
  /**
    * The type of channel that the message template is designed for.
    */
  var TemplateType: typings.awsDashSdk.clientsPinpointMod.TemplateType
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object TemplateResponse {
  @scala.inline
  def apply(
    CreationDate: __string,
    LastModifiedDate: __string,
    TemplateName: __string,
    TemplateType: TemplateType,
    Arn: __string = null,
    tags: MapOf__string = null
  ): TemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate, LastModifiedDate = LastModifiedDate, TemplateName = TemplateName, TemplateType = TemplateType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[TemplateResponse]
  }
}

