package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDataSourceUpdate extends js.Object {
  /**
    * ID of the reference data source being updated. You can use the DescribeApplication operation to get this value.
    */
  var ReferenceId: Id = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. 
    */
  var ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.native
  /**
    * Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
    */
  var S3ReferenceDataSourceUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.S3ReferenceDataSourceUpdate] = js.native
  /**
    * In-application table name that is created by this update.
    */
  var TableNameUpdate: js.UndefOr[InAppTableName] = js.native
}

object ReferenceDataSourceUpdate {
  @scala.inline
  def apply(
    ReferenceId: Id,
    ReferenceSchemaUpdate: SourceSchema = null,
    S3ReferenceDataSourceUpdate: S3ReferenceDataSourceUpdate = null,
    TableNameUpdate: InAppTableName = null
  ): ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId.asInstanceOf[js.Any])
    if (ReferenceSchemaUpdate != null) __obj.updateDynamic("ReferenceSchemaUpdate")(ReferenceSchemaUpdate.asInstanceOf[js.Any])
    if (S3ReferenceDataSourceUpdate != null) __obj.updateDynamic("S3ReferenceDataSourceUpdate")(S3ReferenceDataSourceUpdate.asInstanceOf[js.Any])
    if (TableNameUpdate != null) __obj.updateDynamic("TableNameUpdate")(TableNameUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSourceUpdate]
  }
}

