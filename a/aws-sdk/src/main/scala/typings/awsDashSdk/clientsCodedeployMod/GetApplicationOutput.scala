package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationOutput extends js.Object {
  /**
    * Information about the application.
    */
  var application: js.UndefOr[ApplicationInfo] = js.undefined
}

object GetApplicationOutput {
  @scala.inline
  def apply(application: ApplicationInfo = null): GetApplicationOutput = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application)
    __obj.asInstanceOf[GetApplicationOutput]
  }
}

