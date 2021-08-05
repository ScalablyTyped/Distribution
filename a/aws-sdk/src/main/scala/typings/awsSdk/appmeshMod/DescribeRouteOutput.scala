package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRouteOutput extends StObject {
  
  /**
    * The full description of your route.
    */
  var route: RouteData
}
object DescribeRouteOutput {
  
  inline def apply(route: RouteData): DescribeRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRouteOutput]
  }
  
  extension [Self <: DescribeRouteOutput](x: Self) {
    
    inline def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
