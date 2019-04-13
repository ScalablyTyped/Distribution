package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadDBLogFilePortionDetails extends js.Object {
  /**
    * Boolean value that if true, indicates there is more data to be downloaded.
    */
  var AdditionalDataPending: js.UndefOr[Boolean] = js.undefined
  /**
    * Entries from the specified log file.
    */
  var LogFileData: js.UndefOr[String] = js.undefined
  /**
    * A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DownloadDBLogFilePortionDetails {
  @scala.inline
  def apply(
    AdditionalDataPending: js.UndefOr[Boolean] = js.undefined,
    LogFileData: String = null,
    Marker: String = null
  ): DownloadDBLogFilePortionDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AdditionalDataPending)) __obj.updateDynamic("AdditionalDataPending")(AdditionalDataPending)
    if (LogFileData != null) __obj.updateDynamic("LogFileData")(LogFileData)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DownloadDBLogFilePortionDetails]
  }
}

