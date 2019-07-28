package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerOptions extends js.Object {
  var detectRetina: Boolean
  var errorUrl: String
  var map: Map
  var opacity: Double
  var tileSize: Double
  var tileUrl: String
  var zIndex: Double
  var zooms: js.Array[Double]
  def getTileUrl(x: Double, y: Double, z: Double): String
}

object TileLayerOptions {
  @scala.inline
  def apply(
    detectRetina: Boolean,
    errorUrl: String,
    getTileUrl: (Double, Double, Double) => String,
    map: Map,
    opacity: Double,
    tileSize: Double,
    tileUrl: String,
    zIndex: Double,
    zooms: js.Array[Double]
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal(detectRetina = detectRetina, errorUrl = errorUrl, getTileUrl = js.Any.fromFunction3(getTileUrl), map = map, opacity = opacity, tileSize = tileSize, tileUrl = tileUrl, zIndex = zIndex, zooms = zooms)
  
    __obj.asInstanceOf[TileLayerOptions]
  }
}

