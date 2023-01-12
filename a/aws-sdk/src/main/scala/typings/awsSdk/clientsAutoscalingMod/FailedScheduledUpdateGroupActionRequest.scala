package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedScheduledUpdateGroupActionRequest extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.undefined
  
  /**
    * The error message accompanying the error code.
    */
  var ErrorMessage: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: XmlStringMaxLen255
}
object FailedScheduledUpdateGroupActionRequest {
  
  inline def apply(ScheduledActionName: XmlStringMaxLen255): FailedScheduledUpdateGroupActionRequest = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedScheduledUpdateGroupActionRequest] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: XmlStringMaxLen64): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: XmlString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setScheduledActionName(value: XmlStringMaxLen255): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
  }
}
