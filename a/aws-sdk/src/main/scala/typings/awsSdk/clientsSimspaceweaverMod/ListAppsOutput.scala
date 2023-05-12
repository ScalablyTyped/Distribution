package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsOutput extends StObject {
  
  /**
    * The list of apps for the given simulation and domain.
    */
  var Apps: js.UndefOr[SimulationAppList] = js.undefined
  
  /**
    * If SimSpace Weaver returns nextToken, then there are more results available. The value of nextToken is a unique pagination token for each page. To retrieve the next page, call the operation again using the returned token. Keep all other arguments unchanged. If no results remain, then nextToken is set to null. Each pagination token expires after 24 hours. If you provide a token that isn't valid, then you receive an HTTP 400 ValidationException error.
    */
  var NextToken: js.UndefOr[OptionalString] = js.undefined
}
object ListAppsOutput {
  
  inline def apply(): ListAppsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppsOutput] (val x: Self) extends AnyVal {
    
    inline def setApps(value: SimulationAppList): Self = StObject.set(x, "Apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "Apps", js.undefined)
    
    inline def setAppsVarargs(value: SimulationAppMetadata*): Self = StObject.set(x, "Apps", js.Array(value*))
    
    inline def setNextToken(value: OptionalString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
