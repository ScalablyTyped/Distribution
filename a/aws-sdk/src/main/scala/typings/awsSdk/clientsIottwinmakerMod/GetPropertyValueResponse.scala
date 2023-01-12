package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertyValueResponse extends StObject {
  
  /**
    * An object that maps strings to the properties and latest property values in the response. Each string in the mapping must be unique to this object.
    */
  var propertyValues: PropertyLatestValueMap
}
object GetPropertyValueResponse {
  
  inline def apply(propertyValues: PropertyLatestValueMap): GetPropertyValueResponse = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyValueResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPropertyValueResponse] (val x: Self) extends AnyVal {
    
    inline def setPropertyValues(value: PropertyLatestValueMap): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
  }
}
