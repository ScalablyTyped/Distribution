package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitorInput extends StObject {
  
  /**
    * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request. Don't reuse the same client token for other API requests.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Publish internet measurements for Internet Monitor to an Amazon S3 bucket in addition to CloudWatch Logs.
    */
  var InternetMeasurementsLogDelivery: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.InternetMeasurementsLogDelivery] = js.undefined
  
  /**
    * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where clients access your application resources from and the network or ASN, such as an internet service provider (ISP), that clients access the resources through. This limit helps control billing costs. To learn more, see Choosing a city-network maximum value  in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var MaxCityNetworksToMonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.MaxCityNetworksToMonitor] = js.undefined
  
  /**
    * The name of the monitor. 
    */
  var MonitorName: ResourceName
  
  /**
    * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can add Amazon WorkSpaces directories. You can't add all three types of resources.  If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that it has internet connectivity. 
    */
  var Resources: js.UndefOr[SetOfARNs] = js.undefined
  
  /**
    * The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor.
    */
  var TrafficPercentageToMonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.TrafficPercentageToMonitor] = js.undefined
}
object CreateMonitorInput {
  
  inline def apply(MonitorName: ResourceName): CreateMonitorInput = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMonitorInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInternetMeasurementsLogDelivery(value: InternetMeasurementsLogDelivery): Self = StObject.set(x, "InternetMeasurementsLogDelivery", value.asInstanceOf[js.Any])
    
    inline def setInternetMeasurementsLogDeliveryUndefined: Self = StObject.set(x, "InternetMeasurementsLogDelivery", js.undefined)
    
    inline def setMaxCityNetworksToMonitor(value: MaxCityNetworksToMonitor): Self = StObject.set(x, "MaxCityNetworksToMonitor", value.asInstanceOf[js.Any])
    
    inline def setMaxCityNetworksToMonitorUndefined: Self = StObject.set(x, "MaxCityNetworksToMonitor", js.undefined)
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setResources(value: SetOfARNs): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: Arn*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTrafficPercentageToMonitor(value: TrafficPercentageToMonitor): Self = StObject.set(x, "TrafficPercentageToMonitor", value.asInstanceOf[js.Any])
    
    inline def setTrafficPercentageToMonitorUndefined: Self = StObject.set(x, "TrafficPercentageToMonitor", js.undefined)
  }
}
