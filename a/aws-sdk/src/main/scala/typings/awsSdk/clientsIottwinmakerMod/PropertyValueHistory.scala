package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyValueHistory extends StObject {
  
  /**
    * An object that uniquely identifies an entity property.
    */
  var entityPropertyReference: EntityPropertyReference
  
  /**
    * A list of objects that contain information about the values in the history of a time series property.
    */
  var values: js.UndefOr[Values] = js.undefined
}
object PropertyValueHistory {
  
  inline def apply(entityPropertyReference: EntityPropertyReference): PropertyValueHistory = {
    val __obj = js.Dynamic.literal(entityPropertyReference = entityPropertyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValueHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyValueHistory] (val x: Self) extends AnyVal {
    
    inline def setEntityPropertyReference(value: EntityPropertyReference): Self = StObject.set(x, "entityPropertyReference", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Values): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: PropertyValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
