package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStageRequest extends StObject {
  
  /**
    *  A client-defined token. With an active client token in the request, this action is idempotent. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.ClientToken] = js.undefined
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StageDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    *  The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or the default role that GameSparks created. 
    */
  var Role: RoleARN
  
  /**
    * The name of the stage.
    */
  var StageName: typings.awsSdk.clientsGamesparksMod.StageName
  
  /**
    * The list of tags to apply to the stage.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateStageRequest {
  
  inline def apply(GameName: GameName, Role: RoleARN, StageName: StageName): CreateStageRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStageRequest]
  }
  
  extension [Self <: CreateStageRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: StageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setRole(value: RoleARN): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
