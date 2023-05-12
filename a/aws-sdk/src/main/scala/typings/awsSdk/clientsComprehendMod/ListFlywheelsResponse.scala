package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlywheelsResponse extends StObject {
  
  /**
    * A list of flywheel properties retrieved by the service in response to the request. 
    */
  var FlywheelSummaryList: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelSummaryList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFlywheelsResponse {
  
  inline def apply(): ListFlywheelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlywheelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFlywheelsResponse] (val x: Self) extends AnyVal {
    
    inline def setFlywheelSummaryList(value: FlywheelSummaryList): Self = StObject.set(x, "FlywheelSummaryList", value.asInstanceOf[js.Any])
    
    inline def setFlywheelSummaryListUndefined: Self = StObject.set(x, "FlywheelSummaryList", js.undefined)
    
    inline def setFlywheelSummaryListVarargs(value: FlywheelSummary*): Self = StObject.set(x, "FlywheelSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
