package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcTimeout extends js.Object {
  /**
    * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be idle. The default value is none.
    */
  var idle: js.UndefOr[Duration] = js.native
  /**
    * An object that represents a per request timeout. The default value is 15 seconds. If you set a higher timeout, then make sure that the higher value is set for each App Mesh resource in a conversation. For example, if a virtual node backend uses a virtual router provider to route to another virtual node, then the timeout should be greater than 15 seconds for the source and destination virtual node and the route.
    */
  var perRequest: js.UndefOr[Duration] = js.native
}

object GrpcTimeout {
  @scala.inline
  def apply(): GrpcTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcTimeout]
  }
  @scala.inline
  implicit class GrpcTimeoutOps[Self <: GrpcTimeout] (val x: Self) extends AnyVal {
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
    def setIdle(value: Duration): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
    @scala.inline
    def setPerRequest(value: Duration): Self = this.set("perRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerRequest: Self = this.set("perRequest", js.undefined)
  }
  
}

