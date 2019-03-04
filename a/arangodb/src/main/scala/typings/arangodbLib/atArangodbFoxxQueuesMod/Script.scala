package typings
package arangodbLib.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Script extends js.Object {
  var mount: java.lang.String
  var name: java.lang.String
}

object Script {
  @scala.inline
  def apply(mount: java.lang.String, name: java.lang.String): Script = {
    val __obj = js.Dynamic.literal(mount = mount, name = name)
  
    __obj.asInstanceOf[Script]
  }
}

