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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("consumerTagListeners")(consumerTagListeners)
    __obj.updateDynamic("consumerTagOptions")(consumerTagOptions)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[QueueCallback]
  }
}

