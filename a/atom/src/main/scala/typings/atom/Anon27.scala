package typings.atom

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon27 extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
}

object Anon27 {
  @scala.inline
  def apply(clipDirection: backward | forward | closest = null): Anon27 = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon27]
  }
}

