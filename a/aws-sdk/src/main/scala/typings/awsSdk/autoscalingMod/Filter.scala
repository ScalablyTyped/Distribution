package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The name of the filter. The valid values are: auto-scaling-group, key, value, and propagate-at-launch.
    */
  var Name: js.UndefOr[XmlString] = js.native
  /**
    * One or more filter values. Filter values are case-sensitive.
    */
  var Values: js.UndefOr[typings.awsSdk.autoscalingMod.Values] = js.native
}

object Filter {
  @scala.inline
  def apply(Name: XmlString = null, Values: Values = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

