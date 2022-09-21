package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.PlaceSearch")
    @js.native
    /**
      * 地点搜索服务
      * @param options 选项
      */
    open class PlaceSearch ()
      extends StObject
         with typings.amapJsApiPlaceSearch.AMap.PlaceSearch {
      def this(options: Options) = this()
    }
  }
}
