package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the resource you want to list tags on.
    */
  var resourceArn: CleanroomsArn
}
object ListTagsForResourceInput {
  
  inline def apply(resourceArn: CleanroomsArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: CleanroomsArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
