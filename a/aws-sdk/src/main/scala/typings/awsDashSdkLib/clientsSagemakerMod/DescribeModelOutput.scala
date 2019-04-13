package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeModelOutput extends js.Object {
  /**
    * The containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.undefined
  /**
    * A timestamp that shows when the model was created.
    */
  var CreationTime: Timestamp
  /**
    * If True, no inbound or outbound network calls can be made to or from the model container.  The Semantic Segmentation built-in algorithm does not support network isolation. 
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
    */
  var ExecutionRoleArn: RoleArn
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: awsDashSdkLib.clientsSagemakerMod.ModelArn
  /**
    * Name of the Amazon SageMaker model.
    */
  var ModelName: awsDashSdkLib.clientsSagemakerMod.ModelName
  /**
    * The location of the primary inference code, associated artifacts, and custom environment map that the inference code uses when it is deployed in production. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined
  /**
    * A VpcConfig object that specifies the VPC that this model has access to. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud 
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object DescribeModelOutput {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    ExecutionRoleArn: RoleArn,
    ModelArn: ModelArn,
    ModelName: ModelName,
    Containers: ContainerDefinitionList = null,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    PrimaryContainer: ContainerDefinition = null,
    VpcConfig: VpcConfig = null
  ): DescribeModelOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, ExecutionRoleArn = ExecutionRoleArn, ModelArn = ModelArn, ModelName = ModelName)
    if (Containers != null) __obj.updateDynamic("Containers")(Containers)
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation)
    if (PrimaryContainer != null) __obj.updateDynamic("PrimaryContainer")(PrimaryContainer)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[DescribeModelOutput]
  }
}

