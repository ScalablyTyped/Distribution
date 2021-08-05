package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutesOutput extends StObject {
  
  /**
    * The nextToken value to include in a future ListRoutes request. When the results of a ListRoutes request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of existing routes for the specified service mesh and virtual router.
    */
  var routes: RouteList
}
object ListRoutesOutput {
  
  inline def apply(routes: RouteList): ListRoutesOutput = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoutesOutput]
  }
  
  extension [Self <: ListRoutesOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRoutes(value: RouteList): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: RouteRef*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
