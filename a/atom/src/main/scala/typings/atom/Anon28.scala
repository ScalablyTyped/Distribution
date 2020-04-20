package typings.atom

import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon28 extends js.Object {
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object Anon28 {
  @scala.inline
  def apply(invalidate: never | surround | overlap | inside | touch = null): Anon28 = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon28]
  }
}

