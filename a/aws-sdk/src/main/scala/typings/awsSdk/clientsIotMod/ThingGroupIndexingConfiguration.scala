package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingGroupIndexingConfiguration extends StObject {
  
  /**
    * A list of thing group fields to index. This list cannot contain any managed fields. Use the GetIndexingConfiguration API to get a list of managed fields. Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.undefined
  
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service. This is an optional field. For more information, see Managed fields in the Amazon Web Services IoT Core Developer Guide.
    */
  var managedFields: js.UndefOr[Fields] = js.undefined
  
  /**
    * Thing group indexing mode.
    */
  var thingGroupIndexingMode: ThingGroupIndexingMode
}
object ThingGroupIndexingConfiguration {
  
  inline def apply(thingGroupIndexingMode: ThingGroupIndexingMode): ThingGroupIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingGroupIndexingMode = thingGroupIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupIndexingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThingGroupIndexingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomFields(value: Fields): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: Field*): Self = StObject.set(x, "customFields", js.Array(value*))
    
    inline def setManagedFields(value: Fields): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
    
    inline def setManagedFieldsUndefined: Self = StObject.set(x, "managedFields", js.undefined)
    
    inline def setManagedFieldsVarargs(value: Field*): Self = StObject.set(x, "managedFields", js.Array(value*))
    
    inline def setThingGroupIndexingMode(value: ThingGroupIndexingMode): Self = StObject.set(x, "thingGroupIndexingMode", value.asInstanceOf[js.Any])
  }
}
