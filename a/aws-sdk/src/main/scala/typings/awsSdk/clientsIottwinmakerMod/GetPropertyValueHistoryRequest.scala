package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertyValueHistoryRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The date and time of the latest property value to return.
    */
  var endDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ISO8601 DateTime of the latest property value to return. For more information about the ISO8601 DateTime format, see the data type PropertyValue.
    */
  var endTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The ID of the entity.
    */
  var entityId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * An object that specifies the interpolation type and the interval over which to interpolate data.
    */
  var interpolation: js.UndefOr[InterpolationParameters] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The time direction to use in the result order.
    */
  var orderByTime: js.UndefOr[OrderByTime] = js.undefined
  
  /**
    * A list of objects that filter the property value history request.
    */
  var propertyFilters: js.UndefOr[PropertyFilters] = js.undefined
  
  /**
    * A list of properties whose value histories the request retrieves.
    */
  var selectedProperties: SelectedPropertyList
  
  /**
    * The date and time of the earliest property value to return.
    */
  var startDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ISO8601 DateTime of the earliest property value to return. For more information about the ISO8601 DateTime format, see the data type PropertyValue.
    */
  var startTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object GetPropertyValueHistoryRequest {
  
  inline def apply(selectedProperties: SelectedPropertyList, workspaceId: Id): GetPropertyValueHistoryRequest = {
    val __obj = js.Dynamic.literal(selectedProperties = selectedProperties.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyValueHistoryRequest]
  }
  
  extension [Self <: GetPropertyValueHistoryRequest](x: Self) {
    
    inline def setComponentName(value: Name): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setEndTime(value: Time): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setInterpolation(value: InterpolationParameters): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrderByTime(value: OrderByTime): Self = StObject.set(x, "orderByTime", value.asInstanceOf[js.Any])
    
    inline def setOrderByTimeUndefined: Self = StObject.set(x, "orderByTime", js.undefined)
    
    inline def setPropertyFilters(value: PropertyFilters): Self = StObject.set(x, "propertyFilters", value.asInstanceOf[js.Any])
    
    inline def setPropertyFiltersUndefined: Self = StObject.set(x, "propertyFilters", js.undefined)
    
    inline def setPropertyFiltersVarargs(value: PropertyFilter*): Self = StObject.set(x, "propertyFilters", js.Array(value*))
    
    inline def setSelectedProperties(value: SelectedPropertyList): Self = StObject.set(x, "selectedProperties", value.asInstanceOf[js.Any])
    
    inline def setSelectedPropertiesVarargs(value: String*): Self = StObject.set(x, "selectedProperties", js.Array(value*))
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setStartTime(value: Time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
