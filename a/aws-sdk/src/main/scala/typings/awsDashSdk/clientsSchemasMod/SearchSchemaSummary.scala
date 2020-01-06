package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemaSummary extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[__string] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[__string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[__string] = js.native
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[__listOfSearchSchemaVersionSummary] = js.native
}

object SearchSchemaSummary {
  @scala.inline
  def apply(
    RegistryName: __string = null,
    SchemaArn: __string = null,
    SchemaName: __string = null,
    SchemaVersions: __listOfSearchSchemaVersionSummary = null
  ): SearchSchemaSummary = {
    val __obj = js.Dynamic.literal()
    if (RegistryName != null) __obj.updateDynamic("RegistryName")(RegistryName.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (SchemaVersions != null) __obj.updateDynamic("SchemaVersions")(SchemaVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemaSummary]
  }
}

