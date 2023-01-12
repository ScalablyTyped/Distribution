package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardError extends StObject {
  
  /**
    * Message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Type.
    */
  var Type: js.UndefOr[DashboardErrorType] = js.undefined
}
object DashboardError {
  
  inline def apply(): DashboardError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: DashboardErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
