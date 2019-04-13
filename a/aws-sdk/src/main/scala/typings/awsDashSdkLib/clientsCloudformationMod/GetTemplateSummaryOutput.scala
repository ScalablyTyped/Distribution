package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateSummaryOutput extends js.Object {
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
    * The value that is defined in the Description property of the template.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The value that is defined for the Metadata property of the template.
    */
  var Metadata: js.UndefOr[Metadata] = js.undefined
  /**
    * A list of parameter declarations that describe various properties for each parameter.
    */
  var Parameters: js.UndefOr[ParameterDeclarations] = js.undefined
  /**
    * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
    */
  var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
  /**
    * The AWS template format version, which identifies the capabilities of the template.
    */
  var Version: js.UndefOr[Version] = js.undefined
}

object GetTemplateSummaryOutput {
  @scala.inline
  def apply(
    Capabilities: Capabilities = null,
    CapabilitiesReason: CapabilitiesReason = null,
    DeclaredTransforms: TransformsList = null,
    Description: Description = null,
    Metadata: Metadata = null,
    Parameters: ParameterDeclarations = null,
    ResourceTypes: ResourceTypes = null,
    Version: Version = null
  ): GetTemplateSummaryOutput = {
    val __obj = js.Dynamic.literal()
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (CapabilitiesReason != null) __obj.updateDynamic("CapabilitiesReason")(CapabilitiesReason)
    if (DeclaredTransforms != null) __obj.updateDynamic("DeclaredTransforms")(DeclaredTransforms)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetTemplateSummaryOutput]
  }
}

