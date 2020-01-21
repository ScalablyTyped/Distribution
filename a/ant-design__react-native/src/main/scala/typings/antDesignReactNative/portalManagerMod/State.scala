package typings.antDesignReactNative.portalManagerMod

import typings.antDesignReactNative.AnonChildrenKeyNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var portals: js.Array[AnonChildrenKeyNumber]
}

object State {
  @scala.inline
  def apply(portals: js.Array[AnonChildrenKeyNumber]): State = {
    val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

