package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStageRequest extends StObject {
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StageDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The Amazon Resource Name (ARN) of the role to use for the game snapshots deployed to this stage.
    */
  var Role: js.UndefOr[RoleARN] = js.undefined
  
  /**
    * The name of the stage.
    */
  var StageName: typings.awsSdk.clientsGamesparksMod.StageName
}
object UpdateStageRequest {
  
  inline def apply(GameName: GameName, StageName: StageName): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStageRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: StageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setRole(value: RoleARN): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
