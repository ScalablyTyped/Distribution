package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImagePipelineRequest extends StObject {
  
  /**
    *  The idempotency token used to make this request idempotent.
    */
  var clientToken: ClientToken
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe that is used to configure images created by this container pipeline.
    */
  var containerRecipeArn: js.UndefOr[ContainerRecipeArn] = js.undefined
  
  /**
    *  The description of the image pipeline.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute images created by this image pipeline.
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined
  
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default.
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image pipeline.
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.undefined
  
  /**
    *  The image test configuration of the image pipeline.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by this image pipeline.
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn
  
  /**
    *  The name of the image pipeline.
    */
  var name: ResourceName
  
  /**
    *  The schedule of the image pipeline.
    */
  var schedule: js.UndefOr[Schedule] = js.undefined
  
  /**
    *  The status of the image pipeline.
    */
  var status: js.UndefOr[PipelineStatus] = js.undefined
  
  /**
    *  The tags of the image pipeline.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateImagePipelineRequest {
  
  inline def apply(
    clientToken: ClientToken,
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    name: ResourceName
  ): CreateImagePipelineRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImagePipelineRequest]
  }
  
  extension [Self <: CreateImagePipelineRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setContainerRecipeArn(value: ContainerRecipeArn): Self = StObject.set(x, "containerRecipeArn", value.asInstanceOf[js.Any])
    
    inline def setContainerRecipeArnUndefined: Self = StObject.set(x, "containerRecipeArn", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setDistributionConfigurationArnUndefined: Self = StObject.set(x, "distributionConfigurationArn", js.undefined)
    
    inline def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = StObject.set(x, "enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnhancedImageMetadataEnabledUndefined: Self = StObject.set(x, "enhancedImageMetadataEnabled", js.undefined)
    
    inline def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
    
    inline def setImageRecipeArnUndefined: Self = StObject.set(x, "imageRecipeArn", js.undefined)
    
    inline def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = StObject.set(x, "imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageTestsConfigurationUndefined: Self = StObject.set(x, "imageTestsConfiguration", js.undefined)
    
    inline def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStatus(value: PipelineStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
