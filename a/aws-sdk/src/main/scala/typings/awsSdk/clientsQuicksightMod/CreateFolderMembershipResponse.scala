package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderMembershipResponse extends StObject {
  
  /**
    * Information about the member in the folder.
    */
  var FolderMember: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FolderMember] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object CreateFolderMembershipResponse {
  
  inline def apply(): CreateFolderMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolderMembershipResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFolderMembershipResponse] (val x: Self) extends AnyVal {
    
    inline def setFolderMember(value: FolderMember): Self = StObject.set(x, "FolderMember", value.asInstanceOf[js.Any])
    
    inline def setFolderMemberUndefined: Self = StObject.set(x, "FolderMember", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
