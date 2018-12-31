package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuManager extends js.Object {
  /** Adds the given items to the application menu. */
  def add(items: js.Array[MenuOptions]): Disposable
  /** Refreshes the currently visible menu. */
  def update(): scala.Unit
}

