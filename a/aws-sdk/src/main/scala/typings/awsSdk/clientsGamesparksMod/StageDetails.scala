package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stage.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The timestamp of when the stage was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StageDescription] = js.undefined
  
  /**
    * The game key associated with the stage.  The game key is a unique identifier that the game client uses to connect to the GameSparks backend. 
    */
  var GameKey: js.UndefOr[typings.awsSdk.clientsGamesparksMod.GameKey] = js.undefined
  
  /**
    * The timestamp of when the stage was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon CloudWatch log group for game runtimes deployed to the stage.
    */
  var LogGroup: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The name of the stage.
    */
  var Name: js.UndefOr[StageName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
    */
  var Role: js.UndefOr[RoleARN] = js.undefined
  
  /**
    * The state of the stage.
    */
  var State: js.UndefOr[StageState] = js.undefined
  
  /**
    * The tags associated with the stage.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object StageDetails {
  
  inline def apply(): StageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StageDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDescription(value: StageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameKey(value: GameKey): Self = StObject.set(x, "GameKey", value.asInstanceOf[js.Any])
    
    inline def setGameKeyUndefined: Self = StObject.set(x, "GameKey", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setLogGroup(value: LogGroupName): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    inline def setName(value: StageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRole(value: RoleARN): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setState(value: StageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
