package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertyValueHistoryResponse extends StObject {
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object that maps strings to the property definitions in the component type. Each string in the mapping must be unique to this object.
    */
  var propertyValues: PropertyValueList
}
object GetPropertyValueHistoryResponse {
  
  inline def apply(propertyValues: PropertyValueList): GetPropertyValueHistoryResponse = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyValueHistoryResponse]
  }
  
  extension [Self <: GetPropertyValueHistoryResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPropertyValues(value: PropertyValueList): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesVarargs(value: PropertyValueHistory*): Self = StObject.set(x, "propertyValues", js.Array(value*))
  }
}
