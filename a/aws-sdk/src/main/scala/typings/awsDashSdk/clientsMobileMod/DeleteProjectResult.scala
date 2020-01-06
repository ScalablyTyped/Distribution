package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectResult extends js.Object {
  /**
    *  Resources which were deleted. 
    */
  var deletedResources: js.UndefOr[Resources] = js.native
  /**
    *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
    */
  var orphanedResources: js.UndefOr[Resources] = js.native
}

object DeleteProjectResult {
  @scala.inline
  def apply(deletedResources: Resources = null, orphanedResources: Resources = null): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    if (deletedResources != null) __obj.updateDynamic("deletedResources")(deletedResources.asInstanceOf[js.Any])
    if (orphanedResources != null) __obj.updateDynamic("orphanedResources")(orphanedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectResult]
  }
}

