package typings.antDesignReactNative.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/MultiPickerProps.default> */
@js.native
trait Readonlydefault extends StObject {
  
  val children: js.UndefOr[js.Any] = js.native
  
  val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
  
  val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
  
  val rootNativeProps: js.UndefOr[js.Any] = js.native
  
  val selectedValue: js.UndefOr[js.Array[_]] = js.native
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object Readonlydefault {
  
  @scala.inline
  def apply(): Readonlydefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readonlydefault]
  }
  
  @scala.inline
  implicit class ReadonlydefaultMutableBuilder[Self <: Readonlydefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setRootNativeProps(value: js.Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: js.Array[_]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    
    @scala.inline
    def setSelectedValueVarargs(value: js.Any*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
