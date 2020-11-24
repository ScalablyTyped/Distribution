package typings.ava.pluginMod.SharedWorker.Experimental

import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestWorker[Data] extends js.Object {
  
  val file: String = js.native
  
  val id: String = js.native
  
  def publish(data: Data): PublishedMessage[Data] = js.native
  
  def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]] = js.native
  
  def teardown[TeardownFn /* <: js.Function0[Unit] */](fn: TeardownFn): TeardownFn = js.native
}
object TestWorker {
  
  @scala.inline
  def apply[Data](
    file: String,
    id: String,
    publish: Data => PublishedMessage[Data],
    subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]],
    teardown: js.Any => js.Any
  ): TestWorker[Data] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction1(publish), subscribe = js.Any.fromFunction0(subscribe), teardown = js.Any.fromFunction1(teardown))
    __obj.asInstanceOf[TestWorker[Data]]
  }
  
  @scala.inline
  implicit class TestWorkerOps[Self <: TestWorker[_], Data] (val x: Self with TestWorker[Data]) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: Data => PublishedMessage[Data]): Self = this.set("publish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = this.set("subscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTeardown(value: js.Any => js.Any): Self = this.set("teardown", js.Any.fromFunction1(value))
  }
}
