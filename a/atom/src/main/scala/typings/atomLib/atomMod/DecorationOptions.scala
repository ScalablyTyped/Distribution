package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationOptions extends SharedDecorationOptions {
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[java.lang.String] = js.undefined
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[
    atomLib.atomLibStrings.line | atomLib.atomLibStrings.`line-number` | atomLib.atomLibStrings.highlight | atomLib.atomLibStrings.overlay | atomLib.atomLibStrings.gutter | atomLib.atomLibStrings.block
  ] = js.undefined
}

