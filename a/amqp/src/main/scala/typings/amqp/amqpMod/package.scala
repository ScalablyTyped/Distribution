package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpMod {
  import org.scalablytyped.runtime.StringDictionary

  type Callback[T] = js.Function1[/* value */ T, Unit]
  type SubscribeCallback = js.Function4[
    /* message */ js.Any, 
    /* headers */ StringDictionary[js.Any], 
    /* deliveryInfo */ DeliveryInfo, 
    /* ack */ Ack, 
    Unit
  ]
}
