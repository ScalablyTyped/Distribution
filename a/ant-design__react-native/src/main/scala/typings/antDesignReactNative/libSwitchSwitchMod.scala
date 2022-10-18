package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.libSwitchPropsTypeMod.SwitchPropsType
import typings.antDesignReactNative.libSwitchStyleMod.SwitchStyle
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchSwitchMod {
  
  object default {
    
    inline def apply(
      hasPrefixClsCheckedDefaultCheckedDisabledColorLoadingCheckedChildrenUnCheckedChildrenOnPressOnChangeTrackColorThumbColorThumbTintColorRestProps: SwitchProps
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasPrefixClsCheckedDefaultCheckedDisabledColorLoadingCheckedChildrenUnCheckedChildrenOnPressOnChangeTrackColorThumbColorThumbTintColorRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@ant-design/react-native/lib/switch/Switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/switch/Switch", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait SwitchProps
    extends StObject
       with SwitchPropsType
       with WithThemeStyles[SwitchStyle] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
