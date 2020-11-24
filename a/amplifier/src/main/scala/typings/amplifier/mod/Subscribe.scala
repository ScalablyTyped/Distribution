package typings.amplifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribe extends js.Object {
  
  /***
    * Subscribe to a message.
    * topic: Name of the message to subscribe to.
    * callback: Function to invoke when the message is published.
    * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
    */
  def apply(topic: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def apply(topic: String, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
  /***
    * Subscribe to a message.
    * topic: Name of the message to subscribe to.
    * context: What this will be when the callback is invoked.
    * callback: Function to invoke when the message is published.
    * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
    */
  def apply(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def apply(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
}
