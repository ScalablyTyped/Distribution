package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSchemaResponse extends js.Object {
  /**
    * The requested schema.
    */
  var schema: js.UndefOr[DatasetSchema] = js.native
}

object DescribeSchemaResponse {
  @scala.inline
  def apply(schema: DatasetSchema = null): DescribeSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchemaResponse]
  }
}

