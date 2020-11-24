package typings.amqp.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueCallback extends js.Object {
  
  var channel: Double = js.native
  
  var consumerTagListeners: StringDictionary[js.Any] = js.native
  
  var consumerTagOptions: StringDictionary[js.Any] = js.native
  
  var name: String = js.native
  
  var options: QueueOptions = js.native
  
  var state: String = js.native
}
object QueueCallback {
  
  @scala.inline
  def apply(
    channel: Double,
    consumerTagListeners: StringDictionary[js.Any],
    consumerTagOptions: StringDictionary[js.Any],
    name: String,
    options: QueueOptions,
    state: String
  ): QueueCallback = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], consumerTagListeners = consumerTagListeners.asInstanceOf[js.Any], consumerTagOptions = consumerTagOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueCallback]
  }
  
  @scala.inline
  implicit class QueueCallbackOps[Self <: QueueCallback] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerTagListeners(value: StringDictionary[js.Any]): Self = this.set("consumerTagListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerTagOptions(value: StringDictionary[js.Any]): Self = this.set("consumerTagOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: QueueOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
