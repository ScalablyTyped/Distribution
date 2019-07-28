package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartContinuousExportResponse extends js.Object {
  /**
    * The type of data collector used to gather this data (currently only offered for AGENT).
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /**
    * The unique ID assigned to this export.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
  /**
    * The name of the s3 bucket where the export data parquet files are stored.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * A dictionary which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[TimeStamp] = js.undefined
}

object StartContinuousExportResponse {
  @scala.inline
  def apply(
    dataSource: DataSource = null,
    exportId: ConfigurationsExportId = null,
    s3Bucket: S3Bucket = null,
    schemaStorageConfig: SchemaStorageConfig = null,
    startTime: TimeStamp = null
  ): StartContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (exportId != null) __obj.updateDynamic("exportId")(exportId)
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket)
    if (schemaStorageConfig != null) __obj.updateDynamic("schemaStorageConfig")(schemaStorageConfig)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[StartContinuousExportResponse]
  }
}

