package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.Current
import typings.antDesignReactNative.anon.NextText
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.paginationPropsTypeMod.PaginationPropsType
import typings.antDesignReactNative.paginationPropsTypeMod.PaginationState
import typings.antDesignReactNative.paginationStyleMod.PaginationStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@ant-design/react-native/lib/pagination", JSImport.Default)
  @js.native
  class default protected () extends Pagination {
    def this(props: PaginationNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/pagination", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/pagination", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Pagination
    extends Component[PaginationNativeProps, PaginationState, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): Unit = js.native
    
    def onChange(p: Double): Unit = js.native
  }
  
  trait PaginationNativeProps
    extends StObject
       with PaginationPropsType
       with WithThemeStyles[PaginationStyle] {
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var locale: js.UndefOr[NextText] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PaginationNativeProps {
    
    inline def apply(current: Double, total: Double): PaginationNativeProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationNativeProps]
    }
    
    extension [Self <: PaginationNativeProps](x: Self) {
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setLocale(value: NextText): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
