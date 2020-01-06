package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateSummaryOutput extends js.Object {
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
    * The value that is defined in the Description property of the template.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.native
  /**
    * The value that is defined for the Metadata property of the template.
    */
  var Metadata: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Metadata] = js.native
  /**
    * A list of parameter declarations that describe various properties for each parameter.
    */
  var Parameters: js.UndefOr[ParameterDeclarations] = js.native
  /**
    * A list of resource identifier summaries that describe the target resources of an import operation and the properties you can provide during the import to identify the target resources. For example, BucketName is a possible identifier property for an AWS::S3::Bucket resource. 
    */
  var ResourceIdentifierSummaries: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceIdentifierSummaries] = js.native
  /**
    * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
    */
  var ResourceTypes: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceTypes] = js.native
  /**
    * The AWS template format version, which identifies the capabilities of the template.
    */
  var Version: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Version] = js.native
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
    ResourceIdentifierSummaries: ResourceIdentifierSummaries = null,
    ResourceTypes: ResourceTypes = null,
    Version: Version = null
  ): GetTemplateSummaryOutput = {
    val __obj = js.Dynamic.literal()
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (CapabilitiesReason != null) __obj.updateDynamic("CapabilitiesReason")(CapabilitiesReason.asInstanceOf[js.Any])
    if (DeclaredTransforms != null) __obj.updateDynamic("DeclaredTransforms")(DeclaredTransforms.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ResourceIdentifierSummaries != null) __obj.updateDynamic("ResourceIdentifierSummaries")(ResourceIdentifierSummaries.asInstanceOf[js.Any])
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateSummaryOutput]
  }
}

