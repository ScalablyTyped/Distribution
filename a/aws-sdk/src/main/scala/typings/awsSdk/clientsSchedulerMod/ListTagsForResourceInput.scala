package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The ARN of the EventBridge Scheduler resource for which you want to view tags.
    */
  var ResourceArn: TagResourceArn
}
object ListTagsForResourceInput {
  
  inline def apply(ResourceArn: TagResourceArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: TagResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
