package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateTemplateOutput extends js.Object {
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Capabilities] = js.native
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.CapabilitiesReason] = js.native
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.native
  /**
    * The description found within the template.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.native
  /**
    * A list of TemplateParameter structures.
    */
  var Parameters: js.UndefOr[TemplateParameters] = js.native
}

object ValidateTemplateOutput {
  @scala.inline
  def apply(
    Capabilities: Capabilities = null,
    CapabilitiesReason: CapabilitiesReason = null,
    DeclaredTransforms: TransformsList = null,
    Description: Description = null,
    Parameters: TemplateParameters = null
  ): ValidateTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (CapabilitiesReason != null) __obj.updateDynamic("CapabilitiesReason")(CapabilitiesReason.asInstanceOf[js.Any])
    if (DeclaredTransforms != null) __obj.updateDynamic("DeclaredTransforms")(DeclaredTransforms.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateTemplateOutput]
  }
}

