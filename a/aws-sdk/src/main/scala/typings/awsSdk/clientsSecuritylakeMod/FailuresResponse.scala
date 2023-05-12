package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailuresResponse extends StObject {
  
  /**
    * List of all failures. 
    */
  var failures: js.UndefOr[Failureslist] = js.undefined
  
  /**
    * List of Amazon Web Services Regions where the failure occurred. 
    */
  var region: js.UndefOr[SafeString] = js.undefined
}
object FailuresResponse {
  
  inline def apply(): FailuresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailuresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailuresResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: Failureslist): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failures*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setRegion(value: SafeString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
