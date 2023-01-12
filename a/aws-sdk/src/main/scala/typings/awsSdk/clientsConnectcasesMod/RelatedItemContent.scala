package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItemContent extends StObject {
  
  /**
    * Represents the content of a comment to be returned to agents.
    */
  var comment: js.UndefOr[CommentContent] = js.undefined
  
  /**
    * Represents the content of a contact to be returned to agents.
    */
  var contact: js.UndefOr[ContactContent] = js.undefined
}
object RelatedItemContent {
  
  inline def apply(): RelatedItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedItemContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedItemContent] (val x: Self) extends AnyVal {
    
    inline def setComment(value: CommentContent): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContact(value: ContactContent): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
  }
}
