package typings.asana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  var gid: String
  var name: String
}

object Anon_Gid {
  @scala.inline
  def apply(gid: String, name: String): Anon_Gid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Gid]
  }
}

