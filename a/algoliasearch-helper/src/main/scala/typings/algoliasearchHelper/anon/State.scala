package typings.algoliasearchHelper.anon

import typings.algoliasearchHelper.mod.SearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var state: SearchParameters
}
object State {
  
  inline def apply(state: SearchParameters): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
