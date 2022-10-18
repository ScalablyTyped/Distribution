package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventConfigurationsRequest extends StObject {
  
  /**
    * The new event configuration values.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
}
object UpdateEventConfigurationsRequest {
  
  inline def apply(): UpdateEventConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventConfigurationsRequest]
  }
  
  extension [Self <: UpdateEventConfigurationsRequest](x: Self) {
    
    inline def setEventConfigurations(value: EventConfigurations): Self = StObject.set(x, "eventConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEventConfigurationsUndefined: Self = StObject.set(x, "eventConfigurations", js.undefined)
  }
}
