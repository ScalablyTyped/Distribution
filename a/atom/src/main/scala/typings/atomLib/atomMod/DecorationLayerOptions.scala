package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationLayerOptions extends SharedDecorationOptions {
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[
    atomLib.atomLibStrings.line | atomLib.atomLibStrings.`line-number` | atomLib.atomLibStrings.highlight | atomLib.atomLibStrings.block
  ] = js.undefined
}

