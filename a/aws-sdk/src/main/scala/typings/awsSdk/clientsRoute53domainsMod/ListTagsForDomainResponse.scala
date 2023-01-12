package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForDomainResponse extends StObject {
  
  /**
    * A list of the tags that are associated with the specified domain.
    */
  var TagList: typings.awsSdk.clientsRoute53domainsMod.TagList
}
object ListTagsForDomainResponse {
  
  inline def apply(TagList: TagList): ListTagsForDomainResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
