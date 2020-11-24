package typings.amapJsApiDistrictSearch

import typings.amapJsApiDistrictSearch.AMap.DistrictSearch.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    @js.native
    /**
      * 行政区查询
      * @param options 选项
      */
    class DistrictSearch ()
      extends typings.amapJsApiDistrictSearch.AMap.DistrictSearch {
      def this(options: Options) = this()
    }
  }
}
