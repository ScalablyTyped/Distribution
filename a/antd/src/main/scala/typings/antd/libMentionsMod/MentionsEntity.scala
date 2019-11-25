package typings.antd.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsEntity extends js.Object {
  var prefix: String
  var value: String
}

object MentionsEntity {
  @scala.inline
  def apply(prefix: String, value: String): MentionsEntity = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MentionsEntity]
  }
}

