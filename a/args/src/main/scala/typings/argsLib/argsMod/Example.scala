package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Example extends js.Object {
  var description: java.lang.String
  var usage: java.lang.String
}

object Example {
  @scala.inline
  def apply(description: java.lang.String, usage: java.lang.String): Example = {
    val __obj = js.Dynamic.literal(description = description, usage = usage)
  
    __obj.asInstanceOf[Example]
  }
}

