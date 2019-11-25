package typings.amqp.amqpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueCallback extends js.Object {
  var channel: Double
  var consumerTagListeners: StringDictionary[js.Any]
  var consumerTagOptions: StringDictionary[js.Any]
  var name: String
  var options: QueueOptions
  var state: String
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
}

