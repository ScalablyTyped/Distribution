package typings.ava.pluginMod.SharedWorker.Plugin.Experimental

import typings.ava.avaStrings.experimental
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocol[Data] extends js.Object {
  
  val available: js.Promise[Unit] = js.native
  
  val currentlyAvailable: Boolean = js.native
  
  val protocol: experimental = js.native
  
  def publish(data: Data): PublishedMessage[Data] = js.native
  
  def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]] = js.native
}
object Protocol {
  
  @scala.inline
  def apply[Data](
    available: js.Promise[Unit],
    currentlyAvailable: Boolean,
    protocol: experimental,
    publish: Data => PublishedMessage[Data],
    subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]]
  ): Protocol[Data] = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], currentlyAvailable = currentlyAvailable.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], publish = js.Any.fromFunction1(publish), subscribe = js.Any.fromFunction0(subscribe))
    __obj.asInstanceOf[Protocol[Data]]
  }
  
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol[_], Data] (val x: Self with Protocol[Data]) extends AnyVal {
    
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
    def setAvailable(value: js.Promise[Unit]): Self = this.set("available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentlyAvailable(value: Boolean): Self = this.set("currentlyAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: experimental): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: Data => PublishedMessage[Data]): Self = this.set("publish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = this.set("subscribe", js.Any.fromFunction0(value))
  }
}
