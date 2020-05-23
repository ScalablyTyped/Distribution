package typings.asana.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gid extends js.Object {
  var gid: String
  var name: String
}

object Gid {
  @scala.inline
  def apply(gid: String, name: String): Gid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gid]
  }
}

