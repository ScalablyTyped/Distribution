package typings.antdMobile

import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePropsValueMod {
  
  @JSImport("antd-mobile/es/utils/use-props-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePropsValue[T](options: Options[T]): js.Tuple2[
    T, 
    js.Function2[/* v */ SetStateAction[T], /* forceTrigger */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePropsValue")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    T, 
    js.Function2[/* v */ SetStateAction[T], /* forceTrigger */ js.UndefOr[Boolean], Unit]
  ]]
  
  trait Options[T] extends StObject {
    
    var defaultValue: T
    
    var onChange: js.UndefOr[js.Function1[/* v */ T, Unit]] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Options {
    
    inline def apply[T](defaultValue: T): Options[T] = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* v */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
