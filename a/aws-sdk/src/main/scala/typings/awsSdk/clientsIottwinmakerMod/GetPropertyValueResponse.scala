package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertyValueResponse extends StObject {
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object that maps strings to the properties and latest property values in the response. Each string in the mapping must be unique to this object.
    */
  var propertyValues: js.UndefOr[PropertyLatestValueMap] = js.undefined
  
  /**
    * A table of property values.
    */
  var tabularPropertyValues: js.UndefOr[TabularPropertyValues] = js.undefined
}
object GetPropertyValueResponse {
  
  inline def apply(): GetPropertyValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropertyValueResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPropertyValueResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPropertyValues(value: PropertyLatestValueMap): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesUndefined: Self = StObject.set(x, "propertyValues", js.undefined)
    
    inline def setTabularPropertyValues(value: TabularPropertyValues): Self = StObject.set(x, "tabularPropertyValues", value.asInstanceOf[js.Any])
    
    inline def setTabularPropertyValuesUndefined: Self = StObject.set(x, "tabularPropertyValues", js.undefined)
    
    inline def setTabularPropertyValuesVarargs(value: TabularPropertyValue*): Self = StObject.set(x, "tabularPropertyValues", js.Array(value*))
  }
}
