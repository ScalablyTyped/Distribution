package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupValidationConfiguration extends StObject {
  
  /**
    * The ID of the server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  
  /**
    * The validation configuration.
    */
  var serverValidationConfigurations: js.UndefOr[ServerValidationConfigurations] = js.undefined
}
object ServerGroupValidationConfiguration {
  
  inline def apply(): ServerGroupValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupValidationConfiguration]
  }
  
  extension [Self <: ServerGroupValidationConfiguration](x: Self) {
    
    inline def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    inline def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    inline def setServerValidationConfigurations(value: ServerValidationConfigurations): Self = StObject.set(x, "serverValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerValidationConfigurationsUndefined: Self = StObject.set(x, "serverValidationConfigurations", js.undefined)
    
    inline def setServerValidationConfigurationsVarargs(value: ServerValidationConfiguration*): Self = StObject.set(x, "serverValidationConfigurations", js.Array(value*))
  }
}
