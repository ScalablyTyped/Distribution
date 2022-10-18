package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryTriggersOutput extends StObject {
  
  /**
    * The system-generated unique ID for the trigger.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
  
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: js.UndefOr[RepositoryTriggersList] = js.undefined
}
object GetRepositoryTriggersOutput {
  
  inline def apply(): GetRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryTriggersOutput]
  }
  
  extension [Self <: GetRepositoryTriggersOutput](x: Self) {
    
    inline def setConfigurationId(value: RepositoryTriggersConfigurationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    
    inline def setTriggers(value: RepositoryTriggersList): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: RepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
  }
}
