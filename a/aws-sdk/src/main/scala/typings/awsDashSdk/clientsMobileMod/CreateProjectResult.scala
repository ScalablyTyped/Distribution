package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectResult extends js.Object {
  /**
    *  Detailed information about the created AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.undefined
}

object CreateProjectResult {
  @scala.inline
  def apply(details: ProjectDetails = null): CreateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[CreateProjectResult]
  }
}

