package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourcesResponse extends StObject {
  
  /**
    * 
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object ListTagsForResourcesResponse {
  
  inline def apply(): ListTagsForResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourcesResponse]
  }
  
  extension [Self <: ListTagsForResourcesResponse](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
