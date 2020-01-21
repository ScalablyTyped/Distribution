package typings.asana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGid extends js.Object {
  var gid: String
  var name: String
}

object AnonGid {
  @scala.inline
  def apply(gid: String, name: String): AnonGid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGid]
  }
}

