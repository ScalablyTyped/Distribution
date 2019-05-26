package typings
package antdLib.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsConfig extends js.Object {
  var prefix: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var split: js.UndefOr[java.lang.String] = js.undefined
}

object MentionsConfig {
  @scala.inline
  def apply(prefix: java.lang.String | js.Array[java.lang.String] = null, split: java.lang.String = null): MentionsConfig = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[MentionsConfig]
  }
}

