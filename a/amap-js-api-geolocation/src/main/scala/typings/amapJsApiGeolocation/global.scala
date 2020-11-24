package typings.amapJsApiGeolocation

import typings.amapJsApiGeolocation.AMap.Geolocation.Options
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
      * 定位服务
      * @param options 选项
      */
    class Geolocation ()
      extends typings.amapJsApiGeolocation.AMap.Geolocation {
      def this(options: Options) = this()
    }
  }
}
