package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscription extends js.Object {
  var active: scala.Boolean = js.native
  @JSName("handler")
  var handler_Original: SubscribeHandler = js.native
  var id: scala.Double = js.native
  var options: ISubscribeOptions = js.native
  var session: Session = js.native
  var topic: java.lang.String = js.native
  def handler(): scala.Unit = js.native
  def handler(args: js.Any): scala.Unit = js.native
  def handler(args: js.Any, kwargs: js.Any): scala.Unit = js.native
  def handler(args: js.Any, kwargs: js.Any, details: IEvent): scala.Unit = js.native
  def handler(args: js.Array[_]): scala.Unit = js.native
  def handler(args: js.Array[_], kwargs: js.Any): scala.Unit = js.native
  def handler(args: js.Array[_], kwargs: js.Any, details: IEvent): scala.Unit = js.native
  def unsubscribe(): whenLib.WhenNs.Promise[_] = js.native
}

