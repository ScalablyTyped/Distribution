package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationResponse extends js.Object {
  /**
    * Information about the application. 
    */
  var ApplicationInfo: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ApplicationInfo] = js.undefined
}

object UpdateApplicationResponse {
  @scala.inline
  def apply(ApplicationInfo: ApplicationInfo = null): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfo != null) __obj.updateDynamic("ApplicationInfo")(ApplicationInfo)
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
}

