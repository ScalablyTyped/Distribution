package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportBundleRequest extends js.Object {
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId
  /**
    *  Developer desktop or target application platform. 
    */
  var platform: js.UndefOr[Platform] = js.undefined
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.undefined
}

object ExportBundleRequest {
  @scala.inline
  def apply(bundleId: BundleId, platform: Platform = null, projectId: ProjectId = null): ExportBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ExportBundleRequest]
  }
}

