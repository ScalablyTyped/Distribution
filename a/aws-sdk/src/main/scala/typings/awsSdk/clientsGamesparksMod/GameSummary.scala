package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameSummary extends StObject {
  
  /**
    * The description of the game.
    */
  var Description: js.UndefOr[GameDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var Name: js.UndefOr[GameName] = js.undefined
  
  /**
    * The state of the game.
    */
  var State: js.UndefOr[GameState] = js.undefined
  
  /**
    * The tags associated with the game.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object GameSummary {
  
  inline def apply(): GameSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: GameDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: GameName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: GameState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
