package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportGameConfigurationResult extends StObject {
  
  /**
    * Details about the game configuration.
    */
  var GameConfiguration: js.UndefOr[GameConfigurationDetails] = js.undefined
}
object ImportGameConfigurationResult {
  
  inline def apply(): ImportGameConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportGameConfigurationResult]
  }
  
  extension [Self <: ImportGameConfigurationResult](x: Self) {
    
    inline def setGameConfiguration(value: GameConfigurationDetails): Self = StObject.set(x, "GameConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGameConfigurationUndefined: Self = StObject.set(x, "GameConfiguration", js.undefined)
  }
}
