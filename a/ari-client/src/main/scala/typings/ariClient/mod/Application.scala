package typings.ariClient.mod

import typings.ariClient.anon.FilterIndexableObject
import typings.ariClient.anon.`0`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends Resource {
  var bridge_ids: String | js.Array[String] = js.native
  var channel_ids: String | js.Array[String] = js.native
  var device_names: String | js.Array[String] = js.native
  var endpoint_ids: String | js.Array[String] = js.native
  var events_allowed: IndexableObject | js.Array[IndexableObject] = js.native
  var events_disallowed: IndexableObject | js.Array[IndexableObject] = js.native
  /* Properties */
  var name: String = js.native
  def filter(): js.Promise[Application] = js.native
  def filter(callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  def filter(params: FilterIndexableObject): js.Promise[Application] = js.native
  def filter(
    params: FilterIndexableObject,
    callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]
  ): Unit = js.native
  def get(): js.Promise[Application] = js.native
  def get(callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Application]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* applications */ js.Array[this.type], Unit]): Unit = js.native
  def subscribe(params: `0`): js.Promise[Application] = js.native
  def subscribe(params: `0`, callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  def unsubscribe(params: `0`): js.Promise[Application] = js.native
  def unsubscribe(params: `0`, callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
}

