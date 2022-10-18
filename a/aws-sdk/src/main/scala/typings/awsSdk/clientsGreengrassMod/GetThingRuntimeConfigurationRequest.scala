package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThingRuntimeConfigurationRequest extends StObject {
  
  /**
    * The thing name.
    */
  var ThingName: string
}
object GetThingRuntimeConfigurationRequest {
  
  inline def apply(ThingName: string): GetThingRuntimeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThingRuntimeConfigurationRequest]
  }
  
  extension [Self <: GetThingRuntimeConfigurationRequest](x: Self) {
    
    inline def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}
