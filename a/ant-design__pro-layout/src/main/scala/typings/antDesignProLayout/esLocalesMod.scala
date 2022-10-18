package typings.antDesignProLayout

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLocalesMod {
  
  @JSImport("@ant-design/pro-layout/es/locales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gLocaleObject(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gLocaleObject")().asInstanceOf[Record[String, String]]
  
  inline def getLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String]
  
  /* keyof @ant-design/pro-layout.anon.EnUS */ /* Rewritten from type alias, can be one of: 
    - typings.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`en-US`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
    - typings.antDesignProLayout.antDesignProLayoutStrings.`ko-KR`
  */
  trait LocaleType extends StObject
}
