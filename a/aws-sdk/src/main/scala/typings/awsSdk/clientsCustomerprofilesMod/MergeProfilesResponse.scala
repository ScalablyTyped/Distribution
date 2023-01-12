package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeProfilesResponse extends StObject {
  
  /**
    * A message that indicates the merge request is complete.
    */
  var Message: js.UndefOr[message] = js.undefined
}
object MergeProfilesResponse {
  
  inline def apply(): MergeProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
