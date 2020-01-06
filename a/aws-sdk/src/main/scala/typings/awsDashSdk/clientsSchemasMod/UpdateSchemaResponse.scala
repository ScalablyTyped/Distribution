package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSchemaResponse extends js.Object {
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[__string] = js.native
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[__timestampIso8601] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[__string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[__string] = js.native
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[__string] = js.native
  var Tags: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Tags] = js.native
  /**
    * The type of the schema.
    */
  var Type: js.UndefOr[__string] = js.native
  /**
    * The date the schema version was created.
    */
  var VersionCreatedDate: js.UndefOr[__timestampIso8601] = js.native
}

object UpdateSchemaResponse {
  @scala.inline
  def apply(
    Description: __string = null,
    LastModified: __timestampIso8601 = null,
    SchemaArn: __string = null,
    SchemaName: __string = null,
    SchemaVersion: __string = null,
    Tags: Tags = null,
    Type: __string = null,
    VersionCreatedDate: __timestampIso8601 = null
  ): UpdateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VersionCreatedDate != null) __obj.updateDynamic("VersionCreatedDate")(VersionCreatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaResponse]
  }
}

