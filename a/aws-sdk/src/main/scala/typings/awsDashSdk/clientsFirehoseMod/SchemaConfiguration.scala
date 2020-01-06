package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConfiguration extends js.Object {
  /**
    * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * Specifies the name of the AWS Glue database that contains the schema for the output data.
    */
  var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * If you don't specify an AWS Region, the default is the current Region.
    */
  var Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
    */
  var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to LATEST, Kinesis Data Firehose uses the most recent version. This means that any updates to the table are automatically picked up.
    */
  var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
}

object SchemaConfiguration {
  @scala.inline
  def apply(
    CatalogId: NonEmptyStringWithoutWhitespace = null,
    DatabaseName: NonEmptyStringWithoutWhitespace = null,
    Region: NonEmptyStringWithoutWhitespace = null,
    RoleARN: NonEmptyStringWithoutWhitespace = null,
    TableName: NonEmptyStringWithoutWhitespace = null,
    VersionId: NonEmptyStringWithoutWhitespace = null
  ): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfiguration]
  }
}

