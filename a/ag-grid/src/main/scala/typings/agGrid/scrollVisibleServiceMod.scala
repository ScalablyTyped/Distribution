package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollVisibleServiceMod {
  
  @JSImport("ag-grid/dist/lib/gridPanel/scrollVisibleService", "ScrollVisibleService")
  @js.native
  class ScrollVisibleService () extends StObject {
    
    var bodyHorizontalScrollShowing: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def isBodyHorizontalScrollShowing(): Boolean = js.native
    
    def isLeftVerticalScrollShowing(): Boolean = js.native
    
    def isRightVerticalScrollShowing(): Boolean = js.native
    
    var leftVerticalScrollShowing: js.Any = js.native
    
    var rightVerticalScrollShowing: js.Any = js.native
    
    def setScrollsVisible(params: SetScrollsVisibleParams): Unit = js.native
  }
  
  @js.native
  trait SetScrollsVisibleParams extends StObject {
    
    var bodyHorizontalScrollShowing: Boolean = js.native
    
    var leftVerticalScrollShowing: Boolean = js.native
    
    var rightVerticalScrollShowing: Boolean = js.native
  }
  object SetScrollsVisibleParams {
    
    @scala.inline
    def apply(
      bodyHorizontalScrollShowing: Boolean,
      leftVerticalScrollShowing: Boolean,
      rightVerticalScrollShowing: Boolean
    ): SetScrollsVisibleParams = {
      val __obj = js.Dynamic.literal(bodyHorizontalScrollShowing = bodyHorizontalScrollShowing.asInstanceOf[js.Any], leftVerticalScrollShowing = leftVerticalScrollShowing.asInstanceOf[js.Any], rightVerticalScrollShowing = rightVerticalScrollShowing.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetScrollsVisibleParams]
    }
    
    @scala.inline
    implicit class SetScrollsVisibleParamsMutableBuilder[Self <: SetScrollsVisibleParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyHorizontalScrollShowing(value: Boolean): Self = StObject.set(x, "bodyHorizontalScrollShowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftVerticalScrollShowing(value: Boolean): Self = StObject.set(x, "leftVerticalScrollShowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightVerticalScrollShowing(value: Boolean): Self = StObject.set(x, "rightVerticalScrollShowing", value.asInstanceOf[js.Any])
    }
  }
}
