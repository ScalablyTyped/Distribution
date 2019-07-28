package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumesModificationsResult extends js.Object {
  /**
    * Token for pagination, null if there are no more results 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the volume modifications.
    */
  var VolumesModifications: js.UndefOr[VolumeModificationList] = js.undefined
}

object DescribeVolumesModificationsResult {
  @scala.inline
  def apply(NextToken: String = null, VolumesModifications: VolumeModificationList = null): DescribeVolumesModificationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VolumesModifications != null) __obj.updateDynamic("VolumesModifications")(VolumesModifications)
    __obj.asInstanceOf[DescribeVolumesModificationsResult]
  }
}

