package typings.ariClient.mod

import typings.ariClient.anon.Body
import typings.ariClient.anon.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends Resource {
  var channel_ids: String | js.Array[String] = js.native
  var resource: String = js.native
  var state: js.UndefOr[String] = js.native
  /* Properties */
  var technology: String = js.native
  def get(): js.Promise[Endpoint] = js.native
  def get(callback: js.Function2[/* err */ Error, /* endpoint */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[this.type], Unit]): Unit = js.native
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[this.type], Unit]): Unit = js.native
  def sendMessage(params: Body): js.Promise[Unit] = js.native
  def sendMessage(params: Body, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendMessageToEndpoint(params: Variables): js.Promise[Unit] = js.native
  def sendMessageToEndpoint(params: Variables, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

