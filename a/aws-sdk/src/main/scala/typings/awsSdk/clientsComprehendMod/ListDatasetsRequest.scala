package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsRequest extends StObject {
  
  /**
    * Filters the datasets to be returned in the response.
    */
  var Filter: js.UndefOr[DatasetFilter] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel.
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
  
  /**
    * Maximum number of results to return in a response. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDatasetsRequest {
  
  inline def apply(): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: DatasetFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
