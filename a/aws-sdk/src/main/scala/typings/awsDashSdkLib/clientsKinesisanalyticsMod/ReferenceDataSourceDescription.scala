package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDataSourceDescription extends js.Object {
  /**
    * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference data source to your application using the AddApplicationReferenceDataSource operation.
    */
  var ReferenceId: Id
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined
  /**
    * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application reference table.
    */
  var S3ReferenceDataSourceDescription: awsDashSdkLib.clientsKinesisanalyticsMod.S3ReferenceDataSourceDescription
  /**
    * The in-application table name created by the specific reference data source configuration.
    */
  var TableName: InAppTableName
}

object ReferenceDataSourceDescription {
  @scala.inline
  def apply(
    ReferenceId: Id,
    S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription,
    TableName: InAppTableName,
    ReferenceSchema: SourceSchema = null
  ): ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId, S3ReferenceDataSourceDescription = S3ReferenceDataSourceDescription, TableName = TableName)
    if (ReferenceSchema != null) __obj.updateDynamic("ReferenceSchema")(ReferenceSchema)
    __obj.asInstanceOf[ReferenceDataSourceDescription]
  }
}

