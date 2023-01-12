package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusReport extends StObject {
  
  /**
    * The date and time that the health checker performed the health check in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var CheckedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the status of the health check endpoint as reported by one of the Amazon Route 53 health checkers.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsRoute53Mod.Status] = js.undefined
}
object StatusReport {
  
  inline def apply(): StatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusReport] (val x: Self) extends AnyVal {
    
    inline def setCheckedTime(value: js.Date): Self = StObject.set(x, "CheckedTime", value.asInstanceOf[js.Any])
    
    inline def setCheckedTimeUndefined: Self = StObject.set(x, "CheckedTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
