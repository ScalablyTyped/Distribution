package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiKeysRequest extends StObject {
  
  /**
    * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains key values.
    */
  var includeValues: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The name of queried API keys.
    */
  var nameQuery: js.UndefOr[String] = js.native
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}
object GetApiKeysRequest {
  
  @scala.inline
  def apply(): GetApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiKeysRequest]
  }
  
  @scala.inline
  implicit class GetApiKeysRequestMutableBuilder[Self <: GetApiKeysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setIncludeValues(value: NullableBoolean): Self = StObject.set(x, "includeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValuesUndefined: Self = StObject.set(x, "includeValues", js.undefined)
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNameQuery(value: String): Self = StObject.set(x, "nameQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameQueryUndefined: Self = StObject.set(x, "nameQuery", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
