package typings.algoliaClientSearch.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends StObject {
  
  /**
    * The explain query match.
    */
  var `match`: Alternatives = js.native
  
  /**
    * Query parameter reporting. Parameters are reported
    * as a JSON object with one field per parameter.
    */
  var params: js.UndefOr[Record[String, _]] = js.native
}
object Match {
  
  @scala.inline
  def apply(`match`: Alternatives): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(value: Alternatives): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
