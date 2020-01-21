package typings.amapJsSdk.AMap

import typings.amapJsSdk.AnonAutoRefresh
import typings.amapJsSdk.AnonDetectRetina
import typings.amapJsSdk.AnonDetectRetinaMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
class TileLayer () extends Layer {
  def this(tileOpt: AnonDetectRetina) = this()
}

@JSGlobal("AMap.TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  abstract class MapTypeLayer () extends Layer {
    def this(options: AnonDetectRetinaMap) = this()
  }
  
  @js.native
  class RoadNet () extends MapTypeLayer
  
  @js.native
  class Satellite () extends MapTypeLayer
  
  @js.native
  class Traffic () extends MapTypeLayer {
    def this(options: AnonAutoRefresh) = this()
    var autoRefresh: Boolean = js.native
    var interval: Double = js.native
  }
  
}

