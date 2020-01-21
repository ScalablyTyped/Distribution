package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationResponse extends js.Object {
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationInfo: ApplicationInfo = null): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfo != null) __obj.updateDynamic("ApplicationInfo")(ApplicationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

