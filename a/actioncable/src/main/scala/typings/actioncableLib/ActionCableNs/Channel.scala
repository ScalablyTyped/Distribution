package typings
package actioncableLib.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Channel extends js.Object {
  def perform(action: java.lang.String, data: js.Object): scala.Unit
  def send(data: js.Any): scala.Boolean
  def unsubscribe(): scala.Unit
}

