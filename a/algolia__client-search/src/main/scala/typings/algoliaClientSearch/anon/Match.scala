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
  var params: js.UndefOr[Record[String, js.Any]] = js.undefined
}
object Match {
  
  inline def apply(`match`: Alternatives): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  extension [Self <: Match](x: Self) {
    
    inline def setMatch(value: Alternatives): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
