package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDefinition extends js.Object {
  /**
    * This parameter is ignored for models that contain only a PrimaryContainer. When a ContainerDefinition is part of an inference pipeline, the value of ths parameter uniquely identifies the container for the purposes of logging and metrics. For information, see Use Logs and Metrics to Monitor an Inference Pipeline. If you don't specify a value for this parameter for a ContainerDefinition that is part of an inference pipeline, a unique name is automatically assigned based on the position of the ContainerDefinition in the pipeline. If you specify a value for the ContainerHostName for any ContainerDefinition that is part of an inference pipeline, you must specify a value for the ContainerHostName parameter of every ContainerDefinition in that pipeline.
    */
  var ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined
  /**
    * The environment variables to set in the Docker container. Each key and value in the Environment string to string map can have length of up to 1024. We support up to 16 entries in the map. 
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.undefined
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker 
    */
  var Image: js.UndefOr[Image] = js.undefined
  /**
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own algorithms. For more information on built-in algorithms, see Common Parameters.  If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  If you use a built-in algorithm to create a model, Amazon SageMaker requires that you provide a S3 path to the model artifacts in ModelDataUrl. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.undefined
  /**
    * The name of the model package to use to create the model.
    */
  var ModelPackageName: js.UndefOr[ArnOrName] = js.undefined
}

object ContainerDefinition {
  @scala.inline
  def apply(
    ContainerHostname: ContainerHostname = null,
    Environment: EnvironmentMap = null,
    Image: Image = null,
    ModelDataUrl: Url = null,
    ModelPackageName: ArnOrName = null
  ): ContainerDefinition = {
    val __obj = js.Dynamic.literal()
    if (ContainerHostname != null) __obj.updateDynamic("ContainerHostname")(ContainerHostname)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (Image != null) __obj.updateDynamic("Image")(Image)
    if (ModelDataUrl != null) __obj.updateDynamic("ModelDataUrl")(ModelDataUrl)
    if (ModelPackageName != null) __obj.updateDynamic("ModelPackageName")(ModelPackageName)
    __obj.asInstanceOf[ContainerDefinition]
  }
}

