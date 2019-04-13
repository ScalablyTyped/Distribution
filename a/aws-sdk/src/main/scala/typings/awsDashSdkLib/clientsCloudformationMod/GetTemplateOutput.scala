package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateOutput extends js.Object {
  /**
    * The stage of the template that you can retrieve. For stacks, the Original and Processed templates are always available. For change sets, the Original template is always available. After AWS CloudFormation finishes creating the change set, the Processed template becomes available.
    */
  var StagesAvailable: js.UndefOr[StageList] = js.undefined
  /**
    * Structure containing the template body. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) AWS CloudFormation returns the same template that was used when the stack was created.
    */
  var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
}

object GetTemplateOutput {
  @scala.inline
  def apply(StagesAvailable: StageList = null, TemplateBody: TemplateBody = null): GetTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (StagesAvailable != null) __obj.updateDynamic("StagesAvailable")(StagesAvailable)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    __obj.asInstanceOf[GetTemplateOutput]
  }
}

