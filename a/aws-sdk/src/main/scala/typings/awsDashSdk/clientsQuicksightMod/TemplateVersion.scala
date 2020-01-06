package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVersion extends js.Object {
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * Schema of the dataset identified by the placeholder. The idea is that any dashboard created from the template should be bound to new datasets matching the same schema described through this API. .
    */
  var DataSetConfigurations: js.UndefOr[DataSetConfigurationList] = js.native
  /**
    * The description of the template.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  /**
    * Errors associated with the template.
    */
  var Errors: js.UndefOr[TemplateErrorList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the analysis or template which was used to create this template.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * The version number of the template.
    */
  var VersionNumber: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.VersionNumber] = js.native
}

object TemplateVersion {
  @scala.inline
  def apply(
    CreatedTime: Timestamp = null,
    DataSetConfigurations: DataSetConfigurationList = null,
    Description: VersionDescription = null,
    Errors: TemplateErrorList = null,
    SourceEntityArn: Arn = null,
    Status: ResourceStatus = null,
    VersionNumber: Int | scala.Double = null
  ): TemplateVersion = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DataSetConfigurations != null) __obj.updateDynamic("DataSetConfigurations")(DataSetConfigurations.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (SourceEntityArn != null) __obj.updateDynamic("SourceEntityArn")(SourceEntityArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VersionNumber != null) __obj.updateDynamic("VersionNumber")(VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersion]
  }
}

