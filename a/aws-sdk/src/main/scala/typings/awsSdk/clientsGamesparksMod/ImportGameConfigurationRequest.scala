package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportGameConfigurationRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The source used to import configuration sections.
    */
  var ImportSource: ImportGameConfigurationSource
}
object ImportGameConfigurationRequest {
  
  inline def apply(GameName: GameName, ImportSource: ImportGameConfigurationSource): ImportGameConfigurationRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], ImportSource = ImportSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportGameConfigurationRequest]
  }
  
  extension [Self <: ImportGameConfigurationRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setImportSource(value: ImportGameConfigurationSource): Self = StObject.set(x, "ImportSource", value.asInstanceOf[js.Any])
  }
}
