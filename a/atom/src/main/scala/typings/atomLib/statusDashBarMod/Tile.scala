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

