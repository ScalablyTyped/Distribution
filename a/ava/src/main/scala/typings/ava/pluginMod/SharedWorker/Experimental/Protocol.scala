package typings.ava.pluginMod.SharedWorker.Experimental

import typings.ava.avaStrings.experimental
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocol[Data] extends js.Object {
  
  def broadcast(data: Data): BroadcastMessage[Data] = js.native
  
  val initialData: Data = js.native
  
  val protocol: experimental = js.native
  
  def ready(): Protocol[Data] = js.native
  
  def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]] = js.native
  
  def testWorkers(): AsyncIterableIterator[TestWorker[Data]] = js.native
}
object Protocol {
  
  @scala.inline
  def apply[Data](
    broadcast: Data => BroadcastMessage[Data],
    initialData: Data,
    protocol: experimental,
    ready: () => Protocol[Data],
    subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]],
    testWorkers: () => AsyncIterableIterator[TestWorker[Data]]
  ): Protocol[Data] = {
    val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction1(broadcast), initialData = initialData.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready), subscribe = js.Any.fromFunction0(subscribe), testWorkers = js.Any.fromFunction0(testWorkers))
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
    def setBroadcast(value: Data => BroadcastMessage[Data]): Self = this.set("broadcast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialData(value: Data): Self = this.set("initialData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: experimental): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: () => Protocol[Data]): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = this.set("subscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTestWorkers(value: () => AsyncIterableIterator[TestWorker[Data]]): Self = this.set("testWorkers", js.Any.fromFunction0(value))
  }
}
