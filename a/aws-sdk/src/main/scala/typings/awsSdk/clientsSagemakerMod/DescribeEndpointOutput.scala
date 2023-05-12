package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointOutput extends StObject {
  
  /**
    * Returns the description of an endpoint configuration created using the  CreateEndpointConfig  API.
    */
  var AsyncInferenceConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AsyncInferenceConfig] = js.undefined
  
  /**
    * A timestamp that shows when the endpoint was created.
    */
  var CreationTime: js.Date
  
  var DataCaptureConfig: js.UndefOr[DataCaptureConfigSummary] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsSdk.clientsSagemakerMod.EndpointArn
  
  /**
    * The name of the endpoint configuration associated with this endpoint.
    */
  var EndpointConfigName: typings.awsSdk.clientsSagemakerMod.EndpointConfigName
  
  /**
    * Name of the endpoint.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    * The status of the endpoint.    OutOfService: Endpoint is not available to take incoming requests.    Creating: CreateEndpoint is executing.    Updating: UpdateEndpoint or UpdateEndpointWeightsAndCapacities is executing.    SystemUpdating: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled until it has completed. This maintenance operation does not change any customer-specified values such as VPC config, KMS encryption, model, instance type, or instance count.    RollingBack: Endpoint fails to scale up or down or change its variant weight and is in the process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an InService status. This transitional status only applies to an endpoint that has autoscaling enabled and is undergoing variant weight or capacity changes as part of an UpdateEndpointWeightsAndCapacities call or when the UpdateEndpointWeightsAndCapacities operation is called explicitly.    InService: Endpoint is available to process incoming requests.    Deleting: DeleteEndpoint is executing.    Failed: Endpoint could not be created, updated, or re-scaled. Use the FailureReason value returned by DescribeEndpoint for information about the failure. DeleteEndpoint is the only operation that can be performed on a failed endpoint.  
    */
  var EndpointStatus: typings.awsSdk.clientsSagemakerMod.EndpointStatus
  
  /**
    * The configuration parameters for an explainer.
    */
  var ExplainerConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExplainerConfig] = js.undefined
  
  /**
    * If the status of the endpoint is Failed, the reason why it failed. 
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The most recent deployment configuration for the endpoint.
    */
  var LastDeploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  
  /**
    * A timestamp that shows when the endpoint was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * Returns the summary of an in-progress deployment. This field is only returned when the endpoint is creating or updating with a new endpoint configuration.
    */
  var PendingDeploymentSummary: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PendingDeploymentSummary] = js.undefined
  
  /**
    * An array of ProductionVariantSummary objects, one for each model hosted behind this endpoint.
    */
  var ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined
  
  /**
    * An array of ProductionVariantSummary objects, one for each model that you want to host at this endpoint in shadow mode with production traffic replicated from the model specified on ProductionVariants.
    */
  var ShadowProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined
}
object DescribeEndpointOutput {
  
  inline def apply(
    CreationTime: js.Date,
    EndpointArn: EndpointArn,
    EndpointConfigName: EndpointConfigName,
    EndpointName: EndpointName,
    EndpointStatus: EndpointStatus,
    LastModifiedTime: js.Date
  ): DescribeEndpointOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], EndpointStatus = EndpointStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEndpointOutput] (val x: Self) extends AnyVal {
    
    inline def setAsyncInferenceConfig(value: AsyncInferenceConfig): Self = StObject.set(x, "AsyncInferenceConfig", value.asInstanceOf[js.Any])
    
    inline def setAsyncInferenceConfigUndefined: Self = StObject.set(x, "AsyncInferenceConfig", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDataCaptureConfig(value: DataCaptureConfigSummary): Self = StObject.set(x, "DataCaptureConfig", value.asInstanceOf[js.Any])
    
    inline def setDataCaptureConfigUndefined: Self = StObject.set(x, "DataCaptureConfig", js.undefined)
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatus(value: EndpointStatus): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setExplainerConfig(value: ExplainerConfig): Self = StObject.set(x, "ExplainerConfig", value.asInstanceOf[js.Any])
    
    inline def setExplainerConfigUndefined: Self = StObject.set(x, "ExplainerConfig", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "LastDeploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentConfigUndefined: Self = StObject.set(x, "LastDeploymentConfig", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setPendingDeploymentSummary(value: PendingDeploymentSummary): Self = StObject.set(x, "PendingDeploymentSummary", value.asInstanceOf[js.Any])
    
    inline def setPendingDeploymentSummaryUndefined: Self = StObject.set(x, "PendingDeploymentSummary", js.undefined)
    
    inline def setProductionVariants(value: ProductionVariantSummaryList): Self = StObject.set(x, "ProductionVariants", value.asInstanceOf[js.Any])
    
    inline def setProductionVariantsUndefined: Self = StObject.set(x, "ProductionVariants", js.undefined)
    
    inline def setProductionVariantsVarargs(value: ProductionVariantSummary*): Self = StObject.set(x, "ProductionVariants", js.Array(value*))
    
    inline def setShadowProductionVariants(value: ProductionVariantSummaryList): Self = StObject.set(x, "ShadowProductionVariants", value.asInstanceOf[js.Any])
    
    inline def setShadowProductionVariantsUndefined: Self = StObject.set(x, "ShadowProductionVariants", js.undefined)
    
    inline def setShadowProductionVariantsVarargs(value: ProductionVariantSummary*): Self = StObject.set(x, "ShadowProductionVariants", js.Array(value*))
  }
}
