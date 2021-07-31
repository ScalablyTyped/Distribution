package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesMod {
  
  @JSImport("@ant-design/pro-layout/lib/locales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[StringDictionary[String]]
  
  @scala.inline
  def getLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String]
  
  /* keyof @ant-design/pro-layout.anon.EnUS */ /* Rewritten from type alias, can be one of: 
    - typings.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`en-US`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
  */
  trait LocaleType extends StObject
}
