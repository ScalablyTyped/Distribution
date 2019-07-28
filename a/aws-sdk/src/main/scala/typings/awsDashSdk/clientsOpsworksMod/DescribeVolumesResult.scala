package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumesResult extends js.Object {
  /**
    * An array of volume IDs.
    */
  var Volumes: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Volumes] = js.undefined
}

object DescribeVolumesResult {
  @scala.inline
  def apply(Volumes: Volumes = null): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes)
    __obj.asInstanceOf[DescribeVolumesResult]
  }
}

