package typings.ahooks

import typings.react.mod.SetStateAction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseControllableValueMod {
  
  @JSImport("ahooks/lib/useControllableValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def default[T](props: Unit, options: Options[T]): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def default[T](props: Props): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def default[T](props: Props, options: Options[T]): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def default[T](props: StandardProps[T]): js.Tuple2[T, js.Function1[/* v */ SetStateAction[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* v */ SetStateAction[T], Unit]]]
  
  trait Options[T] extends StObject {
    
    var defaultValue: js.UndefOr[T] = js.undefined
    
    var defaultValuePropName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var valuePropName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValuePropName(value: String): Self = StObject.set(x, "defaultValuePropName", value.asInstanceOf[js.Any])
      
      inline def setDefaultValuePropNameUndefined: Self = StObject.set(x, "defaultValuePropName", js.undefined)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      inline def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
    }
  }
  
  type Props = Record[String, Any]
  
  trait StandardProps[T] extends StObject {
    
    var defaultValue: js.UndefOr[T] = js.undefined
    
    def onChange(`val`: T): Unit
    
    var value: T
  }
  object StandardProps {
    
    inline def apply[T](onChange: T => Unit, value: T): StandardProps[T] = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardProps[T]]
    }
    
    extension [Self <: StandardProps[?], T](x: Self & StandardProps[T]) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
