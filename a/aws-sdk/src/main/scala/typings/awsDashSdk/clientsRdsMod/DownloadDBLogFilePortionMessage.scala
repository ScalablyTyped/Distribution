package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadDBLogFilePortionMessage extends js.Object {
  /**
    * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  /**
    * The name of the log file to be downloaded.
    */
  var LogFileName: String
  /**
    * The pagination token provided in the previous request or "0". If the Marker parameter is specified the response includes only records beyond the marker until the end of the file or up to NumberOfLines.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The number of lines to download. If the number of lines specified results in a file over 1 MB in size, the file is truncated at 1 MB in size. If the NumberOfLines parameter is specified, then the block of lines returned can be from the beginning or the end of the log file, depending on the value of the Marker parameter.   If neither Marker or NumberOfLines are specified, the entire log file is returned up to a maximum of 10000 lines, starting with the most recent log entries first.   If NumberOfLines is specified and Marker is not specified, then the most recent lines from the end of the log file are returned.   If Marker is specified as "0", then the specified number of lines from the beginning of the log file are returned.   You can download the log file in blocks of lines by specifying the size of the block using the NumberOfLines parameter, and by specifying a value of "0" for the Marker parameter in your first request. Include the Marker value returned in the response as the Marker value for the next request, continuing until the AdditionalDataPending response element returns false.  
    */
  var NumberOfLines: js.UndefOr[Integer] = js.undefined
}

object DownloadDBLogFilePortionMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    LogFileName: String,
    Marker: String = null,
    NumberOfLines: js.UndefOr[Integer] = js.undefined
  ): DownloadDBLogFilePortionMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier, LogFileName = LogFileName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(NumberOfLines)) __obj.updateDynamic("NumberOfLines")(NumberOfLines)
    __obj.asInstanceOf[DownloadDBLogFilePortionMessage]
  }
}

