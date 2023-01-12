package typings.antDesignReactNative.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/MultiPickerProps.default> */
trait Readonlydefault extends StObject {
  
  val children: js.UndefOr[Any] = js.undefined
  
  val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  
  val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  
  val rootNativeProps: js.UndefOr[Any] = js.undefined
  
  val selectedValue: js.UndefOr[js.Array[Any]] = js.undefined
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object Readonlydefault {
  
  inline def apply(): Readonlydefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readonlydefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlydefault] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnScrollChange(value: (/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
    
    inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
    
    inline def setOnValueChange(value: (/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setRootNativeProps(value: Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
    
    inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
    
    inline def setSelectedValue(value: js.Array[Any]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    
    inline def setSelectedValueVarargs(value: Any*): Self = StObject.set(x, "selectedValue", js.Array(value*))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
