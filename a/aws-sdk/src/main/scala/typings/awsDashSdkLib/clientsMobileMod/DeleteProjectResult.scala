package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectResult extends js.Object {
  /**
    *  Resources which were deleted. 
    */
  var deletedResources: js.UndefOr[Resources] = js.undefined
  /**
    *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
    */
  var orphanedResources: js.UndefOr[Resources] = js.undefined
}

object DeleteProjectResult {
  @scala.inline
  def apply(deletedResources: Resources = null, orphanedResources: Resources = null): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    if (deletedResources != null) __obj.updateDynamic("deletedResources")(deletedResources)
    if (orphanedResources != null) __obj.updateDynamic("orphanedResources")(orphanedResources)
    __obj.asInstanceOf[DeleteProjectResult]
  }
}

