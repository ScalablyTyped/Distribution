package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationOutput extends js.Object {
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.native
}

object CreateApplicationOutput {
  @scala.inline
  def apply(applicationId: ApplicationId = null): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationOutput]
  }
}

