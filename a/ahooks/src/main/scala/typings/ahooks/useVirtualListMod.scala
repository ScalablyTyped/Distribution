package typings.ahooks

import typings.ahooks.anon.Data
import typings.ahooks.domTargetMod.BasicTarget
import typings.ahooks.domTargetMod.TargetValue
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useVirtualListMod {
  
  @JSImport("ahooks/lib/useVirtualList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](list: js.Array[T], options: Options[T]): js.Tuple2[js.Array[Data[T]], js.Function1[/* index */ Double, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Data[T]], js.Function1[/* index */ Double, Unit]]]
  
  type ItemHeight[T] = js.Function2[/* index */ Double, /* data */ T, Double]
  
  trait Options[T] extends StObject {
    
    var containerTarget: BasicTarget[Element]
    
    var itemHeight: Double | ItemHeight[T]
    
    var overscan: js.UndefOr[Double] = js.undefined
    
    var wrapperTarget: BasicTarget[Element]
  }
  object Options {
    
    inline def apply[T](itemHeight: Double | ItemHeight[T]): Options[T] = {
      val __obj = js.Dynamic.literal(itemHeight = itemHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setContainerTarget(value: BasicTarget[Element]): Self = StObject.set(x, "containerTarget", value.asInstanceOf[js.Any])
      
      inline def setContainerTargetFunction0(value: () => TargetValue[Element]): Self = StObject.set(x, "containerTarget", js.Any.fromFunction0(value))
      
      inline def setContainerTargetNull: Self = StObject.set(x, "containerTarget", null)
      
      inline def setContainerTargetUndefined: Self = StObject.set(x, "containerTarget", js.undefined)
      
      inline def setItemHeight(value: Double | ItemHeight[T]): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightFunction2(value: (/* index */ Double, T) => Double): Self = StObject.set(x, "itemHeight", js.Any.fromFunction2(value))
      
      inline def setOverscan(value: Double): Self = StObject.set(x, "overscan", value.asInstanceOf[js.Any])
      
      inline def setOverscanUndefined: Self = StObject.set(x, "overscan", js.undefined)
      
      inline def setWrapperTarget(value: BasicTarget[Element]): Self = StObject.set(x, "wrapperTarget", value.asInstanceOf[js.Any])
      
      inline def setWrapperTargetFunction0(value: () => TargetValue[Element]): Self = StObject.set(x, "wrapperTarget", js.Any.fromFunction0(value))
      
      inline def setWrapperTargetNull: Self = StObject.set(x, "wrapperTarget", null)
      
      inline def setWrapperTargetUndefined: Self = StObject.set(x, "wrapperTarget", js.undefined)
    }
  }
}
