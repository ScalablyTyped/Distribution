package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamAddressHistoryRecord extends StObject {
  
  /**
    * The CIDR of the resource.
    */
  var ResourceCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The compliance status of a resource. For more information on compliance statuses, see Monitor CIDR usage by resource in the Amazon VPC IPAM User Guide.
    */
  var ResourceComplianceStatus: js.UndefOr[IpamComplianceStatus] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with another CIDR in the scope. For more information on overlap statuses, see Monitor CIDR usage by resource in the Amazon VPC IPAM User Guide.
    */
  var ResourceOverlapStatus: js.UndefOr[IpamOverlapStatus] = js.undefined
  
  /**
    * The ID of the resource owner.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region of the resource.
    */
  var ResourceRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[IpamAddressHistoryResourceType] = js.undefined
  
  /**
    * Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic snapshots, so the end time may have occurred before this specific time.
    */
  var SampledEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic snapshots, so the start time may have occurred before this specific time.
    */
  var SampledStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The VPC ID of the resource.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object IpamAddressHistoryRecord {
  
  inline def apply(): IpamAddressHistoryRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamAddressHistoryRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamAddressHistoryRecord] (val x: Self) extends AnyVal {
    
    inline def setResourceCidr(value: String): Self = StObject.set(x, "ResourceCidr", value.asInstanceOf[js.Any])
    
    inline def setResourceCidrUndefined: Self = StObject.set(x, "ResourceCidr", js.undefined)
    
    inline def setResourceComplianceStatus(value: IpamComplianceStatus): Self = StObject.set(x, "ResourceComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceComplianceStatusUndefined: Self = StObject.set(x, "ResourceComplianceStatus", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setResourceOverlapStatus(value: IpamOverlapStatus): Self = StObject.set(x, "ResourceOverlapStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceOverlapStatusUndefined: Self = StObject.set(x, "ResourceOverlapStatus", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceRegion(value: String): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionUndefined: Self = StObject.set(x, "ResourceRegion", js.undefined)
    
    inline def setResourceType(value: IpamAddressHistoryResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSampledEndTime(value: js.Date): Self = StObject.set(x, "SampledEndTime", value.asInstanceOf[js.Any])
    
    inline def setSampledEndTimeUndefined: Self = StObject.set(x, "SampledEndTime", js.undefined)
    
    inline def setSampledStartTime(value: js.Date): Self = StObject.set(x, "SampledStartTime", value.asInstanceOf[js.Any])
    
    inline def setSampledStartTimeUndefined: Self = StObject.set(x, "SampledStartTime", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
