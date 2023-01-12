package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameRequest extends StObject {
  
  /**
    *  A client-defined token. With an active client token in the request, this action is idempotent. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.ClientToken] = js.undefined
  
  /**
    * The description of the game.
    */
  var Description: js.UndefOr[GameDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The list of tags to apply to the game.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateGameRequest {
  
  inline def apply(GameName: GameName): CreateGameRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGameRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: GameDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
