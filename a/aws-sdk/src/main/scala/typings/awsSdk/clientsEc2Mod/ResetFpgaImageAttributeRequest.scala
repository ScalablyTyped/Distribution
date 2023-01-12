package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetFpgaImageAttributeRequest extends StObject {
  
  /**
    * The attribute.
    */
  var Attribute: js.UndefOr[ResetFpgaImageAttributeName] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.clientsEc2Mod.FpgaImageId
}
object ResetFpgaImageAttributeRequest {
  
  inline def apply(FpgaImageId: FpgaImageId): ResetFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetFpgaImageAttributeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: ResetFpgaImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFpgaImageId(value: FpgaImageId): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
  }
}
