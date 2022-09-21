package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵRestoredState
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var navigationId: Double
  
  var ɵrouterPageId: js.UndefOr[Double] = js.undefined
}
object ɵRestoredState {
  
  inline def apply(navigationId: Double): ɵRestoredState = {
    val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵRestoredState]
  }
  
  extension [Self <: ɵRestoredState](x: Self) {
    
    inline def setNavigationId(value: Double): Self = StObject.set(x, "navigationId", value.asInstanceOf[js.Any])
    
    inline def setƟrouterPageId(value: Double): Self = StObject.set(x, "\u0275routerPageId", value.asInstanceOf[js.Any])
    
    inline def setƟrouterPageIdUndefined: Self = StObject.set(x, "\u0275routerPageId", js.undefined)
  }
}
