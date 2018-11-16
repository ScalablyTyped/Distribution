package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var name: java.lang.String = js.native
  var presence: Presence = js.native
  def history(): scala.Unit = js.native
  def history(paramsOrCallback: RestPresenceHistoryParams): scala.Unit = js.native
  def history(paramsOrCallback: RestPresenceHistoryParams, callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def publish(messagesOrName: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback, callback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any, callback: errorCallback): scala.Unit = js.native
}

