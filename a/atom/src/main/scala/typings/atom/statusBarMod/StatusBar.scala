package typings.atom.statusBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusBar extends js.Object {
  
  /**
    *  Add a tile to the left side of the status bar. Lower priority tiles are placed
    *  further to the left.
    */
  def addLeftTile(options: AddTileOptions): Tile = js.native
  
  /**
    *  Add a tile to the right side of the status bar. Lower priority tiles are placed
    *  further to the right.
    */
  def addRightTile(options: AddTileOptions): Tile = js.native
  
  /** Retrieve all of the tiles on the left side of the status bar. */
  def getLeftTiles(): js.Array[Tile] = js.native
  
  /** Retrieve all of the tiles on the right side of the status bar. */
  def getRightTiles(): js.Array[Tile] = js.native
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
  
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddLeftTile(value: AddTileOptions => Tile): Self = this.set("addLeftTile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddRightTile(value: AddTileOptions => Tile): Self = this.set("addRightTile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLeftTiles(value: () => js.Array[Tile]): Self = this.set("getLeftTiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRightTiles(value: () => js.Array[Tile]): Self = this.set("getRightTiles", js.Any.fromFunction0(value))
  }
}
