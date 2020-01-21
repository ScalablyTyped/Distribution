package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationResponse extends js.Object {
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}

object DescribeApplicationResponse {
  @scala.inline
  def apply(ApplicationInfo: ApplicationInfo = null): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfo != null) __obj.updateDynamic("ApplicationInfo")(ApplicationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
}

