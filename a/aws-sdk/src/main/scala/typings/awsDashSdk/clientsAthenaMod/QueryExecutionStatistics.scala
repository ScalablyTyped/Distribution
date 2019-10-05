package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecutionStatistics extends js.Object {
  /**
    * The location and file name of a data manifest file. The manifest file is saved to the Athena query results location in Amazon S3. It tracks files that the query wrote to Amazon S3. If the query fails, the manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned files resulting from a failed query. For more information, see Working with Query Output Files in the Amazon Athena User Guide.
    */
  var DataManifestLocation: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes in the data that was queried.
    */
  var DataScannedInBytes: js.UndefOr[Long] = js.undefined
  /**
    * The number of milliseconds that the query took to execute.
    */
  var EngineExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
}

object QueryExecutionStatistics {
  @scala.inline
  def apply(
    DataManifestLocation: String = null,
    DataScannedInBytes: Int | Double = null,
    EngineExecutionTimeInMillis: Int | Double = null
  ): QueryExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    if (DataManifestLocation != null) __obj.updateDynamic("DataManifestLocation")(DataManifestLocation)
    if (DataScannedInBytes != null) __obj.updateDynamic("DataScannedInBytes")(DataScannedInBytes.asInstanceOf[js.Any])
    if (EngineExecutionTimeInMillis != null) __obj.updateDynamic("EngineExecutionTimeInMillis")(EngineExecutionTimeInMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionStatistics]
  }
}

