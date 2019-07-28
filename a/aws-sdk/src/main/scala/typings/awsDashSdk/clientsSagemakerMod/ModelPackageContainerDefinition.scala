package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPackageContainerDefinition extends js.Object {
  /**
    * The DNS host name for the Docker container.
    */
  var ContainerHostname: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ContainerHostname] = js.undefined
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var Image: typings.awsDashSdk.clientsSagemakerMod.Image
  /**
    * An MD5 hash of the training algorithm that identifies the Docker image used for training.
    */
  var ImageDigest: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ImageDigest] = js.undefined
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var ModelDataUrl: js.UndefOr[Url] = js.undefined
  /**
    * The AWS Marketplace product ID of the model package.
    */
  var ProductId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ProductId] = js.undefined
}

object ModelPackageContainerDefinition {
  @scala.inline
  def apply(
    Image: Image,
    ContainerHostname: ContainerHostname = null,
    ImageDigest: ImageDigest = null,
    ModelDataUrl: Url = null,
    ProductId: ProductId = null
  ): ModelPackageContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image)
    if (ContainerHostname != null) __obj.updateDynamic("ContainerHostname")(ContainerHostname)
    if (ImageDigest != null) __obj.updateDynamic("ImageDigest")(ImageDigest)
    if (ModelDataUrl != null) __obj.updateDynamic("ModelDataUrl")(ModelDataUrl)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    __obj.asInstanceOf[ModelPackageContainerDefinition]
  }
}

