package typings
package antdLib.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsEntity extends js.Object {
  var prefix: java.lang.String
  var value: java.lang.String
}

object MentionsEntity {
  @scala.inline
  def apply(prefix: java.lang.String, value: java.lang.String): MentionsEntity = {
    val __obj = js.Dynamic.literal(prefix = prefix, value = value)
  
    __obj.asInstanceOf[MentionsEntity]
  }
}

