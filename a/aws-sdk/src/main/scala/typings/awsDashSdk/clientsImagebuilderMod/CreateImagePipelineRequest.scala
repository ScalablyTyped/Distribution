package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImagePipelineRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the image pipeline. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute images created by this image pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image pipeline. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    *  The image test configuration of the image pipeline. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by this image pipeline. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    *  The name of the image pipeline. 
    */
  var name: ResourceName = js.native
  /**
    *  The schedule of the image pipeline. 
    */
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    *  The status of the image pipeline. 
    */
  var status: js.UndefOr[PipelineStatus] = js.native
  /**
    *  The tags of the image pipeline. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateImagePipelineRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    name: ResourceName,
    description: NonEmptyString = null,
    distributionConfigurationArn: DistributionConfigurationArn = null,
    imageTestsConfiguration: ImageTestsConfiguration = null,
    schedule: Schedule = null,
    status: PipelineStatus = null,
    tags: TagMap = null
  ): CreateImagePipelineRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (distributionConfigurationArn != null) __obj.updateDynamic("distributionConfigurationArn")(distributionConfigurationArn.asInstanceOf[js.Any])
    if (imageTestsConfiguration != null) __obj.updateDynamic("imageTestsConfiguration")(imageTestsConfiguration.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImagePipelineRequest]
  }
}

