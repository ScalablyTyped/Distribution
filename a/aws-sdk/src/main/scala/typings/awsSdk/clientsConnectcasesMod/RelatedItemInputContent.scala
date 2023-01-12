package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItemInputContent extends StObject {
  
  /**
    * Represents the content of a comment to be returned to agents.
    */
  var comment: js.UndefOr[CommentContent] = js.undefined
  
  /**
    * Object representing a contact in Amazon Connect as an API request field.
    */
  var contact: js.UndefOr[Contact] = js.undefined
}
object RelatedItemInputContent {
  
  inline def apply(): RelatedItemInputContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedItemInputContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedItemInputContent] (val x: Self) extends AnyVal {
    
    inline def setComment(value: CommentContent): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
  }
}
