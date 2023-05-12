package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The ARN of the resource that you want to view tags for. The ARN format of a sink is arn:aws:oam:Region:account-id:sink/sink-id   The ARN format of a link is arn:aws:oam:Region:account-id:link/link-id   For more information about ARN format, see CloudWatch Logs resources and operations.  Unlike tagging permissions in other Amazon Web Services services, to retrieve the list of tags for links or sinks you must have the oam:RequestTag permission. The aws:ReguestTag permission does not allow you to tag and untag links and sinks. 
    */
  var ResourceArn: Arn
}
object ListTagsForResourceInput {
  
  inline def apply(ResourceArn: Arn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
