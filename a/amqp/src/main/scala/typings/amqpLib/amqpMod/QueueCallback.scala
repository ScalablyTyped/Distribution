package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueCallback extends js.Object {
  var channel: scala.Double
  var consumerTagListeners: org.scalablytyped.runtime.StringDictionary[js.Any]
  var consumerTagOptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  var name: java.lang.String
  var options: QueueOptions
  var state: java.lang.String
}

object QueueCallback {
  @scala.inline
  def apply(
    channel: scala.Double,
    consumerTagListeners: org.scalablytyped.runtime.StringDictionary[js.Any],
    consumerTagOptions: org.scalablytyped.runtime.StringDictionary[js.Any],
    name: java.lang.String,
    options: QueueOptions,
    state: java.lang.String
  ): QueueCallback = {
    val __obj = js.Dynamic.literal(channel = channel, consumerTagListeners = consumerTagListeners, consumerTagOptions = consumerTagOptions, name = name, options = options, state = state)
  
    __obj.asInstanceOf[QueueCallback]
  }
}

