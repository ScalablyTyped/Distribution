package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkSite extends StObject {
  
  /**
    *  The parent Availability Zone for the network site. 
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    *  The parent Availability Zone ID for the network site. 
    */
  var availabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The creation time of the network site.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current plan of the network site.
    */
  var currentPlan: js.UndefOr[SitePlan] = js.undefined
  
  /**
    * The description of the network site.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network to which the network site belongs.
    */
  var networkArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the network site.
    */
  var networkSiteArn: Arn
  
  /**
    * The name of the network site.
    */
  var networkSiteName: Name
  
  /**
    * The pending plan of the network site.
    */
  var pendingPlan: js.UndefOr[SitePlan] = js.undefined
  
  /**
    * The status of the network site.
    */
  var status: NetworkSiteStatus
  
  /**
    * The status reason of the network site.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object NetworkSite {
  
  inline def apply(networkArn: Arn, networkSiteArn: Arn, networkSiteName: Name, status: NetworkSiteStatus): NetworkSite = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any], networkSiteArn = networkSiteArn.asInstanceOf[js.Any], networkSiteName = networkSiteName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSite]
  }
  
  extension [Self <: NetworkSite](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCurrentPlan(value: SitePlan): Self = StObject.set(x, "currentPlan", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlanUndefined: Self = StObject.set(x, "currentPlan", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteArn(value: Arn): Self = StObject.set(x, "networkSiteArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteName(value: Name): Self = StObject.set(x, "networkSiteName", value.asInstanceOf[js.Any])
    
    inline def setPendingPlan(value: SitePlan): Self = StObject.set(x, "pendingPlan", value.asInstanceOf[js.Any])
    
    inline def setPendingPlanUndefined: Self = StObject.set(x, "pendingPlan", js.undefined)
    
    inline def setStatus(value: NetworkSiteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
