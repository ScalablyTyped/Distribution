package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningPlatformRequest extends StObject {
  
  /**
    * The ID of the target signing platform.
    */
  var platformId: PlatformId
}
object GetSigningPlatformRequest {
  
  inline def apply(platformId: PlatformId): GetSigningPlatformRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningPlatformRequest]
  }
  
  extension [Self <: GetSigningPlatformRequest](x: Self) {
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
  }
}
