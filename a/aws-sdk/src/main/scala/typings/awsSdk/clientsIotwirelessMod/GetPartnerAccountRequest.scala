package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartnerAccountRequest extends StObject {
  
  /**
    * The partner account ID to disassociate from the AWS account.
    */
  var PartnerAccountId: typings.awsSdk.clientsIotwirelessMod.PartnerAccountId
  
  /**
    * The partner type.
    */
  var PartnerType: typings.awsSdk.clientsIotwirelessMod.PartnerType
}
object GetPartnerAccountRequest {
  
  inline def apply(PartnerAccountId: PartnerAccountId, PartnerType: PartnerType): GetPartnerAccountRequest = {
    val __obj = js.Dynamic.literal(PartnerAccountId = PartnerAccountId.asInstanceOf[js.Any], PartnerType = PartnerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartnerAccountRequest]
  }
  
  extension [Self <: GetPartnerAccountRequest](x: Self) {
    
    inline def setPartnerAccountId(value: PartnerAccountId): Self = StObject.set(x, "PartnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setPartnerType(value: PartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
  }
}
