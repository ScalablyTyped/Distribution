package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `27` extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
}

object `27` {
  @scala.inline
  def apply(clipDirection: backward | forward | closest = null): `27` = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
}

