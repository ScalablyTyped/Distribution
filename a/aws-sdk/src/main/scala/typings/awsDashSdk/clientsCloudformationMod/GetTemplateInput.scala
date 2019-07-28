package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated template. If you specify a name, you must also specify the StackName.
    */
  var ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.undefined
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackName] = js.undefined
  /**
    * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the user-submitted template, specify Original. To get the template after AWS CloudFormation has processed all transforms, specify Processed.  If the template doesn't include transforms, Original and Processed return the same template. By default, AWS CloudFormation specifies Original. 
    */
  var TemplateStage: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TemplateStage] = js.undefined
}

object GetTemplateInput {
  @scala.inline
  def apply(
    ChangeSetName: ChangeSetNameOrId = null,
    StackName: StackName = null,
    TemplateStage: TemplateStage = null
  ): GetTemplateInput = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    if (TemplateStage != null) __obj.updateDynamic("TemplateStage")(TemplateStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateInput]
  }
}

