package typings.amapJsApiHeatmap

import typings.amapJsApi.AMap.Map
import typings.amapJsApiHeatmap.AMap.Heatmap.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Heatmap")
    @js.native
    class Heatmap protected ()
      extends StObject
         with typings.amapJsApiHeatmap.AMap.Heatmap {
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
