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

