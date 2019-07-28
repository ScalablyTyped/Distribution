package typings.amqpDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpDashRpcMod {
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  type CallbackWithError = js.Function2[/* err */ js.Any, /* repeated */ js.Any, Unit]
}
