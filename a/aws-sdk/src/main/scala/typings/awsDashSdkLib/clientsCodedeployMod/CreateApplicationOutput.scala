package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationOutput extends js.Object {
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.undefined
}

object CreateApplicationOutput {
  @scala.inline
  def apply(applicationId: ApplicationId = null): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId)
    __obj.asInstanceOf[CreateApplicationOutput]
  }
}

