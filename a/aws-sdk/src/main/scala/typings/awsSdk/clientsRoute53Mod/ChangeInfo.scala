package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeInfo extends StObject {
  
  /**
    * A comment you can provide.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
    */
  var Id: ResourceId
  
  /**
    * The current state of the request. PENDING indicates that this request has not yet been applied to all Amazon Route 53 DNS servers.
    */
  var Status: ChangeStatus
  
  /**
    * The date and time that the change request was submitted in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var SubmittedAt: js.Date
}
object ChangeInfo {
  
  inline def apply(Id: ResourceId, Status: ChangeStatus, SubmittedAt: js.Date): ChangeInfo = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeInfo] (val x: Self) extends AnyVal {
    
    inline def setComment(value: ResourceDescription): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ChangeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setSubmittedAt(value: js.Date): Self = StObject.set(x, "SubmittedAt", value.asInstanceOf[js.Any])
  }
}
