package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyResult extends StObject {
  
  /**
    * The access point policy associated with the specified access point.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsS3controlMod.Policy] = js.undefined
}
object GetAccessPointPolicyResult {
  
  inline def apply(): GetAccessPointPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessPointPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
