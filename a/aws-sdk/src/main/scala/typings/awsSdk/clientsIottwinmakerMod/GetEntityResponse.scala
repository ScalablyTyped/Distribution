package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEntityResponse extends StObject {
  
  /**
    * The ARN of the entity.
    */
  var arn: TwinMakerArn
  
  /**
    * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this object.
    */
  var components: js.UndefOr[ComponentsMap] = js.undefined
  
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
    * A Boolean value that specifies whether the entity has associated child entities.
    */
  var hasChildEntities: Boolean
  
  /**
    * The ID of the parent entity for this entity.
    */
  var parentEntityId: ParentEntityId
  
  /**
    * The current status of the entity.
    */
  var status: Status
  
  /**
    * The date and time when the entity was last updated.
    */
  var updateDateTime: js.Date
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object GetEntityResponse {
  
  inline def apply(
    arn: TwinMakerArn,
    creationDateTime: js.Date,
    entityId: EntityId,
    entityName: EntityName,
    hasChildEntities: Boolean,
    parentEntityId: ParentEntityId,
    status: Status,
    updateDateTime: js.Date,
    workspaceId: Id
  ): GetEntityResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], hasChildEntities = hasChildEntities.asInstanceOf[js.Any], parentEntityId = parentEntityId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntityResponse]
  }
  
  extension [Self <: GetEntityResponse](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: ComponentsMap): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityName(value: EntityName): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setHasChildEntities(value: Boolean): Self = StObject.set(x, "hasChildEntities", value.asInstanceOf[js.Any])
    
    inline def setParentEntityId(value: ParentEntityId): Self = StObject.set(x, "parentEntityId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
