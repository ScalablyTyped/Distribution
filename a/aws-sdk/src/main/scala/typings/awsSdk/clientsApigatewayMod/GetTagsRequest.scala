package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsRequest extends StObject {
  
  /**
    * (Not currently supported) The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * (Not currently supported) The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of a resource that can be tagged.
    */
  var resourceArn: String
}
object GetTagsRequest {
  
  inline def apply(resourceArn: String): GetTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
  
  extension [Self <: GetTagsRequest](x: Self) {
    
    inline def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
