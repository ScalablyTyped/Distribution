package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiKeysRequest extends StObject {
  
  /**
    * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains key values.
    */
  var includeValues: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The name of queried API keys.
    */
  var nameQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
}
object GetApiKeysRequest {
  
  inline def apply(): GetApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiKeysRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApiKeysRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setIncludeValues(value: NullableBoolean): Self = StObject.set(x, "includeValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeValuesUndefined: Self = StObject.set(x, "includeValues", js.undefined)
    
    inline def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNameQuery(value: String): Self = StObject.set(x, "nameQuery", value.asInstanceOf[js.Any])
    
    inline def setNameQueryUndefined: Self = StObject.set(x, "nameQuery", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
