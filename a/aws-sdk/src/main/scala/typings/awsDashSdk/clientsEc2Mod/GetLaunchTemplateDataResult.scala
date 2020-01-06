package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateDataResult extends js.Object {
  /**
    * The instance data.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.native
}

object GetLaunchTemplateDataResult {
  @scala.inline
  def apply(LaunchTemplateData: ResponseLaunchTemplateData = null): GetLaunchTemplateDataResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateData != null) __obj.updateDynamic("LaunchTemplateData")(LaunchTemplateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateDataResult]
  }
}

