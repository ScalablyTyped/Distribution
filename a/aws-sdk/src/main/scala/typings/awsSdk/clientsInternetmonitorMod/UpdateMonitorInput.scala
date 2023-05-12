package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitorInput extends StObject {
  
  /**
    * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request. You should not reuse the same client token for other API requests.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The measurements are also published to Amazon CloudWatch Logs.
    */
  var InternetMeasurementsLogDelivery: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.InternetMeasurementsLogDelivery] = js.undefined
  
  /**
    * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where clients access your application resources from and the network or ASN, such as an internet service provider, that clients access the resources through.
    */
  var MaxCityNetworksToMonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.MaxCityNetworksToMonitor] = js.undefined
  
  /**
    * The name of the monitor. 
    */
  var MonitorName: ResourceName
  
  /**
    * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can add Amazon WorkSpaces directories. You can't add all three types of resources.  If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that it has internet connectivity. 
    */
  var ResourcesToAdd: js.UndefOr[SetOfARNs] = js.undefined
  
  /**
    * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
    */
  var ResourcesToRemove: js.UndefOr[SetOfARNs] = js.undefined
  
  /**
    * The status for a monitor. The accepted values for Status with the UpdateMonitor API call are the following: ACTIVE and INACTIVE. The following values are not accepted: PENDING, and ERROR.
    */
  var Status: js.UndefOr[MonitorConfigState] = js.undefined
  
  /**
    * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor.
    */
  var TrafficPercentageToMonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.TrafficPercentageToMonitor] = js.undefined
}
object UpdateMonitorInput {
  
  inline def apply(MonitorName: ResourceName): UpdateMonitorInput = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMonitorInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInternetMeasurementsLogDelivery(value: InternetMeasurementsLogDelivery): Self = StObject.set(x, "InternetMeasurementsLogDelivery", value.asInstanceOf[js.Any])
    
    inline def setInternetMeasurementsLogDeliveryUndefined: Self = StObject.set(x, "InternetMeasurementsLogDelivery", js.undefined)
    
    inline def setMaxCityNetworksToMonitor(value: MaxCityNetworksToMonitor): Self = StObject.set(x, "MaxCityNetworksToMonitor", value.asInstanceOf[js.Any])
    
    inline def setMaxCityNetworksToMonitorUndefined: Self = StObject.set(x, "MaxCityNetworksToMonitor", js.undefined)
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setResourcesToAdd(value: SetOfARNs): Self = StObject.set(x, "ResourcesToAdd", value.asInstanceOf[js.Any])
    
    inline def setResourcesToAddUndefined: Self = StObject.set(x, "ResourcesToAdd", js.undefined)
    
    inline def setResourcesToAddVarargs(value: Arn*): Self = StObject.set(x, "ResourcesToAdd", js.Array(value*))
    
    inline def setResourcesToRemove(value: SetOfARNs): Self = StObject.set(x, "ResourcesToRemove", value.asInstanceOf[js.Any])
    
    inline def setResourcesToRemoveUndefined: Self = StObject.set(x, "ResourcesToRemove", js.undefined)
    
    inline def setResourcesToRemoveVarargs(value: Arn*): Self = StObject.set(x, "ResourcesToRemove", js.Array(value*))
    
    inline def setStatus(value: MonitorConfigState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrafficPercentageToMonitor(value: TrafficPercentageToMonitor): Self = StObject.set(x, "TrafficPercentageToMonitor", value.asInstanceOf[js.Any])
    
    inline def setTrafficPercentageToMonitorUndefined: Self = StObject.set(x, "TrafficPercentageToMonitor", js.undefined)
  }
}
