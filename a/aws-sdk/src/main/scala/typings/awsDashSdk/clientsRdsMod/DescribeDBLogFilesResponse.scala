package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBLogFilesResponse extends js.Object {
  /**
    * The DB log files returned.
    */
  var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined
  /**
    * A pagination token that can be used in a subsequent DescribeDBLogFiles request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DescribeDBLogFilesResponse {
  @scala.inline
  def apply(DescribeDBLogFiles: DescribeDBLogFilesList = null, Marker: String = null): DescribeDBLogFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (DescribeDBLogFiles != null) __obj.updateDynamic("DescribeDBLogFiles")(DescribeDBLogFiles)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeDBLogFilesResponse]
  }
}

