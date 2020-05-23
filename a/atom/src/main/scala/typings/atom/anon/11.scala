package typings.atom.anon

import typings.atom.atomStrings.none
import typings.atom.atomStrings.textOrSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `11` extends js.Object {
  var newValue: none | textOrSnippet
  var oldValue: js.UndefOr[none | textOrSnippet] = js.undefined
}

object `11` {
  @scala.inline
  def apply(newValue: none | textOrSnippet, oldValue: none | textOrSnippet = null): `11` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
}

