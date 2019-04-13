package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectResult extends js.Object {
  /**
    *  Detailed information about the updated AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.undefined
}

object UpdateProjectResult {
  @scala.inline
  def apply(details: ProjectDetails = null): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[UpdateProjectResult]
  }
}

