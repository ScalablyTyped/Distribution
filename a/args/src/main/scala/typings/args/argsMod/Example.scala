package typings.args.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Example extends js.Object {
  var description: String
  var usage: String
}

object Example {
  @scala.inline
  def apply(description: String, usage: String): Example = {
    val __obj = js.Dynamic.literal(description = description, usage = usage)
  
    __obj.asInstanceOf[Example]
  }
}

