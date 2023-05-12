package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessEndpointResult extends StObject {
  
  /**
    * The Verified Access endpoint details.
    */
  var VerifiedAccessEndpoint: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessEndpoint] = js.undefined
}
object ModifyVerifiedAccessEndpointResult {
  
  inline def apply(): ModifyVerifiedAccessEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessEndpointResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessEndpointResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessEndpoint(value: VerifiedAccessEndpoint): Self = StObject.set(x, "VerifiedAccessEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessEndpointUndefined: Self = StObject.set(x, "VerifiedAccessEndpoint", js.undefined)
  }
}
