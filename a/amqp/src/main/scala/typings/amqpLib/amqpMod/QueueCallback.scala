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

