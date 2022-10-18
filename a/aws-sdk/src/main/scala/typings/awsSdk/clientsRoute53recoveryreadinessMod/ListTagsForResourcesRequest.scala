package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourcesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for a resource.
    */
  var ResourceArn: string
}
object ListTagsForResourcesRequest {
  
  inline def apply(ResourceArn: string): ListTagsForResourcesRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourcesRequest]
  }
  
  extension [Self <: ListTagsForResourcesRequest](x: Self) {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
