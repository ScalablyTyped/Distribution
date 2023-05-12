package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForDomainResponse extends StObject {
  
  /**
    * A list of the tags that are associated with the specified domain.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.TagList] = js.undefined
}
object ListTagsForDomainResponse {
  
  inline def apply(): ListTagsForDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
