package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsResponse extends StObject {
  
  /**
    *  List of Tag for the requested Elasticsearch domain.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsEsMod.TagList] = js.undefined
}
object ListTagsResponse {
  
  inline def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsResponse] (val x: Self) extends AnyVal {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
