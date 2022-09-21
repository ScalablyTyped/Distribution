package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PartialLocale
import typings.antDesignReactNative.anon.PartialTheme
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@ant-design/react-native/lib/provider", JSImport.Default)
  @js.native
  open class default () extends Provider
  
  @js.native
  trait Provider
    extends Component[ProviderProps, js.Object, Any]
  
  trait ProviderProps extends StObject {
    
    var children: ReactNode
    
    var locale: js.UndefOr[PartialLocale] = js.undefined
    
    var theme: js.UndefOr[PartialTheme] = js.undefined
  }
  object ProviderProps {
    
    inline def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    extension [Self <: ProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setTheme(value: PartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
