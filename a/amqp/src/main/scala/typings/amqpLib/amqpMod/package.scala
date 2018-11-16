package typings
package amqpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpMod {
  type Callback[T] = js.Function1[/* value */ T, scala.Unit]
  type SubscribeCallback = js.Function4[
    /* message */ js.Any, 
    /* headers */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* deliveryInfo */ DeliveryInfo, 
    /* ack */ Ack, 
    scala.Unit
  ]
}
