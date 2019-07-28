package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestConnectionResponse extends js.Object {
  /**
    * The connection tested.
    */
  var Connection: js.UndefOr[typings.awsDashSdk.clientsDmsMod.Connection] = js.undefined
}

object TestConnectionResponse {
  @scala.inline
  def apply(Connection: Connection = null): TestConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection)
    __obj.asInstanceOf[TestConnectionResponse]
  }
}

