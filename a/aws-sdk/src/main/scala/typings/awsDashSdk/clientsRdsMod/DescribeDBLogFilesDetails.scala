package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBLogFilesDetails extends js.Object {
  /**
    * A POSIX timestamp when the last log entry was written.
    */
  var LastWritten: js.UndefOr[Long] = js.native
  /**
    * The name of the log file for the specified DB instance.
    */
  var LogFileName: js.UndefOr[String] = js.native
  /**
    * The size, in bytes, of the log file for the specified DB instance.
    */
  var Size: js.UndefOr[Long] = js.native
}

object DescribeDBLogFilesDetails {
  @scala.inline
  def apply(
    LastWritten: Int | scala.Double = null,
    LogFileName: String = null,
    Size: Int | scala.Double = null
  ): DescribeDBLogFilesDetails = {
    val __obj = js.Dynamic.literal()
    if (LastWritten != null) __obj.updateDynamic("LastWritten")(LastWritten.asInstanceOf[js.Any])
    if (LogFileName != null) __obj.updateDynamic("LogFileName")(LogFileName.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBLogFilesDetails]
  }
}

