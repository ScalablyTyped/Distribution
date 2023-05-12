package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionVariant extends StObject {
  
  /**
    * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand GPU computing for inference. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.undefined
  
  /**
    * The timeout value, in seconds, for your inference container to pass health check by SageMaker Hosting. For more information about health check, see How Your Container Should Respond to Health Check (Ping) Requests.
    */
  var ContainerStartupHealthCheckTimeoutInSeconds: js.UndefOr[ProductionVariantContainerStartupHealthCheckTimeoutInSeconds] = js.undefined
  
  /**
    * Specifies configuration for a core dump from the model container when the process crashes.
    */
  var CoreDumpConfig: js.UndefOr[ProductionVariantCoreDumpConfig] = js.undefined
  
  /**
    *  You can use this parameter to turn on native Amazon Web Services Systems Manager (SSM) access for a production variant behind an endpoint. By default, SSM access is disabled for all production variants behind an endpoint. You can turn on or turn off SSM access for a production variant behind an existing endpoint by creating a new endpoint configuration and calling UpdateEndpoint. 
    */
  var EnableSSMAccess: js.UndefOr[ProductionVariantSSMAccess] = js.undefined
  
  /**
    * Number of instances to launch initially.
    */
  var InitialInstanceCount: js.UndefOr[InitialTaskCount] = js.undefined
  
  /**
    * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. The traffic to a production variant is determined by the ratio of the VariantWeight to the sum of all VariantWeight values across all ProductionVariants. If unspecified, it defaults to 1.0. 
    */
  var InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
  
  /**
    * The ML compute instance type.
    */
  var InstanceType: js.UndefOr[ProductionVariantInstanceType] = js.undefined
  
  /**
    * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the individual inference instance associated with this production variant.
    */
  var ModelDataDownloadTimeoutInSeconds: js.UndefOr[ProductionVariantModelDataDownloadTimeoutInSeconds] = js.undefined
  
  /**
    * The name of the model that you want to host. This is the name that you specified when creating the model.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
  
  /**
    * The serverless configuration for an endpoint. Specifies a serverless endpoint configuration instead of an instance-based endpoint configuration.
    */
  var ServerlessConfig: js.UndefOr[ProductionVariantServerlessConfig] = js.undefined
  
  /**
    * The name of the production variant.
    */
  var VariantName: typings.awsSdk.clientsSagemakerMod.VariantName
  
  /**
    * The size, in GB, of the ML storage volume attached to individual inference instance associated with the production variant. Currently only Amazon EBS gp2 storage volumes are supported.
    */
  var VolumeSizeInGB: js.UndefOr[ProductionVariantVolumeSizeInGB] = js.undefined
}
object ProductionVariant {
  
  inline def apply(ModelName: ModelName, VariantName: VariantName): ProductionVariant = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductionVariant] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorType(value: ProductionVariantAcceleratorType): Self = StObject.set(x, "AcceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "AcceleratorType", js.undefined)
    
    inline def setContainerStartupHealthCheckTimeoutInSeconds(value: ProductionVariantContainerStartupHealthCheckTimeoutInSeconds): Self = StObject.set(x, "ContainerStartupHealthCheckTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setContainerStartupHealthCheckTimeoutInSecondsUndefined: Self = StObject.set(x, "ContainerStartupHealthCheckTimeoutInSeconds", js.undefined)
    
    inline def setCoreDumpConfig(value: ProductionVariantCoreDumpConfig): Self = StObject.set(x, "CoreDumpConfig", value.asInstanceOf[js.Any])
    
    inline def setCoreDumpConfigUndefined: Self = StObject.set(x, "CoreDumpConfig", js.undefined)
    
    inline def setEnableSSMAccess(value: ProductionVariantSSMAccess): Self = StObject.set(x, "EnableSSMAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableSSMAccessUndefined: Self = StObject.set(x, "EnableSSMAccess", js.undefined)
    
    inline def setInitialInstanceCount(value: InitialTaskCount): Self = StObject.set(x, "InitialInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInitialInstanceCountUndefined: Self = StObject.set(x, "InitialInstanceCount", js.undefined)
    
    inline def setInitialVariantWeight(value: VariantWeight): Self = StObject.set(x, "InitialVariantWeight", value.asInstanceOf[js.Any])
    
    inline def setInitialVariantWeightUndefined: Self = StObject.set(x, "InitialVariantWeight", js.undefined)
    
    inline def setInstanceType(value: ProductionVariantInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setModelDataDownloadTimeoutInSeconds(value: ProductionVariantModelDataDownloadTimeoutInSeconds): Self = StObject.set(x, "ModelDataDownloadTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setModelDataDownloadTimeoutInSecondsUndefined: Self = StObject.set(x, "ModelDataDownloadTimeoutInSeconds", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setServerlessConfig(value: ProductionVariantServerlessConfig): Self = StObject.set(x, "ServerlessConfig", value.asInstanceOf[js.Any])
    
    inline def setServerlessConfigUndefined: Self = StObject.set(x, "ServerlessConfig", js.undefined)
    
    inline def setVariantName(value: VariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGB(value: ProductionVariantVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
