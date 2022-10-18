package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppMonitorResponse extends StObject {
  
  /**
    * The unique ID of the new app monitor.
    */
  var Id: js.UndefOr[AppMonitorId] = js.undefined
}
object CreateAppMonitorResponse {
  
  inline def apply(): CreateAppMonitorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppMonitorResponse]
  }
  
  extension [Self <: CreateAppMonitorResponse](x: Self) {
    
    inline def setId(value: AppMonitorId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
