package typings.asyncDashEventemitter.asyncDashEventemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An EventEmitter that supports serial execution of asynchronous event listeners.
  * It also supports event listeners without callbacks (synchronous), as well as
  * interrupting the call-chain (similar to the DOM's e.stopPropagation()).
  */
@JSImport("async-eventemitter", JSImport.Namespace)
@js.native
class ^[T /* <: EventMap */] () extends AsyncEventEmitter[T]

