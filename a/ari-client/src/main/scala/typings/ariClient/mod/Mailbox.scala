package typings.ariClient.mod

import typings.ariClient.anon.OldMessages
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailbox extends Resource {
  /* Properties */
  var name: String = js.native
  var new_messages: Double = js.native
  var old_messages: Double = js.native
  def delete(): js.Promise[Unit] = js.native
  def delete(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def get(): js.Promise[Mailbox] = js.native
  def get(callback: js.Function2[/* err */ Error, /* mailbox */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Mailbox]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* mailboxs */ js.Array[this.type], Unit]): Unit = js.native
  def update(params: OldMessages): js.Promise[Unit] = js.native
  def update(params: OldMessages, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

