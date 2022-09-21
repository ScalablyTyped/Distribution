package typings.angularGridster

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IAugmentedJQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Drag extends StObject {
    
    // optional callback fired when item is moved,
    var drag: js.UndefOr[
        js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any, Unit]
      ] = js.undefined
    
    // whether the items are resizable
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    // optional selector for drag handle
    var handle: js.UndefOr[String] = js.undefined
    
    // Distance in pixels from the edge of the viewport after which the viewport should scroll, relative to pointer
    var scrollSensitivity: js.UndefOr[Double] = js.undefined
    
    // Speed at which the window should scroll once the mouse pointer gets within scrollSensitivity distance
    var scrollSpeed: js.UndefOr[Double] = js.undefined
    
    // optional callback fired when drag is started
    var start: js.UndefOr[
        js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any, Unit]
      ] = js.undefined
    
    // optional callback fired when item is finished dragging
    var stop: js.UndefOr[
        js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any, Unit]
      ] = js.undefined
  }
  object Drag {
    
    inline def apply(): Drag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Drag]
    }
    
    extension [Self <: Drag](x: Self) {
      
      inline def setDrag(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction3(value))
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      inline def setStart(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction3(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    // whether the items are resizable
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    // location of the resize handles
    // e.g // ['s', 'e', 'n', 'w', 'se', 'ne', 'sw', 'nw']
    var handles: js.UndefOr[js.Array[String]] = js.undefined
    
    // optional callback fired when item is resized
    var resize: js.UndefOr[
        js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any, Unit]
      ] = js.undefined
    
    // optional callback fired when drag is started
    var start: js.UndefOr[
        js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any, Unit]
      ] = js.undefined
    
    // optional callback fired when item is finished dragging
    var stop: js.UndefOr[
        js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any, Unit]
      ] = js.undefined
  }
  object Enabled {
    
    inline def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHandles(value: js.Array[String]): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
      
      inline def setHandlesVarargs(value: String*): Self = StObject.set(x, "handles", js.Array(value*))
      
      inline def setResize(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setStart(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ Any) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction3(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
