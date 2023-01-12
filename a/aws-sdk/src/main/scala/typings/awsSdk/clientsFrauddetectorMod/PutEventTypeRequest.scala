package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventTypeRequest extends StObject {
  
  /**
    * The description of the event type.
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    * The entity type for the event type. Example entity types: customer, merchant, account.
    */
  var entityTypes: NonEmptyListOfStrings
  
  /**
    * Specifies if ingenstion is enabled or disabled.
    */
  var eventIngestion: js.UndefOr[EventIngestion] = js.undefined
  
  /**
    * The event type variables.
    */
  var eventVariables: NonEmptyListOfStrings
  
  /**
    * The event type labels.
    */
  var labels: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * The name.
    */
  var name: identifier
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object PutEventTypeRequest {
  
  inline def apply(entityTypes: NonEmptyListOfStrings, eventVariables: NonEmptyListOfStrings, name: identifier): PutEventTypeRequest = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes.asInstanceOf[js.Any], eventVariables = eventVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEventTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityTypes(value: NonEmptyListOfStrings): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setEventIngestion(value: EventIngestion): Self = StObject.set(x, "eventIngestion", value.asInstanceOf[js.Any])
    
    inline def setEventIngestionUndefined: Self = StObject.set(x, "eventIngestion", js.undefined)
    
    inline def setEventVariables(value: NonEmptyListOfStrings): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setEventVariablesVarargs(value: String*): Self = StObject.set(x, "eventVariables", js.Array(value*))
    
    inline def setLabels(value: ListOfStrings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
