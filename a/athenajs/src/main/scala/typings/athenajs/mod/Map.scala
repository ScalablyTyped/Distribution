package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Map")
@js.native
open class Map protected () extends StObject {
  def this(options: MapOptions) = this()
  
  def addObject(obj: Drawable): Unit = js.native
  def addObject(obj: Drawable, layerIndex: Double): Unit = js.native
  
  def addTileSet(tiles: js.Array[TileDesc]): Unit = js.native
  
  def checkMatrixForCollision(buffer: js.Array[Double], matrixWidth: Double, x: Double, y: Double, behavior: Double): Boolean = js.native
  
  def clear(): Unit = js.native
  def clear(tileNum: Double): Unit = js.native
  def clear(tileNum: Double, behavior: Double): Unit = js.native
  def clear(tileNum: Unit, behavior: Double): Unit = js.native
  
  var duration: Double = js.native
  
  def getTileBehaviorAtIndex(col: Double, row: Double): Double = js.native
  
  def getTileIndexFromPixel(x: Double, y: Double): pixelPos = js.native
  
  var height: Double = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  var numCols: Double = js.native
  
  var numRows: Double = js.native
  
  def respawn(): Unit = js.native
  
  def setData(map: js.typedarray.Uint8Array, behaviors: js.typedarray.Uint8Array): Unit = js.native
  
  def setEasing(easing: String): Unit = js.native
  
  def shift(startLine: Double, height: Double): Unit = js.native
  
  var tileHeight: Double = js.native
  
  var tileWidth: Double = js.native
  
  def updateTile(col: Double, row: Double): Unit = js.native
  def updateTile(col: Double, row: Double, tileNum: Double): Unit = js.native
  def updateTile(col: Double, row: Double, tileNum: Double, behavior: Double): Unit = js.native
  def updateTile(col: Double, row: Double, tileNum: Unit, behavior: Double): Unit = js.native
  
  var width: Double = js.native
}
