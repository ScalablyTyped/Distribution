package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectoryLimitsResult extends js.Object {
  /**
    * A DirectoryLimits object that contains the directory limits for the current region.
    */
  var DirectoryLimits: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryLimits] = js.undefined
}

object GetDirectoryLimitsResult {
  @scala.inline
  def apply(DirectoryLimits: DirectoryLimits = null): GetDirectoryLimitsResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryLimits != null) __obj.updateDynamic("DirectoryLimits")(DirectoryLimits)
    __obj.asInstanceOf[GetDirectoryLimitsResult]
  }
}

