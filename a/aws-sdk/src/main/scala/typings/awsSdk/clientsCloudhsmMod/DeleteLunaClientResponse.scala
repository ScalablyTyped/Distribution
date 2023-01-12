package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLunaClientResponse extends StObject {
  
  /**
    * The status of the action.
    */
  var Status: String
}
object DeleteLunaClientResponse {
  
  inline def apply(Status: String): DeleteLunaClientResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLunaClientResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLunaClientResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
