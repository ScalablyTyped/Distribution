package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlywheelIterationHistoryResponse extends StObject {
  
  /**
    * List of flywheel iteration properties
    */
  var FlywheelIterationPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelIterationPropertiesList] = js.undefined
  
  /**
    * Next token
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFlywheelIterationHistoryResponse {
  
  inline def apply(): ListFlywheelIterationHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlywheelIterationHistoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFlywheelIterationHistoryResponse] (val x: Self) extends AnyVal {
    
    inline def setFlywheelIterationPropertiesList(value: FlywheelIterationPropertiesList): Self = StObject.set(x, "FlywheelIterationPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setFlywheelIterationPropertiesListUndefined: Self = StObject.set(x, "FlywheelIterationPropertiesList", js.undefined)
    
    inline def setFlywheelIterationPropertiesListVarargs(value: FlywheelIterationProperties*): Self = StObject.set(x, "FlywheelIterationPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
