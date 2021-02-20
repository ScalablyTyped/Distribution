package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.AntLocaleDatePickerView
import typings.antdMobileRn.anon.DatePicker
import typings.antdMobileRn.anon.Locale
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderMod {
  
  @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", JSImport.Default)
  @js.native
  class default () extends LocaleProvider
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", "default.childContextTypes")
    @js.native
    def childContextTypes: AntLocale = js.native
    @scala.inline
    def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", "default.propTypes")
    @js.native
    def propTypes: Locale = js.native
    @scala.inline
    def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LocaleProvider
    extends Component[LocaleProviderProps, js.Any, js.Any] {
    
    def getChildContext(): AntLocaleDatePickerView = js.native
  }
  
  @js.native
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var locale: DatePicker = js.native
  }
  object LocaleProviderProps {
    
    @scala.inline
    def apply(locale: DatePicker): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    @scala.inline
    implicit class LocaleProviderPropsMutableBuilder[Self <: LocaleProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLocale(value: DatePicker): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
