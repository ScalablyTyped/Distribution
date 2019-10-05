package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummarizedCounter extends js.Object {
  /**
    * The average value of the counter for a specified time period.
    */
  var Average: js.UndefOr[Double] = js.undefined
  /**
    * The maximum value of the counter for a specified time period.
    */
  var Max: js.UndefOr[Double] = js.undefined
  /**
    * The number of counters for a specified time period.
    */
  var N: js.UndefOr[Integer] = js.undefined
  /**
    * The counter name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The total of counter values for a specified time period.
    */
  var Sum: js.UndefOr[Double] = js.undefined
  /**
    * The unit of the counters.
    */
  var Unit: js.UndefOr[String] = js.undefined
}

object SummarizedCounter {
  @scala.inline
  def apply(
    Average: Int | scala.Double = null,
    Max: Int | scala.Double = null,
    N: Int | scala.Double = null,
    Name: String = null,
    Sum: Int | scala.Double = null,
    Unit: String = null
  ): SummarizedCounter = {
    val __obj = js.Dynamic.literal()
    if (Average != null) __obj.updateDynamic("Average")(Average.asInstanceOf[js.Any])
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Sum != null) __obj.updateDynamic("Sum")(Sum.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[SummarizedCounter]
  }
}

