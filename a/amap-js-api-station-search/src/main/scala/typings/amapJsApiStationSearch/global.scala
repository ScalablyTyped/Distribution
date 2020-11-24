package typings.amapJsApiStationSearch

import typings.amapJsApiStationSearch.AMap.StationSearch.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    /**
      * 公交站点查询服务
      */
    @js.native
    class StationSearch ()
      extends typings.amapJsApiStationSearch.AMap.StationSearch {
      def this(options: Options) = this()
    }
  }
}
