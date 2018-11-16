package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DecorationPropsChangedEvent extends js.Object {
  /** Object the new parameters the decoration now has */
  var newProperties: DecorationOptions
  /** Object the old parameters the decoration used to have. */
  var oldProperties: DecorationOptions
}

