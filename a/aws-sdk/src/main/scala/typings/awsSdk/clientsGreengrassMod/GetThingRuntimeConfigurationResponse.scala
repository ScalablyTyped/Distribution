package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThingRuntimeConfigurationResponse extends StObject {
  
  /**
    * Runtime configuration for a thing.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.clientsGreengrassMod.RuntimeConfiguration] = js.undefined
}
object GetThingRuntimeConfigurationResponse {
  
  inline def apply(): GetThingRuntimeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThingRuntimeConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetThingRuntimeConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}
