package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the template that you're updating.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  /**
    * The source QuickSight entity from which this template is being updated. You can currently update templates from an Analysis or another template.
    */
  var SourceEntity: TemplateSourceEntity = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * A description of the current template version that is being updated. Every time you call UpdateTemplate, you create a new version of the template. Each version of the template maintains a description of the version in the VersionDescription field.
    */
  var VersionDescription: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.VersionDescription] = js.native
}

object UpdateTemplateRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    SourceEntity: TemplateSourceEntity,
    TemplateId: RestrictiveResourceId,
    Name: TemplateName = null,
    VersionDescription: VersionDescription = null
  ): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
}

