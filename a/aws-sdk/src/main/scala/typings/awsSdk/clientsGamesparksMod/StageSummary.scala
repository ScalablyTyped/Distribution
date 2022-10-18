package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageSummary extends StObject {
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StageDescription] = js.undefined
  
  /**
    * The game key associated with the stage.  The game key is a unique identifier that the game client uses to connect to the GameSparks backend. 
    */
  var GameKey: js.UndefOr[typings.awsSdk.clientsGamesparksMod.GameKey] = js.undefined
  
  /**
    * The name of the stage.
    */
  var Name: js.UndefOr[StageName] = js.undefined
  
  /**
    * The state of the stage.
    */
  var State: js.UndefOr[StageState] = js.undefined
  
  /**
    * The tags associated with the stage.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object StageSummary {
  
  inline def apply(): StageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageSummary]
  }
  
  extension [Self <: StageSummary](x: Self) {
    
    inline def setDescription(value: StageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameKey(value: GameKey): Self = StObject.set(x, "GameKey", value.asInstanceOf[js.Any])
    
    inline def setGameKeyUndefined: Self = StObject.set(x, "GameKey", js.undefined)
    
    inline def setName(value: StageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: StageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
