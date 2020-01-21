package typings.amqpConnectionManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SetupFunc = (js.Function2[
    /* channel */ typings.amqplib.mod.ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[typings.std.Error], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* channel */ typings.amqplib.mod.ConfirmChannel, js.Promise[scala.Unit]])
}
