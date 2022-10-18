package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestValidatorsRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetRequestValidatorsRequest {
  
  inline def apply(restApiId: String): GetRequestValidatorsRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestValidatorsRequest]
  }
  
  extension [Self <: GetRequestValidatorsRequest](x: Self) {
    
    inline def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
