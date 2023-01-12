package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFilter extends StObject {
  
  /**
    * The string that contains the search keywords, prefixes, and operators to control the results that can be returned by a Search operation. For more details, see Search query syntax.
    */
  var FilterString: SearchFilterFilterStringString
}
object SearchFilter {
  
  inline def apply(FilterString: SearchFilterFilterStringString): SearchFilter = {
    val __obj = js.Dynamic.literal(FilterString = FilterString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFilter] (val x: Self) extends AnyVal {
    
    inline def setFilterString(value: SearchFilterFilterStringString): Self = StObject.set(x, "FilterString", value.asInstanceOf[js.Any])
  }
}
