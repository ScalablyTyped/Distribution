package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForStreamOutput extends StObject {
  
  /**
    * If set to true, more tags are available. To request additional tags, set ExclusiveStartTagKey to the key of the last tag returned.
    */
  var HasMoreTags: BooleanObject
  
  /**
    * A list of tags associated with StreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit. 
    */
  var Tags: TagList
}
object ListTagsForStreamOutput {
  
  inline def apply(HasMoreTags: BooleanObject, Tags: TagList): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setHasMoreTags(value: BooleanObject): Self = StObject.set(x, "HasMoreTags", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
