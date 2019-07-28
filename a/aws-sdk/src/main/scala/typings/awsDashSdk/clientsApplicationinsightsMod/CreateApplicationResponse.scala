package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationResponse extends js.Object {
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ApplicationInfo] = js.undefined
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationInfo: ApplicationInfo = null): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfo != null) __obj.updateDynamic("ApplicationInfo")(ApplicationInfo)
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

