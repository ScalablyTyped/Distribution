package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: TcpRouteAction = js.native
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[TcpTimeout] = js.native
}

object TcpRoute {
  @scala.inline
  def apply(action: TcpRouteAction): TcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpRoute]
  }
  @scala.inline
  implicit class TcpRouteOps[Self <: TcpRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: TcpRouteAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: TcpTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

