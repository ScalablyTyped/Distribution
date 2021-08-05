package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollVisibleServiceMod {
  
  @JSImport("ag-grid/dist/lib/gridPanel/scrollVisibleService", "ScrollVisibleService")
  @js.native
  class ScrollVisibleService () extends StObject {
    
    /* private */ var bodyHorizontalScrollShowing: js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    def isBodyHorizontalScrollShowing(): Boolean = js.native
    
    def isLeftVerticalScrollShowing(): Boolean = js.native
    
    def isRightVerticalScrollShowing(): Boolean = js.native
    
    /* private */ var leftVerticalScrollShowing: js.Any = js.native
    
    /* private */ var rightVerticalScrollShowing: js.Any = js.native
    
    def setScrollsVisible(params: SetScrollsVisibleParams): Unit = js.native
  }
  
  trait SetScrollsVisibleParams extends StObject {
    
    var bodyHorizontalScrollShowing: Boolean
    
    var leftVerticalScrollShowing: Boolean
    
    var rightVerticalScrollShowing: Boolean
  }
  object SetScrollsVisibleParams {
    
    inline def apply(
      bodyHorizontalScrollShowing: Boolean,
      leftVerticalScrollShowing: Boolean,
      rightVerticalScrollShowing: Boolean
    ): SetScrollsVisibleParams = {
      val __obj = js.Dynamic.literal(bodyHorizontalScrollShowing = bodyHorizontalScrollShowing.asInstanceOf[js.Any], leftVerticalScrollShowing = leftVerticalScrollShowing.asInstanceOf[js.Any], rightVerticalScrollShowing = rightVerticalScrollShowing.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetScrollsVisibleParams]
    }
    
    extension [Self <: SetScrollsVisibleParams](x: Self) {
      
      inline def setBodyHorizontalScrollShowing(value: Boolean): Self = StObject.set(x, "bodyHorizontalScrollShowing", value.asInstanceOf[js.Any])
      
      inline def setLeftVerticalScrollShowing(value: Boolean): Self = StObject.set(x, "leftVerticalScrollShowing", value.asInstanceOf[js.Any])
      
      inline def setRightVerticalScrollShowing(value: Boolean): Self = StObject.set(x, "rightVerticalScrollShowing", value.asInstanceOf[js.Any])
    }
  }
}
