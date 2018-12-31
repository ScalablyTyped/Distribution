package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionChangedEvent extends js.Object {
  var newBufferRange: Range
  var newScreenRange: Range
  var oldBufferRange: Range
  var oldScreenRange: Range
  var selection: Selection
}

