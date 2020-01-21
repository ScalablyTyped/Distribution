package typings.atom.statusBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBar extends js.Object {
  /**
    *  Add a tile to the left side of the status bar. Lower priority tiles are placed
    *  further to the left.
    */
  def addLeftTile(options: AddTileOptions): Tile
  /**
    *  Add a tile to the right side of the status bar. Lower priority tiles are placed
    *  further to the right.
    */
  def addRightTile(options: AddTileOptions): Tile
  /** Retrieve all of the tiles on the left side of the status bar. */
  def getLeftTiles(): js.Array[Tile]
  /** Retrieve all of the tiles on the right side of the status bar. */
  def getRightTiles(): js.Array[Tile]
}

object StatusBar {
  @scala.inline
  def apply(
    addLeftTile: AddTileOptions => Tile,
    addRightTile: AddTileOptions => Tile,
    getLeftTiles: () => js.Array[Tile],
    getRightTiles: () => js.Array[Tile]
  ): StatusBar = {
    val __obj = js.Dynamic.literal(addLeftTile = js.Any.fromFunction1(addLeftTile), addRightTile = js.Any.fromFunction1(addRightTile), getLeftTiles = js.Any.fromFunction0(getLeftTiles), getRightTiles = js.Any.fromFunction0(getRightTiles))
  
    __obj.asInstanceOf[StatusBar]
  }
}

