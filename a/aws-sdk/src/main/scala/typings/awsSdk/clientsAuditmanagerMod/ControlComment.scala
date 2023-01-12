package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlComment extends StObject {
  
  /**
    *  The name of the user who authored the comment. 
    */
  var authorName: js.UndefOr[Username] = js.undefined
  
  /**
    *  The body text of a control comment. 
    */
  var commentBody: js.UndefOr[ControlCommentBody] = js.undefined
  
  /**
    *  The time when the comment was posted. 
    */
  var postedDate: js.UndefOr[js.Date] = js.undefined
}
object ControlComment {
  
  inline def apply(): ControlComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlComment] (val x: Self) extends AnyVal {
    
    inline def setAuthorName(value: Username): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setCommentBody(value: ControlCommentBody): Self = StObject.set(x, "commentBody", value.asInstanceOf[js.Any])
    
    inline def setCommentBodyUndefined: Self = StObject.set(x, "commentBody", js.undefined)
    
    inline def setPostedDate(value: js.Date): Self = StObject.set(x, "postedDate", value.asInstanceOf[js.Any])
    
    inline def setPostedDateUndefined: Self = StObject.set(x, "postedDate", js.undefined)
  }
}
