package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsersDataPaged
  extends StObject
     with GetUsersData {
  
  var include_totals: Boolean
}
object GetUsersDataPaged {
  
  inline def apply(include_totals: Boolean): GetUsersDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersDataPaged]
  }
  
  extension [Self <: GetUsersDataPaged](x: Self) {
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
