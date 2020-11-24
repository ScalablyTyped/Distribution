package typings.amqpRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type CallbackWithError = js.Function2[/* err */ js.Any, /* repeated */ js.Any, scala.Unit]
}
