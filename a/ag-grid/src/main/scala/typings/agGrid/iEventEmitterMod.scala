package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iEventEmitter", JSImport.Namespace)
@js.native
object iEventEmitterMod extends js.Object {
  @js.native
  trait IEventEmitter extends js.Object {
    def addEventListener(eventType: String, listener: js.Function): Unit = js.native
    def addEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
    def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
    def removeEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
  }
  
}

