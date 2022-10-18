package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentVersion extends StObject {
  
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  
  /**
    * The agent version.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object AgentVersion {
  
  inline def apply(): AgentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentVersion]
  }
  
  extension [Self <: AgentVersion](x: Self) {
    
    inline def setConfigurationManager(value: StackConfigurationManager): Self = StObject.set(x, "ConfigurationManager", value.asInstanceOf[js.Any])
    
    inline def setConfigurationManagerUndefined: Self = StObject.set(x, "ConfigurationManager", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
