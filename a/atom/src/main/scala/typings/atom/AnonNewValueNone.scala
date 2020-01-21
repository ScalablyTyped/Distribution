package typings.atom

import typings.atom.atomStrings.none
import typings.atom.atomStrings.textOrSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueNone extends js.Object {
  var newValue: none | textOrSnippet
  var oldValue: js.UndefOr[none | textOrSnippet] = js.undefined
}

object AnonNewValueNone {
  @scala.inline
  def apply(newValue: none | textOrSnippet, oldValue: none | textOrSnippet = null): AnonNewValueNone = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueNone]
  }
}

