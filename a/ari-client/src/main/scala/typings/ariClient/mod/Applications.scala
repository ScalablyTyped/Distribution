package typings.ariClient.mod

import typings.ariClient.anon.ApplicationName
import typings.ariClient.anon.EventSource
import typings.ariClient.anon.Filter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Applications extends js.Object {
  def filter(params: Filter): js.Promise[Application] = js.native
  def filter(params: Filter, callback: js.Function2[/* err */ Error, /* application */ Application, Unit]): Unit = js.native
  def get(params: ApplicationName): js.Promise[Application] = js.native
  def get(
    params: ApplicationName,
    callback: js.Function2[/* err */ Error, /* application */ Application, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[Application]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* applications */ js.Array[Application], Unit]): Unit = js.native
  def subscribe(params: EventSource): js.Promise[Application] = js.native
  def subscribe(params: EventSource, callback: js.Function2[/* err */ Error, /* application */ Application, Unit]): Unit = js.native
  def unsubscribe(params: EventSource): js.Promise[Application] = js.native
  def unsubscribe(params: EventSource, callback: js.Function2[/* err */ Error, /* application */ Application, Unit]): Unit = js.native
}

