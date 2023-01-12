package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * The time that the endpoint was created.
    */
  var CreationTime: js.Date
  
  var DataCaptureConfig: js.UndefOr[DataCaptureConfigSummary] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsSdk.clientsSagemakerMod.EndpointArn
  
  /**
    * The endpoint configuration associated with the endpoint.
    */
  var EndpointConfigName: typings.awsSdk.clientsSagemakerMod.EndpointConfigName
  
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    * The status of the endpoint.
    */
  var EndpointStatus: typings.awsSdk.clientsSagemakerMod.EndpointStatus
  
  /**
    * If the endpoint failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The last time the endpoint was modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * A list of monitoring schedules for the endpoint. For information about model monitoring, see Amazon SageMaker Model Monitor.
    */
  var MonitoringSchedules: js.UndefOr[MonitoringScheduleList] = js.undefined
  
  /**
    * A list of the production variants hosted on the endpoint. Each production variant is a model.
    */
  var ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined
  
  /**
    * A list of the tags associated with the endpoint. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Endpoint {
  
  inline def apply(
    CreationTime: js.Date,
    EndpointArn: EndpointArn,
    EndpointConfigName: EndpointConfigName,
    EndpointName: EndpointName,
    EndpointStatus: EndpointStatus,
    LastModifiedTime: js.Date
  ): Endpoint = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], EndpointStatus = EndpointStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDataCaptureConfig(value: DataCaptureConfigSummary): Self = StObject.set(x, "DataCaptureConfig", value.asInstanceOf[js.Any])
    
    inline def setDataCaptureConfigUndefined: Self = StObject.set(x, "DataCaptureConfig", js.undefined)
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatus(value: EndpointStatus): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMonitoringSchedules(value: MonitoringScheduleList): Self = StObject.set(x, "MonitoringSchedules", value.asInstanceOf[js.Any])
    
    inline def setMonitoringSchedulesUndefined: Self = StObject.set(x, "MonitoringSchedules", js.undefined)
    
    inline def setMonitoringSchedulesVarargs(value: MonitoringSchedule*): Self = StObject.set(x, "MonitoringSchedules", js.Array(value*))
    
    inline def setProductionVariants(value: ProductionVariantSummaryList): Self = StObject.set(x, "ProductionVariants", value.asInstanceOf[js.Any])
    
    inline def setProductionVariantsUndefined: Self = StObject.set(x, "ProductionVariants", js.undefined)
    
    inline def setProductionVariantsVarargs(value: ProductionVariantSummary*): Self = StObject.set(x, "ProductionVariants", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
