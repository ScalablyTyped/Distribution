package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsideInvalidate extends js.Object {
  var invalidate: js.UndefOr[
    atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch
  ] = js.undefined
}

object Anon_InsideInvalidate {
  @scala.inline
  def apply(
    invalidate: atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch = null
  ): Anon_InsideInvalidate = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsideInvalidate]
  }
}

