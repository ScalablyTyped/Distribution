package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitySummary extends StObject {
  
  /**
    * The ARN of the entity.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time when the entity was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The description of the entity.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the entity.
    */
  var entityId: EntityId
  
  /**
    * The name of the entity.
    */
  var entityName: EntityName
  
  /**
    * A Boolean value that specifies whether the entity has child entities or not.
    */
  var hasChildEntities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the parent entity.
    */
  var parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
  
  /**
    * The current status of the entity.
    */
  var status: Status
  
  /**
    * The last date and time when the entity was updated.
    */
  var updateDateTime: js.Date
}
object EntitySummary {
  
  inline def apply(
    arn: TwinMakerArn,
    creationDateTime: js.Date,
    entityId: EntityId,
    entityName: EntityName,
    status: Status,
    updateDateTime: js.Date
  ): EntitySummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntitySummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityName(value: EntityName): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setHasChildEntities(value: Boolean): Self = StObject.set(x, "hasChildEntities", value.asInstanceOf[js.Any])
    
    inline def setHasChildEntitiesUndefined: Self = StObject.set(x, "hasChildEntities", js.undefined)
    
    inline def setParentEntityId(value: ParentEntityId): Self = StObject.set(x, "parentEntityId", value.asInstanceOf[js.Any])
    
    inline def setParentEntityIdUndefined: Self = StObject.set(x, "parentEntityId", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
  }
}
