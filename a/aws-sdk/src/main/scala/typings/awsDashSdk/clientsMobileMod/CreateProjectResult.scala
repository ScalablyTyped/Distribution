package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResult extends js.Object {
  /**
    *  Detailed information about the created AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.native
}

object CreateProjectResult {
  @scala.inline
  def apply(details: ProjectDetails = null): CreateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
}

