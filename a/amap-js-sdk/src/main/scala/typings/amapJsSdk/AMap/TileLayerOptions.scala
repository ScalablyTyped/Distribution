package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(detectRetina = detectRetina.asInstanceOf[js.Any], errorUrl = errorUrl.asInstanceOf[js.Any], getTileUrl = js.Any.fromFunction3(getTileUrl), map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], tileUrl = tileUrl.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any], zooms = zooms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TileLayerOptions]
  }
}

