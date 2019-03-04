package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerOptions extends js.Object {
  var detectRetina: scala.Boolean
  var errorUrl: java.lang.String
  var map: Map
  var opacity: scala.Double
  var tileSize: scala.Double
  var tileUrl: java.lang.String
  var zIndex: scala.Double
  var zooms: js.Array[scala.Double]
  def getTileUrl(x: scala.Double, y: scala.Double, z: scala.Double): java.lang.String
}

object TileLayerOptions {
  @scala.inline
  def apply(
    detectRetina: scala.Boolean,
    errorUrl: java.lang.String,
    getTileUrl: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    map: Map,
    opacity: scala.Double,
    tileSize: scala.Double,
    tileUrl: java.lang.String,
    zIndex: scala.Double,
    zooms: js.Array[scala.Double]
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal(detectRetina = detectRetina, errorUrl = errorUrl, getTileUrl = getTileUrl, map = map, opacity = opacity, tileSize = tileSize, tileUrl = tileUrl, zIndex = zIndex, zooms = zooms)
  
    __obj.asInstanceOf[TileLayerOptions]
  }
}

