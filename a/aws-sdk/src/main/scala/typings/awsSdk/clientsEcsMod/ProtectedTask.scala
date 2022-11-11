package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedTask extends StObject {
  
  /**
    * The epoch time when protection for the task will expire.
    */
  var expirationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The protection status of the task. If scale-in protection is enabled for a task, the value is true. Otherwise, it is false.
    */
  var protectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The task ARN.
    */
  var taskArn: js.UndefOr[String] = js.undefined
}
object ProtectedTask {
  
  inline def apply(): ProtectedTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedTask]
  }
  
  extension [Self <: ProtectedTask](x: Self) {
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setProtectionEnabled(value: Boolean): Self = StObject.set(x, "protectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setProtectionEnabledUndefined: Self = StObject.set(x, "protectionEnabled", js.undefined)
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
  }
}
