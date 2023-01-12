package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEntityResponse extends StObject {
  
  /**
    * The ARN of the entity.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time when the entity was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The ID of the entity.
    */
  var entityId: EntityId
  
  /**
    * The current state of the entity.
    */
  var state: State
}
object CreateEntityResponse {
  
  inline def apply(arn: TwinMakerArn, creationDateTime: js.Date, entityId: EntityId, state: State): CreateEntityResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEntityResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
