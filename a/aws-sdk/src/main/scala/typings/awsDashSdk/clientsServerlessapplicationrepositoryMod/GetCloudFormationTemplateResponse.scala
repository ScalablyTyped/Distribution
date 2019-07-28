package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCloudFormationTemplateResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[__string] = js.undefined
  /**
    * The date and time this template expires. Templates
    expire 1 hour after creation.
    */
  var ExpirationTime: js.UndefOr[__string] = js.undefined
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[__string] = js.undefined
  /**
    * Status of the template creation workflow.Possible values: PREPARING | ACTIVE | EXPIRED
    
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsServerlessapplicationrepositoryMod.Status] = js.undefined
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[__string] = js.undefined
  /**
    * A link to the template that can be used to deploy the application using
    AWS CloudFormation.
    */
  var TemplateUrl: js.UndefOr[__string] = js.undefined
}

object GetCloudFormationTemplateResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CreationTime: __string = null,
    ExpirationTime: __string = null,
    SemanticVersion: __string = null,
    Status: Status = null,
    TemplateId: __string = null,
    TemplateUrl: __string = null
  ): GetCloudFormationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId)
    if (TemplateUrl != null) __obj.updateDynamic("TemplateUrl")(TemplateUrl)
    __obj.asInstanceOf[GetCloudFormationTemplateResponse]
  }
}

