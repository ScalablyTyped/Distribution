package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameConfigurationRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The list of sections to return.
    */
  var Sections: js.UndefOr[SectionList] = js.undefined
}
object GetGameConfigurationRequest {
  
  inline def apply(GameName: GameName): GetGameConfigurationRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameConfigurationRequest]
  }
  
  extension [Self <: GetGameConfigurationRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setSections(value: SectionList): Self = StObject.set(x, "Sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "Sections", js.undefined)
    
    inline def setSectionsVarargs(value: SectionName*): Self = StObject.set(x, "Sections", js.Array(value*))
  }
}
