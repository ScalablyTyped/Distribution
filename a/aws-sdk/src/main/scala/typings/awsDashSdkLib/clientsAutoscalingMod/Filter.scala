package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The name of the filter. The valid values are: "auto-scaling-group", "key", "value", and "propagate-at-launch".
    */
  var Name: js.UndefOr[XmlString] = js.undefined
  /**
    * The value of the filter.
    */
  var Values: js.UndefOr[Values] = js.undefined
}

object Filter {
  @scala.inline
  def apply(Name: XmlString = null, Values: Values = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Filter]
  }
}

