package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDataSource extends js.Object {
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: SourceSchema = js.native
  /**
    * Identifies the S3 bucket and object that contains the reference data. A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the UpdateApplication operation to trigger reloading of data into your application. 
    */
  var S3ReferenceDataSource: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.S3ReferenceDataSource] = js.native
  /**
    * The name of the in-application table to create.
    */
  var TableName: InAppTableName = js.native
}

object ReferenceDataSource {
  @scala.inline
  def apply(
    ReferenceSchema: SourceSchema,
    TableName: InAppTableName,
    S3ReferenceDataSource: S3ReferenceDataSource = null
  ): ReferenceDataSource = {
    val __obj = js.Dynamic.literal(ReferenceSchema = ReferenceSchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (S3ReferenceDataSource != null) __obj.updateDynamic("S3ReferenceDataSource")(S3ReferenceDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSource]
  }
}

