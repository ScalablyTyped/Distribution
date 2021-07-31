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
  
  @scala.inline
  def apply(routes: RouteList): ListRoutesOutput = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoutesOutput]
  }
  
  @scala.inline
  implicit class ListRoutesOutputMutableBuilder[Self <: ListRoutesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRoutes(value: RouteList): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: RouteRef*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
