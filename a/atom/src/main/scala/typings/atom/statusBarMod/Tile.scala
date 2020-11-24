package typings.atom.statusBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile extends js.Object {
  
  /** Remove the Tile from the status bar. */
  def destroy(): Unit = js.native
  
  /** Retrieve the Tile's item. */
  def getItem(): js.Object = js.native
  
  /** Retrieve the priority that was assigned to the Tile when it was created. */
  def getPriority(): Double = js.native
}
object Tile {
  
  @scala.inline
  def apply(destroy: () => Unit, getItem: () => js.Object, getPriority: () => Double): Tile = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority))
    __obj.asInstanceOf[Tile]
  }
  
  @scala.inline
  implicit class TileOps[Self <: Tile] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: () => js.Object): Self = this.set("getItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPriority(value: () => Double): Self = this.set("getPriority", js.Any.fromFunction0(value))
  }
}
