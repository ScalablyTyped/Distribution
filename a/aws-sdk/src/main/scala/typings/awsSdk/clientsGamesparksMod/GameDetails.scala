package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this game.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The date when the game was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the game.
    */
  var Description: js.UndefOr[GameDescription] = js.undefined
  
  /**
    * Determines if the game can be deleted.
    */
  var EnableTerminationProtection: js.UndefOr[GameTerminationProtection] = js.undefined
  
  /**
    * The date when the game was last modified.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
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
object GameDetails {
  
  inline def apply(): GameDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDescription(value: GameDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnableTerminationProtection(value: GameTerminationProtection): Self = StObject.set(x, "EnableTerminationProtection", value.asInstanceOf[js.Any])
    
    inline def setEnableTerminationProtectionUndefined: Self = StObject.set(x, "EnableTerminationProtection", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setName(value: GameName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: GameState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
