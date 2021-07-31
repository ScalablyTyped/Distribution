package typings.antdMobile.mod

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Locale
import typings.antdMobile.localeProviderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "LocaleProvider")
@js.native
class LocaleProvider () extends default
/* static members */
object LocaleProvider {
  
  @JSImport("antd-mobile", "LocaleProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "LocaleProvider.childContextTypes")
  @js.native
  def childContextTypes: AntLocale = js.native
  @scala.inline
  def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "LocaleProvider.propTypes")
  @js.native
  def propTypes: Locale = js.native
  @scala.inline
  def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
