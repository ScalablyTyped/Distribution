package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStageRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The name of the stage to delete.
    */
  var StageName: typings.awsSdk.clientsGamesparksMod.StageName
}
object DeleteStageRequest {
  
  inline def apply(GameName: GameName, StageName: StageName): DeleteStageRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStageRequest] (val x: Self) extends AnyVal {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
