package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameConfigurationRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The list of modifications to make.
    */
  var Modifications: SectionModificationList
}
object UpdateGameConfigurationRequest {
  
  inline def apply(GameName: GameName, Modifications: SectionModificationList): UpdateGameConfigurationRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], Modifications = Modifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameConfigurationRequest]
  }
  
  extension [Self <: UpdateGameConfigurationRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setModifications(value: SectionModificationList): Self = StObject.set(x, "Modifications", value.asInstanceOf[js.Any])
    
    inline def setModificationsVarargs(value: SectionModification*): Self = StObject.set(x, "Modifications", js.Array(value*))
  }
}
