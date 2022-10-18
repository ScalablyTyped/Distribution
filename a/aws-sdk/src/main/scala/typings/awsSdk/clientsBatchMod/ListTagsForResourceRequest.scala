package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the resource that tags are listed for. Batch resources that support tags are compute environments, jobs, job definitions, job queues, and scheduling policies. ARNs for child jobs of array and multi-node parallel (MNP) jobs are not supported.
    */
  var resourceArn: String
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: String): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
