package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SageMakerMachineLearningModelResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the Amazon SageMaker training job that represents the source model.
    */
  var SageMakerJobArn: js.UndefOr[__string] = js.undefined
}

object SageMakerMachineLearningModelResourceData {
  @scala.inline
  def apply(DestinationPath: __string = null, SageMakerJobArn: __string = null): SageMakerMachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    if (DestinationPath != null) __obj.updateDynamic("DestinationPath")(DestinationPath)
    if (SageMakerJobArn != null) __obj.updateDynamic("SageMakerJobArn")(SageMakerJobArn)
    __obj.asInstanceOf[SageMakerMachineLearningModelResourceData]
  }
}

