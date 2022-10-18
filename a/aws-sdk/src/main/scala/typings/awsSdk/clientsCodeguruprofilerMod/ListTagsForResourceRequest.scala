package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource that contains the tags to return. 
    */
  var resourceArn: ProfilingGroupArn
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: ProfilingGroupArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ProfilingGroupArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
