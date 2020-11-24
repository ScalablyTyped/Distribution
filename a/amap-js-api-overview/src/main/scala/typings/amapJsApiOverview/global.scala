package typings.amapJsApiOverview

import typings.amapJsApi.AMap.TileLayer
import typings.amapJsApiOverview.AMap.OverView.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    /**
      * 地图鹰眼插件
      */
    @js.native
    class OverView[L /* <: TileLayer */] ()
      extends typings.amapJsApiOverview.AMap.OverView[L] {
      def this(options: Options[L]) = this()
    }
  }
}
