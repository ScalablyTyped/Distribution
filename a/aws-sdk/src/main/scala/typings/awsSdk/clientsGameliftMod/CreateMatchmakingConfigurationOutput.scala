package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMatchmakingConfigurationOutput extends StObject {
  
  /**
    * Object that describes the newly created matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
}
object CreateMatchmakingConfigurationOutput {
  
  inline def apply(): CreateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMatchmakingConfigurationOutput]
  }
  
  extension [Self <: CreateMatchmakingConfigurationOutput](x: Self) {
    
    inline def setConfiguration(value: MatchmakingConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
  }
}
