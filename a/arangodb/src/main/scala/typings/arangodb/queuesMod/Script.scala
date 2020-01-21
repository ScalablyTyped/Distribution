package typings.arangodb.queuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Script extends js.Object {
  var mount: String
  var name: String
}

object Script {
  @scala.inline
  def apply(mount: String, name: String): Script = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Script]
  }
}

