package typings
package amqpDashConnectionDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpDashConnectionDashManagerMod {
  type SetupFunc = (js.Function2[
    /* channel */ amqplibLib.amqplibMod.ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* channel */ amqplibLib.amqplibMod.ConfirmChannel, stdLib.Promise[scala.Unit]])
}
