package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PartialLocale
import typings.antDesignReactNative.anon.PartialTheme
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@ant-design/react-native/lib/provider", JSImport.Default)
  @js.native
  class default () extends Provider
  
  @js.native
  trait Provider
    extends Component[ProviderProps, js.Object, js.Any]
  
  @js.native
  trait ProviderProps extends StObject {
    
    var locale: js.UndefOr[PartialLocale] = js.native
    
    var theme: js.UndefOr[PartialTheme] = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setTheme(value: PartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
