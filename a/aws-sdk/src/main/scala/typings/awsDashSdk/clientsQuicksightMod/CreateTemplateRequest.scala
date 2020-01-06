package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * A display name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  /**
    * A list of resource permissions to be set on the template. 
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently, you can create a template from an analysis or another template. If the ARN is for an analysis, include its dataset references. 
    */
  var SourceEntity: TemplateSourceEntity = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * An ID for the template that you want to create. This template is unique per AWS Region in each AWS account.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * A description of the current template version being created. This API operation creates the first version of the template. Every time UpdateTemplate is called, a new version is created. Each version of the template maintains a description of the version in the VersionDescription field.
    */
  var VersionDescription: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.VersionDescription] = js.native
}

object CreateTemplateRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    SourceEntity: TemplateSourceEntity,
    TemplateId: RestrictiveResourceId,
    Name: TemplateName = null,
    Permissions: ResourcePermissionList = null,
    Tags: TagList = null,
    VersionDescription: VersionDescription = null
  ): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateRequest]
  }
}

