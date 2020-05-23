package typings.ariClient.mod

import typings.ariClient.anon.Body
import typings.ariClient.anon.From
import typings.ariClient.anon.Tech
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def get(): js.Promise[Endpoint] = js.native
  def get(callback: js.Function2[/* err */ Error, /* endpoint */ Endpoint, Unit]): Unit = js.native
  def get(params: typings.ariClient.anon.Resource): js.Promise[Endpoint] = js.native
  def get(
    params: typings.ariClient.anon.Resource,
    callback: js.Function2[/* err */ Error, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(params: Tech): js.Promise[js.Array[Endpoint]] = js.native
  def listByTech(params: Tech, callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def sendMessage(params: Body): js.Promise[Unit] = js.native
  def sendMessage(params: Body, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendMessageToEndpoint(params: From): js.Promise[Unit] = js.native
  def sendMessageToEndpoint(params: From, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

