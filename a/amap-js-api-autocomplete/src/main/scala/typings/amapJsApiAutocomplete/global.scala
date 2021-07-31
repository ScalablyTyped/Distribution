package typings.amapJsApiAutocomplete

import typings.amapJsApiAutocomplete.AMap.Autocomplete.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Autocomplete")
    @js.native
    /**
      * 输入提示，根据输入关键字提示匹配信息
      * @param options 选项
      */
    class Autocomplete ()
      extends StObject
         with typings.amapJsApiAutocomplete.AMap.Autocomplete {
      def this(options: Options) = this()
    }
  }
}
