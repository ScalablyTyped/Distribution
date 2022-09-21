package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBackendConfigResponse extends StObject {
  
  /**
    * If the request fails, this error is returned.
    */
  var Error: js.UndefOr[string] = js.undefined
}
object RemoveBackendConfigResponse {
  
  inline def apply(): RemoveBackendConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveBackendConfigResponse]
  }
  
  extension [Self <: RemoveBackendConfigResponse](x: Self) {
    
    inline def setError(value: string): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
