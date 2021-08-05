package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.AntLocaleDatePickerView
import typings.antdMobile.anon.DatePicker
import typings.antdMobile.anon.Locale
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderLocaleProviderMod {
  
  @JSImport("antd-mobile/lib/locale-provider/locale-provider", JSImport.Default)
  @js.native
  class default () extends LocaleProvider
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/locale-provider/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/locale-provider/locale-provider", "default.childContextTypes")
    @js.native
    def childContextTypes: AntLocale = js.native
    inline def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/locale-provider/locale-provider", "default.propTypes")
    @js.native
    def propTypes: Locale = js.native
    inline def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LocaleProvider
    extends Component[LocaleProviderProps, js.Any, js.Any] {
    
    def getChildContext(): AntLocaleDatePickerView = js.native
  }
  
  trait LocaleProviderProps extends StObject {
    
    var locale: DatePicker
  }
  object LocaleProviderProps {
    
    inline def apply(locale: DatePicker): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    extension [Self <: LocaleProviderProps](x: Self) {
      
      inline def setLocale(value: DatePicker): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
