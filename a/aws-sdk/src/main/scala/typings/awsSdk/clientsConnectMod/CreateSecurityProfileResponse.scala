package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the security profile.
    */
  var SecurityProfileArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the security profle.
    */
  var SecurityProfileId: js.UndefOr[typings.awsSdk.clientsConnectMod.SecurityProfileId] = js.undefined
}
object CreateSecurityProfileResponse {
  
  inline def apply(): CreateSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityProfileResponse]
  }
  
  extension [Self <: CreateSecurityProfileResponse](x: Self) {
    
    inline def setSecurityProfileArn(value: ARN): Self = StObject.set(x, "SecurityProfileArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileArnUndefined: Self = StObject.set(x, "SecurityProfileArn", js.undefined)
    
    inline def setSecurityProfileId(value: SecurityProfileId): Self = StObject.set(x, "SecurityProfileId", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileIdUndefined: Self = StObject.set(x, "SecurityProfileId", js.undefined)
  }
}
