package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDimension extends js.Object {
  /**
    * The dimension name.
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * The dimension value.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object MetricDimension {
  @scala.inline
  def apply(Key: String = null, Value: String = null): MetricDimension = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[MetricDimension]
  }
}

