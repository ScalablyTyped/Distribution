package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartnerAccountResponse extends StObject {
  
  /**
    * Whether the partner account is linked to the AWS account.
    */
  var AccountLinked: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AccountLinked] = js.undefined
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: js.UndefOr[SidewalkAccountInfoWithFingerprint] = js.undefined
}
object GetPartnerAccountResponse {
  
  inline def apply(): GetPartnerAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartnerAccountResponse]
  }
  
  extension [Self <: GetPartnerAccountResponse](x: Self) {
    
    inline def setAccountLinked(value: AccountLinked): Self = StObject.set(x, "AccountLinked", value.asInstanceOf[js.Any])
    
    inline def setAccountLinkedUndefined: Self = StObject.set(x, "AccountLinked", js.undefined)
    
    inline def setSidewalk(value: SidewalkAccountInfoWithFingerprint): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
