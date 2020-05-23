package typings.ariClient.mod

import typings.ariClient.anon.App
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def eventWebsocket(params: App): js.Promise[Message] = js.native
  /* Methods */
  def eventWebsocket(params: App, callback: js.Function2[/* err */ Error, /* message */ Message, Unit]): Unit = js.native
  def userEvent(params: typings.ariClient.anon.Application): js.Promise[Unit] = js.native
  def userEvent(params: typings.ariClient.anon.Application, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

