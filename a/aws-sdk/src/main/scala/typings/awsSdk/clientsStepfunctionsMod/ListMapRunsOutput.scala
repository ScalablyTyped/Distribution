package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMapRunsOutput extends StObject {
  
  /**
    * An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map Run and the ARN of the state machine that started the Map Run.
    */
  var mapRuns: MapRunList
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.undefined
}
object ListMapRunsOutput {
  
  inline def apply(mapRuns: MapRunList): ListMapRunsOutput = {
    val __obj = js.Dynamic.literal(mapRuns = mapRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMapRunsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMapRunsOutput] (val x: Self) extends AnyVal {
    
    inline def setMapRuns(value: MapRunList): Self = StObject.set(x, "mapRuns", value.asInstanceOf[js.Any])
    
    inline def setMapRunsVarargs(value: MapRunListItem*): Self = StObject.set(x, "mapRuns", js.Array(value*))
    
    inline def setNextToken(value: PageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
