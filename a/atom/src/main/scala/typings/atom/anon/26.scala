package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `26` extends js.Object {
  var clipDirection: backward | forward | closest
}

object `26` {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): `26` = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
}

