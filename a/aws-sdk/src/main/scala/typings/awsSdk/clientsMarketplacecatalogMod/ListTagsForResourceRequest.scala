package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * Required. The Amazon Resource Name (ARN) associated with the resource you want to list tags on.
    */
  var ResourceArn: ResourceARN
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceArn: ResourceARN): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
