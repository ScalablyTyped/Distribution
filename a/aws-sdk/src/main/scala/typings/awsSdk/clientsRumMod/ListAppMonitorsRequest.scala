package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppMonitorsRequest extends StObject {
  
  /**
    * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAppMonitorsRequest {
  
  inline def apply(): ListAppMonitorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppMonitorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppMonitorsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
