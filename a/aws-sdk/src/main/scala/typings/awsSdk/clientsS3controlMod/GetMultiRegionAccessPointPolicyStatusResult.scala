package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointPolicyStatusResult extends StObject {
  
  var Established: js.UndefOr[PolicyStatus] = js.undefined
}
object GetMultiRegionAccessPointPolicyStatusResult {
  
  inline def apply(): GetMultiRegionAccessPointPolicyStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMultiRegionAccessPointPolicyStatusResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMultiRegionAccessPointPolicyStatusResult] (val x: Self) extends AnyVal {
    
    inline def setEstablished(value: PolicyStatus): Self = StObject.set(x, "Established", value.asInstanceOf[js.Any])
    
    inline def setEstablishedUndefined: Self = StObject.set(x, "Established", js.undefined)
  }
}
