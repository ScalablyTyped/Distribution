package typings.antDesignReactNative.portalManagerMod

import typings.antDesignReactNative.anon.ChildrenReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var portals: js.Array[ChildrenReactNode]
}

object State {
  @scala.inline
  def apply(portals: js.Array[ChildrenReactNode]): State = {
    val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

