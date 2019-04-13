package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDefinition extends js.Object {
  /**
    * This parameter is ignored.
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
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).  If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.
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

