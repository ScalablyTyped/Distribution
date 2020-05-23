package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object AMap extends js.Object {
    @js.native
    /**
      * 地点搜索服务
      * @param options 选项
      */
    class PlaceSearch ()
      extends typings.amapJsApiPlaceSearch.AMap.PlaceSearch {
      def this(options: Options) = this()
    }
    
  }
  
}

