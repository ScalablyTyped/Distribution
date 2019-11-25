package typings.antd.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsConfig extends js.Object {
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  var split: js.UndefOr[String] = js.undefined
}

object MentionsConfig {
  @scala.inline
  def apply(prefix: String | js.Array[String] = null, split: String = null): MentionsConfig = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsConfig]
  }
}

