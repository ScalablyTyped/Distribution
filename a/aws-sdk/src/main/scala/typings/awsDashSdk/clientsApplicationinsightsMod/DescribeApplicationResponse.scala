package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationResponse extends js.Object {
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ApplicationInfo] = js.undefined
}

object DescribeApplicationResponse {
  @scala.inline
  def apply(ApplicationInfo: ApplicationInfo = null): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfo != null) __obj.updateDynamic("ApplicationInfo")(ApplicationInfo)
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
}

