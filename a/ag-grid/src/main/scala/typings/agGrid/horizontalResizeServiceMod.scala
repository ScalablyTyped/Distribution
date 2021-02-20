package typings.agGrid

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalResizeServiceMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/horizontalResizeService", "HorizontalResizeService")
  @js.native
  class HorizontalResizeService () extends StObject {
    
    def addResizeBar(params: HorizontalResizeParams): js.Function0[Unit] = js.native
    
    var dragService: js.Any = js.native
    
    var dragStartX: js.Any = js.native
    
    var draggingStarted: js.Any = js.native
    
    var eGridDiv: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var oldBodyCursor: js.Any = js.native
    
    var oldMsUserSelect: js.Any = js.native
    
    var oldWebkitUserSelect: js.Any = js.native
    
    /* private */ def onDragStart(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onDragStop(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onDragging(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def resetIcons(): js.Any = js.native
    
    var resizeAmount: js.Any = js.native
    
    /* private */ def setResizeIcons(): js.Any = js.native
  }
  
  @js.native
  trait HorizontalResizeParams extends StObject {
    
    var eResizeBar: HTMLElement = js.native
    
    def onResizeEnd(delta: Double): Unit = js.native
    
    def onResizeStart(shiftKey: Boolean): Unit = js.native
    
    def onResizing(delta: Double): Unit = js.native
  }
  object HorizontalResizeParams {
    
    @scala.inline
    def apply(
      eResizeBar: HTMLElement,
      onResizeEnd: Double => Unit,
      onResizeStart: Boolean => Unit,
      onResizing: Double => Unit
    ): HorizontalResizeParams = {
      val __obj = js.Dynamic.literal(eResizeBar = eResizeBar.asInstanceOf[js.Any], onResizeEnd = js.Any.fromFunction1(onResizeEnd), onResizeStart = js.Any.fromFunction1(onResizeStart), onResizing = js.Any.fromFunction1(onResizing))
      __obj.asInstanceOf[HorizontalResizeParams]
    }
    
    @scala.inline
    implicit class HorizontalResizeParamsMutableBuilder[Self <: HorizontalResizeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEResizeBar(value: HTMLElement): Self = StObject.set(x, "eResizeBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResizeEnd(value: Double => Unit): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeStart(value: Boolean => Unit): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizing(value: Double => Unit): Self = StObject.set(x, "onResizing", js.Any.fromFunction1(value))
    }
  }
}
