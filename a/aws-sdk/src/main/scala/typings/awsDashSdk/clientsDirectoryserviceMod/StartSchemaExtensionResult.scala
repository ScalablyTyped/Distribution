package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSchemaExtensionResult extends js.Object {
  /**
    * The identifier of the schema extension that will be applied.
    */
  var SchemaExtensionId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SchemaExtensionId] = js.undefined
}

object StartSchemaExtensionResult {
  @scala.inline
  def apply(SchemaExtensionId: SchemaExtensionId = null): StartSchemaExtensionResult = {
    val __obj = js.Dynamic.literal()
    if (SchemaExtensionId != null) __obj.updateDynamic("SchemaExtensionId")(SchemaExtensionId)
    __obj.asInstanceOf[StartSchemaExtensionResult]
  }
}

