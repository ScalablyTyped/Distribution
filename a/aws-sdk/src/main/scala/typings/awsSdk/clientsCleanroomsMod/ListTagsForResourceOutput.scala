package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceOutput extends StObject {
  
  /**
    * A map of objects specifying each key name and value.
    */
  var tags: TagMap
}
object ListTagsForResourceOutput {
  
  inline def apply(tags: TagMap): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
