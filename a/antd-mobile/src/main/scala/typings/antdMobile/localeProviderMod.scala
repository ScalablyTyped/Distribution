package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderMod {
  
  @JSImport("antd-mobile/lib/locale-provider", JSImport.Default)
  @js.native
  class default ()
    extends typings.antdMobile.localeProviderLocaleProviderMod.default
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/locale-provider", "default.childContextTypes")
    @js.native
    def childContextTypes: AntLocale = js.native
    @scala.inline
    def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/locale-provider", "default.propTypes")
    @js.native
    def propTypes: Locale = js.native
    @scala.inline
    def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
