package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConnectionResponse extends js.Object {
  /**
    * The connection that is being deleted.
    */
  var Connection: js.UndefOr[typings.awsDashSdk.clientsDmsMod.Connection] = js.undefined
}

object DeleteConnectionResponse {
  @scala.inline
  def apply(Connection: Connection = null): DeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection)
    __obj.asInstanceOf[DeleteConnectionResponse]
  }
}

