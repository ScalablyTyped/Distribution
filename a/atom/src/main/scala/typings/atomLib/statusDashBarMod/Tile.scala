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
  def apply(
    destroy: js.Function0[scala.Unit],
    getItem: js.Function0[js.Object],
    getPriority: js.Function0[scala.Double]
  ): Tile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getPriority")(getPriority)
    __obj.asInstanceOf[Tile]
  }
}

