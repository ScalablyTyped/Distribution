package typings.atom

import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueOldValueSubsequence extends js.Object {
  var newValue: Subsequence | Symbol
  var oldValue: js.UndefOr[Subsequence | Symbol] = js.undefined
}

object AnonNewValueOldValueSubsequence {
  @scala.inline
  def apply(newValue: Subsequence | Symbol, oldValue: Subsequence | Symbol = null): AnonNewValueOldValueSubsequence = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueOldValueSubsequence]
  }
}

