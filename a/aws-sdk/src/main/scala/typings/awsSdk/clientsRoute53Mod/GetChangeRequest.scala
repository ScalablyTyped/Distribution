package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeRequest extends StObject {
  
  /**
    * The ID of the change batch request. The value that you specify here is the value that ChangeResourceRecordSets returned in the Id element when you submitted the request.
    */
  var Id: ChangeId
}
object GetChangeRequest {
  
  inline def apply(Id: ChangeId): GetChangeRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChangeRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ChangeId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
