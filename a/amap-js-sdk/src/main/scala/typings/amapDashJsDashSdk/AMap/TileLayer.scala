package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_AutoRefresh
import typings.amapDashJsDashSdk.Anon_DetectRetina
import typings.amapDashJsDashSdk.Anon_DetectRetinaMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
class TileLayer () extends Layer {
  def this(tileOpt: Anon_DetectRetina) = this()
}

@JSGlobal("AMap.TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  abstract class MapTypeLayer () extends Layer {
    def this(options: Anon_DetectRetinaMap) = this()
  }
  
  @js.native
  class RoadNet () extends MapTypeLayer
  
  @js.native
  class Satellite () extends MapTypeLayer
  
  @js.native
  class Traffic () extends MapTypeLayer {
    def this(options: Anon_AutoRefresh) = this()
    var autoRefresh: Boolean = js.native
    var interval: Double = js.native
  }
  
}

