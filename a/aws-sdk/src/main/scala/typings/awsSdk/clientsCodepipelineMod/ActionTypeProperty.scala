package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeProperty extends StObject {
  
  /**
    * The description of the property that is displayed to users.
    */
  var description: js.UndefOr[PropertyDescription] = js.undefined
  
  /**
    * Whether the configuration property is a key.
    */
  var key: Boolean
  
  /**
    * The property name that is displayed to users.
    */
  var name: ActionConfigurationKey
  
  /**
    * Whether to omit the field value entered by the customer in the log. If true, the value is not saved in CloudTrail logs for the action execution.
    */
  var noEcho: Boolean
  
  /**
    * Whether the configuration property is an optional value.
    */
  var optional: Boolean
  
  /**
    * Indicates that the property is used with polling. An action type can have up to one queryable property. If it has one, that property must be both required and not secret.
    */
  var queryable: js.UndefOr[Boolean] = js.undefined
}
object ActionTypeProperty {
  
  inline def apply(key: Boolean, name: ActionConfigurationKey, noEcho: Boolean, optional: Boolean): ActionTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noEcho = noEcho.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeProperty]
  }
  
  extension [Self <: ActionTypeProperty](x: Self) {
    
    inline def setDescription(value: PropertyDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActionConfigurationKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoEcho(value: Boolean): Self = StObject.set(x, "noEcho", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setQueryable(value: Boolean): Self = StObject.set(x, "queryable", value.asInstanceOf[js.Any])
    
    inline def setQueryableUndefined: Self = StObject.set(x, "queryable", js.undefined)
  }
}
