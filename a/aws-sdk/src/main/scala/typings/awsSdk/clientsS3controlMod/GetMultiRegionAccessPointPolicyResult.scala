package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointPolicyResult extends StObject {
  
  /**
    * The policy associated with the specified Multi-Region Access Point.
    */
  var Policy: js.UndefOr[MultiRegionAccessPointPolicyDocument] = js.undefined
}
object GetMultiRegionAccessPointPolicyResult {
  
  inline def apply(): GetMultiRegionAccessPointPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMultiRegionAccessPointPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMultiRegionAccessPointPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: MultiRegionAccessPointPolicyDocument): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
