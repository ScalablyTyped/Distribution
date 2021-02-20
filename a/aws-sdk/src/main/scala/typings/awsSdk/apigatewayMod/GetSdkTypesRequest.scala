package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSdkTypesRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}
object GetSdkTypesRequest {
  
  @scala.inline
  def apply(): GetSdkTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSdkTypesRequest]
  }
  
  @scala.inline
  implicit class GetSdkTypesRequestMutableBuilder[Self <: GetSdkTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
