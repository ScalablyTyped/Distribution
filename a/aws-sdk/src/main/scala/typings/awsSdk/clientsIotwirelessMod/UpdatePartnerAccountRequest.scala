package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePartnerAccountRequest extends StObject {
  
  /**
    * The ID of the partner account to update.
    */
  var PartnerAccountId: typings.awsSdk.clientsIotwirelessMod.PartnerAccountId
  
  /**
    * The partner type.
    */
  var PartnerType: typings.awsSdk.clientsIotwirelessMod.PartnerType
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: SidewalkUpdateAccount
}
object UpdatePartnerAccountRequest {
  
  inline def apply(PartnerAccountId: PartnerAccountId, PartnerType: PartnerType, Sidewalk: SidewalkUpdateAccount): UpdatePartnerAccountRequest = {
    val __obj = js.Dynamic.literal(PartnerAccountId = PartnerAccountId.asInstanceOf[js.Any], PartnerType = PartnerType.asInstanceOf[js.Any], Sidewalk = Sidewalk.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePartnerAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePartnerAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setPartnerAccountId(value: PartnerAccountId): Self = StObject.set(x, "PartnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setPartnerType(value: PartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
    
    inline def setSidewalk(value: SidewalkUpdateAccount): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
  }
}
