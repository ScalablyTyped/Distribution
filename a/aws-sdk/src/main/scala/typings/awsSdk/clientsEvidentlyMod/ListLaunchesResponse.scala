package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLaunchesResponse extends StObject {
  
  /**
    * An array of structures that contain the configuration details of the launches in the specified project.
    */
  var launches: js.UndefOr[LaunchesList] = js.undefined
  
  /**
    * The token to use in a subsequent ListLaunches operation to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListLaunchesResponse {
  
  inline def apply(): ListLaunchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLaunchesResponse]
  }
  
  extension [Self <: ListLaunchesResponse](x: Self) {
    
    inline def setLaunches(value: LaunchesList): Self = StObject.set(x, "launches", value.asInstanceOf[js.Any])
    
    inline def setLaunchesUndefined: Self = StObject.set(x, "launches", js.undefined)
    
    inline def setLaunchesVarargs(value: Launch*): Self = StObject.set(x, "launches", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
