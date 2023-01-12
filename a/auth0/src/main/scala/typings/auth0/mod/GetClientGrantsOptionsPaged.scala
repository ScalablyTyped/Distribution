package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClientGrantsOptionsPaged
  extends StObject
     with GetClientGrantsOptions {
  
  /**
    * true if a query summary must be included in the result, false otherwise
    * @default false
    */
  var include_totals: js.UndefOr[Boolean] = js.undefined
}
object GetClientGrantsOptionsPaged {
  
  inline def apply(): GetClientGrantsOptionsPaged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClientGrantsOptionsPaged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClientGrantsOptionsPaged] (val x: Self) extends AnyVal {
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
  }
}
