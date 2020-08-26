package typings.autobahn.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscription extends js.Object {
  var active: Boolean = js.native
  @JSName("handler")
  var handler_Original: SubscribeHandler = js.native
  var id: Double = js.native
  var options: ISubscribeOptions = js.native
  var session: Session = js.native
  var topic: String = js.native
  def handler(): Unit = js.native
  def handler(args: js.UndefOr[scala.Nothing], kwargs: js.UndefOr[scala.Nothing], details: IEvent): Unit = js.native
  def handler(args: js.UndefOr[scala.Nothing], kwargs: js.Any): Unit = js.native
  def handler(args: js.UndefOr[scala.Nothing], kwargs: js.Any, details: IEvent): Unit = js.native
  def handler(args: js.Any): Unit = js.native
  def handler(args: js.Any, kwargs: js.UndefOr[scala.Nothing], details: IEvent): Unit = js.native
  def handler(args: js.Any, kwargs: js.Any): Unit = js.native
  def handler(args: js.Any, kwargs: js.Any, details: IEvent): Unit = js.native
  def handler(args: js.Array[_]): Unit = js.native
  def handler(args: js.Array[_], kwargs: js.UndefOr[scala.Nothing], details: IEvent): Unit = js.native
  def handler(args: js.Array[_], kwargs: js.Any): Unit = js.native
  def handler(args: js.Array[_], kwargs: js.Any, details: IEvent): Unit = js.native
  def unsubscribe(): Promise[_] = js.native
}

