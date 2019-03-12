package typings
package atomLib.statusDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile extends js.Object {
  /** Remove the Tile from the status bar. */
  def destroy(): scala.Unit
  /** Retrieve the Tile's item. */
  def getItem(): js.Object
  /** Retrieve the priority that was assigned to the Tile when it was created. */
  def getPriority(): scala.Double
}

object Tile {
  @scala.inline
  def apply(destroy: () => scala.Unit, getItem: () => js.Object, getPriority: () => scala.Double): Tile = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority))
  
    __obj.asInstanceOf[Tile]
  }
}

