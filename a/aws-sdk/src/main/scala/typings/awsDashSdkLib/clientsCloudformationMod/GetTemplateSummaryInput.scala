package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateSummaryInput extends js.Object {
  /**
    * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the unique stack ID. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
  /**
    * The name or unique ID of the stack set from which the stack was created. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var StackSetName: js.UndefOr[StackSetNameOrId] = js.undefined
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
  /**
    * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
}

object GetTemplateSummaryInput {
  @scala.inline
  def apply(
    StackName: StackNameOrId = null,
    StackSetName: StackSetNameOrId = null,
    TemplateBody: TemplateBody = null,
    TemplateURL: TemplateURL = null
  ): GetTemplateSummaryInput = {
    val __obj = js.Dynamic.literal()
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    if (StackSetName != null) __obj.updateDynamic("StackSetName")(StackSetName)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    if (TemplateURL != null) __obj.updateDynamic("TemplateURL")(TemplateURL)
    __obj.asInstanceOf[GetTemplateSummaryInput]
  }
}

