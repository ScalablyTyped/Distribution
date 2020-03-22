package typings.antDesignReactNative.portalManagerMod

import typings.antDesignReactNative.AnonChildrenReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var portals: js.Array[AnonChildrenReactNode]
}

object State {
  @scala.inline
  def apply(portals: js.Array[AnonChildrenReactNode]): State = {
    val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

