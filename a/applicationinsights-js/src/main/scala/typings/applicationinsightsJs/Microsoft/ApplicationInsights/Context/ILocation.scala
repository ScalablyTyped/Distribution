package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocation extends js.Object {
  /**
    * Client IP address for reverse lookup
    */
  var ip: String = js.native
}

object ILocation {
  @scala.inline
  def apply(ip: String): ILocation = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
  @scala.inline
  implicit class ILocationOps[Self <: ILocation] (val x: Self) extends AnyVal {
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
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
  }
  
}

