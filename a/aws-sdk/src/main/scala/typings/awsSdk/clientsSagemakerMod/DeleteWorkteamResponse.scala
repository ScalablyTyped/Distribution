package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkteamResponse extends StObject {
  
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typings.awsSdk.clientsSagemakerMod.Success
}
object DeleteWorkteamResponse {
  
  inline def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkteamResponse] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
