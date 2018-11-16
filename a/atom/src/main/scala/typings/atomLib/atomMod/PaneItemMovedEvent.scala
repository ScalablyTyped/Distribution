package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaneItemMovedEvent extends js.Object {
  /** The removed pane item. */
  var item: js.Object
  /** A number indicating where the item is now located. */
  var newIndex: scala.Double
  /** A number indicating where the item was located. */
  var oldIndex: scala.Double
}

