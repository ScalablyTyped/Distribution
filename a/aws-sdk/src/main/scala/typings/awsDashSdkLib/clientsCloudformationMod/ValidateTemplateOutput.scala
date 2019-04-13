package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateTemplateOutput extends js.Object {
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[Capabilities] = js.undefined
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined
  /**
    * The description found within the template.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * A list of TemplateParameter structures.
    */
  var Parameters: js.UndefOr[TemplateParameters] = js.undefined
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
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (CapabilitiesReason != null) __obj.updateDynamic("CapabilitiesReason")(CapabilitiesReason)
    if (DeclaredTransforms != null) __obj.updateDynamic("DeclaredTransforms")(DeclaredTransforms)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[ValidateTemplateOutput]
  }
}

