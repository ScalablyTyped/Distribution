package typings.algoliaClientSearch.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match extends StObject {
  
  /**
    * The explain query match.
    */
  var `match`: Alternatives
  
  /**
    * Query parameter reporting. Parameters are reported
    * as a JSON object with one field per parameter.
    */
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * This parameter is for internal use only.
    */
  var redirect: js.UndefOr[Index] = js.undefined
}
object Match {
  
  inline def apply(`match`: Alternatives): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: Alternatives): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRedirect(value: Index): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
  }
}
