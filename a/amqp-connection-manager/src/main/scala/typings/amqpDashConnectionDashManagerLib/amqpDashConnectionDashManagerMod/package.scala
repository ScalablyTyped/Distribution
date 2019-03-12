package typings
package amqpDashConnectionDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpDashConnectionDashManagerMod {
  type SetupFunc = (js.Function2[
    /* channel */ amqplibLib.amqplibMod.ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* channel */ amqplibLib.amqplibMod.ConfirmChannel, js.Promise[scala.Unit]])
}
