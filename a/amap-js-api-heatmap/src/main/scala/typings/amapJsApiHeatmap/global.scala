package typings.amapJsApiHeatmap

import typings.amapJsApi.AMap.Map
import typings.amapJsApiHeatmap.AMap.Heatmap.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    @js.native
    class Heatmap protected ()
      extends typings.amapJsApiHeatmap.AMap.Heatmap {
      /**
        * 热力图
        * @param map 地图对象
        * @param opts 热力图选项
        */
      def this(map: Map) = this()
      def this(map: Map, opts: Options) = this()
    }
  }
}
