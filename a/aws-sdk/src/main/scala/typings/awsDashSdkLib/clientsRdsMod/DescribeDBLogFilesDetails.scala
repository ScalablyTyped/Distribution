package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBLogFilesDetails extends js.Object {
  /**
    * A POSIX timestamp when the last log entry was written.
    */
  var LastWritten: js.UndefOr[Long] = js.undefined
  /**
    * The name of the log file for the specified DB instance.
    */
  var LogFileName: js.UndefOr[String] = js.undefined
  /**
    * The size, in bytes, of the log file for the specified DB instance.
    */
  var Size: js.UndefOr[Long] = js.undefined
}

object DescribeDBLogFilesDetails {
  @scala.inline
  def apply(
    LastWritten: js.UndefOr[Long] = js.undefined,
    LogFileName: String = null,
    Size: js.UndefOr[Long] = js.undefined
  ): DescribeDBLogFilesDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(LastWritten)) __obj.updateDynamic("LastWritten")(LastWritten)
    if (LogFileName != null) __obj.updateDynamic("LogFileName")(LogFileName)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[DescribeDBLogFilesDetails]
  }
}

