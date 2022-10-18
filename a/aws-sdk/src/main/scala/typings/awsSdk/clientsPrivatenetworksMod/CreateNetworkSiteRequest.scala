package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkSiteRequest extends StObject {
  
  /**
    * The Availability Zone that is the parent of this site. You can't change the Availability Zone after you create the site.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone after you create the site.
    */
  var availabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The description of the site.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network.
    */
  var networkArn: Arn
  
  /**
    * The name of the site. You can't change the name after you create the site.
    */
  var networkSiteName: Name
  
  /**
    * Information about the pending plan for this site.
    */
  var pendingPlan: js.UndefOr[SitePlan] = js.undefined
  
  /**
    *  The tags to apply to the network site. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateNetworkSiteRequest {
  
  inline def apply(networkArn: Arn, networkSiteName: Name): CreateNetworkSiteRequest = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any], networkSiteName = networkSiteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkSiteRequest]
  }
  
  extension [Self <: CreateNetworkSiteRequest](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteName(value: Name): Self = StObject.set(x, "networkSiteName", value.asInstanceOf[js.Any])
    
    inline def setPendingPlan(value: SitePlan): Self = StObject.set(x, "pendingPlan", value.asInstanceOf[js.Any])
    
    inline def setPendingPlanUndefined: Self = StObject.set(x, "pendingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
