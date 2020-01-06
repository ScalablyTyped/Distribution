package typings.awsDashSdk.clientsCodestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionOutput extends js.Object {
  /**
    * The connection details, such as status, owner, and provider type.
    */
  var Connection: js.UndefOr[typings.awsDashSdk.clientsCodestarconnectionsMod.Connection] = js.native
}

object GetConnectionOutput {
  @scala.inline
  def apply(Connection: Connection = null): GetConnectionOutput = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionOutput]
  }
}

