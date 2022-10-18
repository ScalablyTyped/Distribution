package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointServicePayerResponsibilityResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object ModifyVpcEndpointServicePayerResponsibilityResult {
  
  inline def apply(): ModifyVpcEndpointServicePayerResponsibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcEndpointServicePayerResponsibilityResult]
  }
  
  extension [Self <: ModifyVpcEndpointServicePayerResponsibilityResult](x: Self) {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
