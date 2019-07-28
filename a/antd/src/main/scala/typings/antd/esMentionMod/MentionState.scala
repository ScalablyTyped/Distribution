package typings.antd.esMentionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionState extends js.Object {
  var filteredSuggestions: js.UndefOr[js.Array[_]] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
}

object MentionState {
  @scala.inline
  def apply(filteredSuggestions: js.Array[_] = null, focus: js.UndefOr[Boolean] = js.undefined): MentionState = {
    val __obj = js.Dynamic.literal()
    if (filteredSuggestions != null) __obj.updateDynamic("filteredSuggestions")(filteredSuggestions)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    __obj.asInstanceOf[MentionState]
  }
}

