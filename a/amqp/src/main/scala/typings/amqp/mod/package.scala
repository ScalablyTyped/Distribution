package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function1[/* value */ T, scala.Unit]
  
  type SubscribeCallback = js.Function4[
    /* message */ js.Any, 
    /* headers */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* deliveryInfo */ typings.amqp.mod.DeliveryInfo, 
    /* ack */ typings.amqp.mod.Ack, 
    scala.Unit
  ]
}
