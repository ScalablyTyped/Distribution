package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActionRequest extends StObject {
  
  /**
    * The name of the action. Must be unique to your account in an Amazon Web Services Region.
    */
  var ActionName: ExperimentEntityName
  
  /**
    * The action type.
    */
  var ActionType: String256
  
  /**
    * The description of the action.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * A list of properties to add to the action.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * The source type, ID, and URI.
    */
  var Source: ActionSource
  
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
  
  /**
    * A list of tags to apply to the action.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateActionRequest {
  
  inline def apply(ActionName: ExperimentEntityName, ActionType: String256, Source: ActionSource): CreateActionRequest = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: ExperimentEntityName): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: String256): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setSource(value: ActionSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
