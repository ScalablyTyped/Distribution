package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRestApisRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
}
object GetRestApisRequest {
  
  inline def apply(): GetRestApisRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRestApisRequest]
  }
  
  extension [Self <: GetRestApisRequest](x: Self) {
    
    inline def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
