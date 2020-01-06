package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBLogFilesMessage extends js.Object {
  /**
    * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * Filters the available log files for files written since the specified date, in POSIX timestamp format with milliseconds.
    */
  var FileLastWritten: js.UndefOr[Long] = js.native
  /**
    * Filters the available log files for files larger than the specified size.
    */
  var FileSize: js.UndefOr[Long] = js.native
  /**
    * Filters the available log files for log file names that contain the specified string.
    */
  var FilenameContains: js.UndefOr[String] = js.native
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The pagination token provided in the previous request. If this parameter is specified the response includes only records beyond the marker, up to MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeDBLogFilesMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    FileLastWritten: Int | scala.Double = null,
    FileSize: Int | scala.Double = null,
    FilenameContains: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeDBLogFilesMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    if (FileLastWritten != null) __obj.updateDynamic("FileLastWritten")(FileLastWritten.asInstanceOf[js.Any])
    if (FileSize != null) __obj.updateDynamic("FileSize")(FileSize.asInstanceOf[js.Any])
    if (FilenameContains != null) __obj.updateDynamic("FilenameContains")(FilenameContains.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBLogFilesMessage]
  }
}

