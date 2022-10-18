package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var ResourceARN: ChimeArn
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceARN: ChimeArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceARN(value: ChimeArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
