package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessEndpointResult extends StObject {
  
  /**
    * The ID of the Verified Access endpoint.
    */
  var VerifiedAccessEndpoint: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessEndpoint] = js.undefined
}
object CreateVerifiedAccessEndpointResult {
  
  inline def apply(): CreateVerifiedAccessEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessEndpointResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessEndpointResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessEndpoint(value: VerifiedAccessEndpoint): Self = StObject.set(x, "VerifiedAccessEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessEndpointUndefined: Self = StObject.set(x, "VerifiedAccessEndpoint", js.undefined)
  }
}
