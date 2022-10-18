package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetCidrReservation extends StObject {
  
  /**
    * The CIDR that has been reserved.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The description assigned to the subnet CIDR reservation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that owns the subnet CIDR reservation. 
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of reservation. 
    */
  var ReservationType: js.UndefOr[SubnetCidrReservationType] = js.undefined
  
  /**
    * The ID of the subnet CIDR reservation.
    */
  var SubnetCidrReservationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SubnetCidrReservationId] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SubnetId] = js.undefined
  
  /**
    * The tags assigned to the subnet CIDR reservation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object SubnetCidrReservation {
  
  inline def apply(): SubnetCidrReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetCidrReservation]
  }
  
  extension [Self <: SubnetCidrReservation](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setReservationType(value: SubnetCidrReservationType): Self = StObject.set(x, "ReservationType", value.asInstanceOf[js.Any])
    
    inline def setReservationTypeUndefined: Self = StObject.set(x, "ReservationType", js.undefined)
    
    inline def setSubnetCidrReservationId(value: SubnetCidrReservationId): Self = StObject.set(x, "SubnetCidrReservationId", value.asInstanceOf[js.Any])
    
    inline def setSubnetCidrReservationIdUndefined: Self = StObject.set(x, "SubnetCidrReservationId", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
