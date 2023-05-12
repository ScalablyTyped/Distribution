package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMonitorOutput extends StObject {
  
  /**
    * The time when the monitor was created.
    */
  var CreatedAt: js.Date
  
  /**
    * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The measurements are also published to Amazon CloudWatch Logs.
    */
  var InternetMeasurementsLogDelivery: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.InternetMeasurementsLogDelivery] = js.undefined
  
  /**
    * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where clients access your application resources from and the network or ASN, such as an internet service provider (ISP), that clients access the resources through. This limit helps control billing costs. To learn more, see Choosing a city-network maximum value  in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var MaxCityNetworksToMonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.MaxCityNetworksToMonitor] = js.undefined
  
  /**
    * The last time that the monitor was modified.
    */
  var ModifiedAt: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the monitor.
    */
  var MonitorArn: typings.awsSdk.clientsInternetmonitorMod.MonitorArn
  
  /**
    * The name of the monitor.
    */
  var MonitorName: ResourceName
  
  /**
    * The health of the data processing for the monitor.
    */
  var ProcessingStatus: js.UndefOr[MonitorProcessingStatusCode] = js.undefined
  
  /**
    * Additional information about the health of the data processing for the monitor.
    */
  var ProcessingStatusInfo: js.UndefOr[String] = js.undefined
  
  /**
    * The resources that have been added for the monitor. Resources are listed by their Amazon Resource Names (ARNs).
    */
  var Resources: SetOfARNs
  
  /**
    * The status of the monitor.
    */
  var Status: MonitorConfigState
  
  /**
    * The tags that have been added to monitor.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor.
    */
  var TrafficPercentageToMonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.TrafficPercentageToMonitor] = js.undefined
}
object GetMonitorOutput {
  
  inline def apply(
    CreatedAt: js.Date,
    ModifiedAt: js.Date,
    MonitorArn: MonitorArn,
    MonitorName: ResourceName,
    Resources: SetOfARNs,
    Status: MonitorConfigState
  ): GetMonitorOutput = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], ModifiedAt = ModifiedAt.asInstanceOf[js.Any], MonitorArn = MonitorArn.asInstanceOf[js.Any], MonitorName = MonitorName.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMonitorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMonitorOutput] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setInternetMeasurementsLogDelivery(value: InternetMeasurementsLogDelivery): Self = StObject.set(x, "InternetMeasurementsLogDelivery", value.asInstanceOf[js.Any])
    
    inline def setInternetMeasurementsLogDeliveryUndefined: Self = StObject.set(x, "InternetMeasurementsLogDelivery", js.undefined)
    
    inline def setMaxCityNetworksToMonitor(value: MaxCityNetworksToMonitor): Self = StObject.set(x, "MaxCityNetworksToMonitor", value.asInstanceOf[js.Any])
    
    inline def setMaxCityNetworksToMonitorUndefined: Self = StObject.set(x, "MaxCityNetworksToMonitor", js.undefined)
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setMonitorArn(value: MonitorArn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatus(value: MonitorProcessingStatusCode): Self = StObject.set(x, "ProcessingStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusInfo(value: String): Self = StObject.set(x, "ProcessingStatusInfo", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusInfoUndefined: Self = StObject.set(x, "ProcessingStatusInfo", js.undefined)
    
    inline def setProcessingStatusUndefined: Self = StObject.set(x, "ProcessingStatus", js.undefined)
    
    inline def setResources(value: SetOfARNs): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Arn*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setStatus(value: MonitorConfigState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTrafficPercentageToMonitor(value: TrafficPercentageToMonitor): Self = StObject.set(x, "TrafficPercentageToMonitor", value.asInstanceOf[js.Any])
    
    inline def setTrafficPercentageToMonitorUndefined: Self = StObject.set(x, "TrafficPercentageToMonitor", js.undefined)
  }
}
