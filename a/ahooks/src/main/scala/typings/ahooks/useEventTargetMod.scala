package typings.ahooks

import typings.ahooks.anon.OnChange
import typings.ahooks.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventTargetMod {
  
  @JSImport("ahooks/lib/useEventTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, U](): js.Tuple2[js.UndefOr[T], OnChange[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[js.UndefOr[T], OnChange[U]]]
  inline def default[T, U](options: Options[T, U]): js.Tuple2[js.UndefOr[T], OnChange[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[T], OnChange[U]]]
  
  trait EventTarget[U] extends StObject {
    
    var target: Value[U]
  }
  object EventTarget {
    
    inline def apply[U](target: Value[U]): EventTarget[U] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTarget[U]]
    }
    
    extension [Self <: EventTarget[?], U](x: Self & EventTarget[U]) {
      
      inline def setTarget(value: Value[U]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[T, U] extends StObject {
    
    var initialValue: js.UndefOr[T] = js.undefined
    
    var transformer: js.UndefOr[js.Function1[/* value */ U, T]] = js.undefined
  }
  object Options {
    
    inline def apply[T, U](): Options[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T, U]]
    }
    
    extension [Self <: Options[?, ?], T, U](x: Self & (Options[T, U])) {
      
      inline def setInitialValue(value: T): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setTransformer(value: /* value */ U => T): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    }
  }
}
