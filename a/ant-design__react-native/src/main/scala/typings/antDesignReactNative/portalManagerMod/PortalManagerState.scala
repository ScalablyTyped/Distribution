package typings.antDesignReactNative.portalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalManagerState extends js.Object {
  var portals: js.Array[_] = js.native
}

object PortalManagerState {
  @scala.inline
  def apply(portals: js.Array[_]): PortalManagerState = {
    val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalManagerState]
  }
  @scala.inline
  implicit class PortalManagerStateOps[Self <: PortalManagerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPortalsVarargs(value: js.Any*): Self = this.set("portals", js.Array(value :_*))
    @scala.inline
    def setPortals(value: js.Array[_]): Self = this.set("portals", value.asInstanceOf[js.Any])
  }
  
}

