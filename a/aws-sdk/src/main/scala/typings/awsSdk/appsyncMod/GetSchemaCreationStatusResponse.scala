package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSchemaCreationStatusResponse extends js.Object {
  /**
    * Detailed information about the status of the schema creation operation.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * The current state of the schema (PROCESSING, FAILED, SUCCESS, or NOT_APPLICABLE). When the schema is in the ACTIVE state, you can add data.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object GetSchemaCreationStatusResponse {
  @scala.inline
  def apply(details: String = null, status: SchemaStatus = null): GetSchemaCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaCreationStatusResponse]
  }
}

