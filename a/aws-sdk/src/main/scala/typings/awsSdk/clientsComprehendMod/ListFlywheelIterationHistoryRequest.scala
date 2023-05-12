package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlywheelIterationHistoryRequest extends StObject {
  
  /**
    * Filter the flywheel iteration history based on creation time.
    */
  var Filter: js.UndefOr[FlywheelIterationFilter] = js.undefined
  
  /**
    * The ARN of the flywheel.
    */
  var FlywheelArn: ComprehendFlywheelArn
  
  /**
    * Maximum number of iteration history results to return
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Next token
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFlywheelIterationHistoryRequest {
  
  inline def apply(FlywheelArn: ComprehendFlywheelArn): ListFlywheelIterationHistoryRequest = {
    val __obj = js.Dynamic.literal(FlywheelArn = FlywheelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlywheelIterationHistoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFlywheelIterationHistoryRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: FlywheelIterationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
