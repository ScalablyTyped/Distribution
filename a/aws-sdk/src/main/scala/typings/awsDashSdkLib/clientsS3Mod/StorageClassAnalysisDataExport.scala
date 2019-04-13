package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageClassAnalysisDataExport extends js.Object {
  /**
    * The place to store the data for an analysis.
    */
  var Destination: AnalyticsExportDestination
  /**
    * The version of the output schema to use when exporting data. Must be V_1.
    */
  var OutputSchemaVersion: StorageClassAnalysisSchemaVersion
}

object StorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: StorageClassAnalysisSchemaVersion): StorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination, OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageClassAnalysisDataExport]
  }
}

