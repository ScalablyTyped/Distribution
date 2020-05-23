package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.antDesignProLayoutStrings.`en-US`
import typings.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
import typings.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
import typings.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/locales", JSImport.Namespace)
@js.native
object localesMod extends js.Object {
  /* keyof @ant-design/pro-layout.anon.EnUS */ /* Rewritten from type alias, can be one of: 
    - typings.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`en-US`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
  */
  trait localeType extends js.Object
  
  def default(): StringDictionary[String] = js.native
  @JSName("default")
  def default_enUS(locale: `en-US`): StringDictionary[String] = js.native
  @JSName("default")
  def default_itIT(locale: `it-IT`): StringDictionary[String] = js.native
  @JSName("default")
  def default_zhCN(locale: `zh-CN`): StringDictionary[String] = js.native
  @JSName("default")
  def default_zhTW(locale: `zh-TW`): StringDictionary[String] = js.native
  def getLanguage(): String = js.native
}

