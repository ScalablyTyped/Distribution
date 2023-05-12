package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertyValueRequest extends StObject {
  
  /**
    * The name of the component whose property values the operation returns.
    */
  var componentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the component type whose property values the operation returns.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The ID of the entity whose property values the operation returns.
    */
  var entityId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The maximum number of results to return at one time. The default is 25. Valid Range: Minimum value of 1. Maximum value of 250.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The property group name.
    */
  var propertyGroupName: js.UndefOr[Name] = js.undefined
  
  /**
    * The properties whose values the operation returns.
    */
  var selectedProperties: SelectedPropertyList
  
  /**
    * The tabular conditions.
    */
  var tabularConditions: js.UndefOr[TabularConditions] = js.undefined
  
  /**
    * The ID of the workspace whose values the operation returns.
    */
  var workspaceId: Id
}
object GetPropertyValueRequest {
  
  inline def apply(selectedProperties: SelectedPropertyList, workspaceId: Id): GetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(selectedProperties = selectedProperties.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyValueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPropertyValueRequest] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: Name): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPropertyGroupName(value: Name): Self = StObject.set(x, "propertyGroupName", value.asInstanceOf[js.Any])
    
    inline def setPropertyGroupNameUndefined: Self = StObject.set(x, "propertyGroupName", js.undefined)
    
    inline def setSelectedProperties(value: SelectedPropertyList): Self = StObject.set(x, "selectedProperties", value.asInstanceOf[js.Any])
    
    inline def setSelectedPropertiesVarargs(value: String*): Self = StObject.set(x, "selectedProperties", js.Array(value*))
    
    inline def setTabularConditions(value: TabularConditions): Self = StObject.set(x, "tabularConditions", value.asInstanceOf[js.Any])
    
    inline def setTabularConditionsUndefined: Self = StObject.set(x, "tabularConditions", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
