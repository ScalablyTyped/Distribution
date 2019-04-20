package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebuildWorkspacesRequest extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[AdditionalInfo] = js.undefined
  /**
    * The WorkSpace to rebuild. You can specify a single WorkSpace.
    */
  var RebuildWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.RebuildWorkspaceRequests
}

object RebuildWorkspacesRequest {
  @scala.inline
  def apply(RebuildWorkspaceRequests: RebuildWorkspaceRequests, AdditionalInfo: AdditionalInfo = null): RebuildWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebuildWorkspaceRequests = RebuildWorkspaceRequests)
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    __obj.asInstanceOf[RebuildWorkspacesRequest]
  }
}

