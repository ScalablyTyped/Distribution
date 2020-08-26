package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.anon.AutoRefresh
import typings.amapJsSdk.anon.DetectRetina
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
class TileLayer ()
  extends typings.amapJsSdk.AMap.Layer {
  def this(tileOpt: DetectRetina) = this()
}

@JSGlobal("AMap.TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  abstract class MapTypeLayer ()
    extends typings.amapJsSdk.AMap.Layer {
    def this(options: typings.amapJsSdk.anon.Map) = this()
  }
  
  @js.native
  class RoadNet ()
    extends typings.amapJsSdk.AMap.Layer
  
  @js.native
  class Satellite ()
    extends typings.amapJsSdk.AMap.Layer
  
  @js.native
  class Traffic ()
    extends typings.amapJsSdk.AMap.TileLayer.Traffic {
    def this(options: AutoRefresh) = this()
  }
  
}

