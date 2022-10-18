package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItemTypeFilter extends StObject {
  
  /**
    * A filter for related items of type Comment.
    */
  var comment: js.UndefOr[CommentFilter] = js.undefined
  
  /**
    * A filter for related items of type Contact.
    */
  var contact: js.UndefOr[ContactFilter] = js.undefined
}
object RelatedItemTypeFilter {
  
  inline def apply(): RelatedItemTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedItemTypeFilter]
  }
  
  extension [Self <: RelatedItemTypeFilter](x: Self) {
    
    inline def setComment(value: CommentFilter): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContact(value: ContactFilter): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
  }
}
