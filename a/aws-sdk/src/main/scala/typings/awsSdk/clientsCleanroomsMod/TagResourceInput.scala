package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the resource you want to tag.
    */
  var resourceArn: CleanroomsArn
  
  /**
    * A map of objects specifying each key name and value.
    */
  var tags: TagMap
}
object TagResourceInput {
  
  inline def apply(resourceArn: CleanroomsArn, tags: TagMap): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: CleanroomsArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
