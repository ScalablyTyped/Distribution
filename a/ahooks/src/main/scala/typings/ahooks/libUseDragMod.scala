package typings.ahooks

import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.react.mod.DragEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseDragMod {
  
  @JSImport("ahooks/lib/useDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](data: T, target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](data: T, target: BasicTarget[Element], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnDragEnd(value: /* event */ DragEvent[Element] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* event */ DragEvent[Element] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    }
  }
}
