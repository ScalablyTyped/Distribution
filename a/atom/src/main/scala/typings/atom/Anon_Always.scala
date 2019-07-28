package typings.atom

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  var newValue: no | yes | always
  var oldValue: js.UndefOr[no | yes | always] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(newValue: no | yes | always, oldValue: no | yes | always = null): Anon_Always = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Always]
  }
}

