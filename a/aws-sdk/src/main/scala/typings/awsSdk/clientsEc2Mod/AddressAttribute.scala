package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressAttribute extends StObject {
  
  /**
    * [EC2-VPC] The allocation ID.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.AllocationId] = js.undefined
  
  /**
    * The pointer (PTR) record for the IP address.
    */
  var PtrRecord: js.UndefOr[String] = js.undefined
  
  /**
    * The updated PTR record for the IP address.
    */
  var PtrRecordUpdate: js.UndefOr[PtrUpdateStatus] = js.undefined
  
  /**
    * The public IP address.
    */
  var PublicIp: js.UndefOr[PublicIpAddress] = js.undefined
}
object AddressAttribute {
  
  inline def apply(): AddressAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressAttribute] (val x: Self) extends AnyVal {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setPtrRecord(value: String): Self = StObject.set(x, "PtrRecord", value.asInstanceOf[js.Any])
    
    inline def setPtrRecordUndefined: Self = StObject.set(x, "PtrRecord", js.undefined)
    
    inline def setPtrRecordUpdate(value: PtrUpdateStatus): Self = StObject.set(x, "PtrRecordUpdate", value.asInstanceOf[js.Any])
    
    inline def setPtrRecordUpdateUndefined: Self = StObject.set(x, "PtrRecordUpdate", js.undefined)
    
    inline def setPublicIp(value: PublicIpAddress): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
