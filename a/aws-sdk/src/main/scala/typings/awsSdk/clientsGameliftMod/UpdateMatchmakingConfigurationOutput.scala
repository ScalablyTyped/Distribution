package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMatchmakingConfigurationOutput extends StObject {
  
  /**
    * The updated matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
}
object UpdateMatchmakingConfigurationOutput {
  
  inline def apply(): UpdateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMatchmakingConfigurationOutput]
  }
  
  extension [Self <: UpdateMatchmakingConfigurationOutput](x: Self) {
    
    inline def setConfiguration(value: MatchmakingConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
  }
}
