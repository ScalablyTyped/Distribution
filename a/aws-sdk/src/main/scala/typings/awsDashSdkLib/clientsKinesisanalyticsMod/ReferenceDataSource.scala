package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDataSource extends js.Object {
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: SourceSchema
  /**
    * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the UpdateApplication operation to trigger reloading of data into your application. 
    */
  var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined
  /**
    * Name of the in-application table to create.
    */
  var TableName: InAppTableName
}

object ReferenceDataSource {
  @scala.inline
  def apply(
    ReferenceSchema: SourceSchema,
    TableName: InAppTableName,
    S3ReferenceDataSource: S3ReferenceDataSource = null
  ): ReferenceDataSource = {
    val __obj = js.Dynamic.literal(ReferenceSchema = ReferenceSchema, TableName = TableName)
    if (S3ReferenceDataSource != null) __obj.updateDynamic("S3ReferenceDataSource")(S3ReferenceDataSource)
    __obj.asInstanceOf[ReferenceDataSource]
  }
}

