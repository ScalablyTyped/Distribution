package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsResponse extends StObject {
  
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
}
object GetTagsResponse {
  
  inline def apply(): GetTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagsResponse]
  }
  
  extension [Self <: GetTagsResponse](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
