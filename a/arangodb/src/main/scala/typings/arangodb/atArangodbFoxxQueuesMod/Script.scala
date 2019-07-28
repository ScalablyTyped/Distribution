package typings.arangodb.atArangodbFoxxQueuesMod

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
    val __obj = js.Dynamic.literal(mount = mount, name = name)
  
    __obj.asInstanceOf[Script]
  }
}

