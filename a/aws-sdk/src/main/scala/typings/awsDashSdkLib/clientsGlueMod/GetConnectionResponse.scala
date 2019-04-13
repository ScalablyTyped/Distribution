package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectionResponse extends js.Object {
  /**
    * The requested connection definition.
    */
  var Connection: js.UndefOr[Connection] = js.undefined
}

object GetConnectionResponse {
  @scala.inline
  def apply(Connection: Connection = null): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection)
    __obj.asInstanceOf[GetConnectionResponse]
  }
}

