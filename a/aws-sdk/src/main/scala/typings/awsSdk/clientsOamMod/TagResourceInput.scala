package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The ARN of the resource that you're adding tags to. The ARN format of a sink is arn:aws:oam:Region:account-id:sink/sink-id   The ARN format of a link is arn:aws:oam:Region:account-id:link/link-id   For more information about ARN format, see CloudWatch Logs resources and operations.
    */
  var ResourceArn: Arn
  
  /**
    * The list of key-value pairs to associate with the resource.
    */
  var Tags: TagMapInput
}
object TagResourceInput {
  
  inline def apply(ResourceArn: Arn, Tags: TagMapInput): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMapInput): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
