package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateOverrides extends js.Object {
  /**
    * The instance type.  For information about available instance types, see Available Instance Types in the Amazon Elastic Compute Cloud User Guide. 
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
}

object LaunchTemplateOverrides {
  @scala.inline
  def apply(InstanceType: XmlStringMaxLen255 = null): LaunchTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    __obj.asInstanceOf[LaunchTemplateOverrides]
  }
}

