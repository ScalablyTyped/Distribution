package typings.amapJsApiGeocoder

import typings.amapJsApiGeocoder.AMap.Geocoder.Options
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
      * 地理编码与逆地理编码
      * @param options 选项
      */
    class Geocoder ()
      extends typings.amapJsApiGeocoder.AMap.Geocoder {
      def this(options: Options) = this()
    }
    
  }
  
}

