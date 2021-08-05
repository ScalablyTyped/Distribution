package typings.agGrid

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalResizeServiceMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/horizontalResizeService", "HorizontalResizeService")
  @js.native
  class HorizontalResizeService () extends StObject {
    
    def addResizeBar(params: HorizontalResizeParams): js.Function0[Unit] = js.native
    
    /* private */ var dragService: js.Any = js.native
    
    /* private */ var dragStartX: js.Any = js.native
    
    /* private */ var draggingStarted: js.Any = js.native
    
    /* private */ var eGridDiv: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var oldBodyCursor: js.Any = js.native
    
    /* private */ var oldMsUserSelect: js.Any = js.native
    
    /* private */ var oldWebkitUserSelect: js.Any = js.native
    
    /* private */ def onDragStart(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onDragStop(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onDragging(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def resetIcons(): js.Any = js.native
    
    /* private */ var resizeAmount: js.Any = js.native
    
    /* private */ def setResizeIcons(): js.Any = js.native
  }
  
  trait HorizontalResizeParams extends StObject {
    
    var eResizeBar: HTMLElement
    
    def onResizeEnd(delta: Double): Unit
    
    def onResizeStart(shiftKey: Boolean): Unit
    
    def onResizing(delta: Double): Unit
  }
  object HorizontalResizeParams {
    
    inline def apply(
      eResizeBar: HTMLElement,
      onResizeEnd: Double => Unit,
      onResizeStart: Boolean => Unit,
      onResizing: Double => Unit
    ): HorizontalResizeParams = {
      val __obj = js.Dynamic.literal(eResizeBar = eResizeBar.asInstanceOf[js.Any], onResizeEnd = js.Any.fromFunction1(onResizeEnd), onResizeStart = js.Any.fromFunction1(onResizeStart), onResizing = js.Any.fromFunction1(onResizing))
      __obj.asInstanceOf[HorizontalResizeParams]
    }
    
    extension [Self <: HorizontalResizeParams](x: Self) {
      
      inline def setEResizeBar(value: HTMLElement): Self = StObject.set(x, "eResizeBar", value.asInstanceOf[js.Any])
      
      inline def setOnResizeEnd(value: Double => Unit): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1(value))
      
      inline def setOnResizeStart(value: Boolean => Unit): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1(value))
      
      inline def setOnResizing(value: Double => Unit): Self = StObject.set(x, "onResizing", js.Any.fromFunction1(value))
    }
  }
}
