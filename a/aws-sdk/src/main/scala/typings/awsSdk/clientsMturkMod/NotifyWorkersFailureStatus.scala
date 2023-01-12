package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyWorkersFailureStatus extends StObject {
  
  /**
    *  Encoded value for the failure type. 
    */
  var NotifyWorkersFailureCode: js.UndefOr[typings.awsSdk.clientsMturkMod.NotifyWorkersFailureCode] = js.undefined
  
  /**
    *  A message detailing the reason the Worker could not be notified. 
    */
  var NotifyWorkersFailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the Worker.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object NotifyWorkersFailureStatus {
  
  inline def apply(): NotifyWorkersFailureStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWorkersFailureStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyWorkersFailureStatus] (val x: Self) extends AnyVal {
    
    inline def setNotifyWorkersFailureCode(value: NotifyWorkersFailureCode): Self = StObject.set(x, "NotifyWorkersFailureCode", value.asInstanceOf[js.Any])
    
    inline def setNotifyWorkersFailureCodeUndefined: Self = StObject.set(x, "NotifyWorkersFailureCode", js.undefined)
    
    inline def setNotifyWorkersFailureMessage(value: String): Self = StObject.set(x, "NotifyWorkersFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setNotifyWorkersFailureMessageUndefined: Self = StObject.set(x, "NotifyWorkersFailureMessage", js.undefined)
    
    inline def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
