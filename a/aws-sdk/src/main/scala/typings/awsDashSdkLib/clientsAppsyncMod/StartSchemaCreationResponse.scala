package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSchemaCreationResponse extends js.Object {
  /**
    * The current state of the schema (PROCESSING, ACTIVE, or DELETING). When the schema is in the ACTIVE state, you can add data.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}

object StartSchemaCreationResponse {
  @scala.inline
  def apply(status: SchemaStatus = null): StartSchemaCreationResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaCreationResponse]
  }
}

