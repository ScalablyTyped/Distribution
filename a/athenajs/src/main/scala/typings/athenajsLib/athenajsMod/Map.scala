package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Map")
@js.native
class Map protected () extends js.Object {
  def this(options: MapOptions) = this()
  var duration: scala.Double = js.native
  var height: scala.Double = js.native
  var numCols: scala.Double = js.native
  var numRows: scala.Double = js.native
  var tileHeight: scala.Double = js.native
  var tileWidth: scala.Double = js.native
  var width: scala.Double = js.native
  def addObject(obj: Drawable): scala.Unit = js.native
  def addObject(obj: Drawable, layerIndex: scala.Double): scala.Unit = js.native
  def addTileSet(tiles: js.Array[TileDesc]): scala.Unit = js.native
  def checkMatrixForCollision(
    buffer: js.Array[scala.Double],
    matrixWidth: scala.Double,
    x: scala.Double,
    y: scala.Double,
    behavior: scala.Double
  ): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def clear(tileNum: scala.Double): scala.Unit = js.native
  def clear(tileNum: scala.Double, behavior: scala.Double): scala.Unit = js.native
  def getTileBehaviorAtIndex(col: scala.Double, row: scala.Double): scala.Double = js.native
  def getTileIndexFromPixel(x: scala.Double, y: scala.Double): pixelPos = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def respawn(): scala.Unit = js.native
  def setData(map: stdLib.Uint8Array, behaviors: stdLib.Uint8Array): scala.Unit = js.native
  def setEasing(easing: java.lang.String): scala.Unit = js.native
  def shift(startLine: scala.Double, height: scala.Double): scala.Unit = js.native
  def updateTile(col: scala.Double, row: scala.Double): scala.Unit = js.native
  def updateTile(col: scala.Double, row: scala.Double, tileNum: scala.Double): scala.Unit = js.native
  def updateTile(col: scala.Double, row: scala.Double, tileNum: scala.Double, behavior: scala.Double): scala.Unit = js.native
}

