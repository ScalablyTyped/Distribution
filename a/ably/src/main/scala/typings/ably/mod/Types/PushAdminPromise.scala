package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushAdminPromise extends js.Object {
  
  var channelSubscriptions: PushChannelSubscriptionsPromise = js.native
  
  var deviceRegistrations: PushDeviceRegistrationsPromise = js.native
  
  def publish(recipient: js.Any, payload: js.Any): js.Promise[Unit] = js.native
}
object PushAdminPromise {
  
  @scala.inline
  def apply(
    channelSubscriptions: PushChannelSubscriptionsPromise,
    deviceRegistrations: PushDeviceRegistrationsPromise,
    publish: (js.Any, js.Any) => js.Promise[Unit]
  ): PushAdminPromise = {
    val __obj = js.Dynamic.literal(channelSubscriptions = channelSubscriptions.asInstanceOf[js.Any], deviceRegistrations = deviceRegistrations.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish))
    __obj.asInstanceOf[PushAdminPromise]
  }
  
  @scala.inline
  implicit class PushAdminPromiseOps[Self <: PushAdminPromise] (val x: Self) extends AnyVal {
    
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
    def setChannelSubscriptions(value: PushChannelSubscriptionsPromise): Self = this.set("channelSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRegistrations(value: PushDeviceRegistrationsPromise): Self = this.set("deviceRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: (js.Any, js.Any) => js.Promise[Unit]): Self = this.set("publish", js.Any.fromFunction2(value))
  }
}
