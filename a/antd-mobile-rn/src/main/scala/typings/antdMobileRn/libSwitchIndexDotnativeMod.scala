package typings.antdMobileRn

import typings.antdMobileRn.libSwitchPropsTypeMod.SwitchPropsType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/switch/index.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AntmSwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AntmSwitchProps
    extends StObject
       with SwitchPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object AntmSwitchProps {
    
    inline def apply(): AntmSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntmSwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AntmSwitchProps] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
